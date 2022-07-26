import java.util.Random;
import java.util.ArrayList;

public class SpielAutomatModel{
    //Attributliste
    //Zufallsgenerator einbauen
    private Random zufgen;
    private int Guthaben;
    private int spielnr;
    //private int[] gewinnSpeicher;
    private ArrayList<Integer> gewinnSpeicher2;
    private int[] farbnr;
    private String Statusmeldung;

    //Konstruktor
    public SpielAutomatModel(){
        zufgen = new Random();
        Guthaben = 1000;
        //gewinnSpeicher = new int[100];
        gewinnSpeicher2 = new ArrayList<Integer>();   
        farbnr = new int[3];
        farbnr[0] = 1;
        farbnr[1] = 2;
        farbnr[2] = 3;        
    }

    //Methoden
    public void einzahlen(int betrag){
        if(betrag > 0){ 
            Guthaben = Guthaben + betrag;    
            setStatusmeldung("Es wurden " + betrag + " EUR eingezahlt. ");
            //guthabenlabel.setText("Guthaben: " + Guthaben);
        }else{
            setStatusmeldung("Betrag muss positiv sein!");
        }
    }

    /** Gibt entweder 10 zurück (bei drei gleichen Farben)
     * oder sie gibt 2 zurück (bei zwei gleichen Farben)
     * oder sie gibt 0 zurück (drei verschiedene Farben)
     **/
    public int ermittleGewinn(){
        //hole dir die Farben der drei Vollkreise
        //und speichere sie in Variablen
        //dann Fallunterscheidung(en)
        //int w1 = walze1.getFarbe();
        //int w2 = walze2.getFarbe();
        //int w3 = walze3.getFarbe();        
        int w1 = farbnr[0];
        int w2 = farbnr[1];
        int w3 = farbnr[2];        
        //Prüfe, ob drei gleiche Farben
        if( (w1==w2) && (w2==w3) ){
            //Guthaben = Guthaben + 10;
            return 10;
        }else{
            //Prüfe, ob zwei gleiche Farben
            if( (w1==w2) || (w1==w3) || (w2==w3)){
                return 2;
            }else{
                return 0;
            }
        }
        //return 0;
    }

    public void spiele(){
        if(Guthaben > 0){
            Guthaben = Guthaben - 1;
            //setzeFarbmuster(zufgen.nextInt(9),zufgen.nextInt(9),zufgen.nextInt(9));
            farbnr[0] = zufgen.nextInt(9);
            farbnr[1] = zufgen.nextInt(9);
            farbnr[2] = zufgen.nextInt(9); 
            // Hier Gewinnspeicher mit Gewinn füllen
            //gewinnSpeicher[spielnr] = ermittleGewinn();
            gewinnSpeicher2.add(ermittleGewinn());            
            spielnr++;
            Guthaben = Guthaben + ermittleGewinn();
            setStatusmeldung("Sie haben " + ermittleGewinn() + " EUR gewonnen.");
        }else{
            setStatusmeldung("Alles verzockt. Wirf mehr Geld ein.");
        }
    }

    public int summeAuszahlungen(){
        int summe = 0;
        for(int i=0; i<gewinnSpeicher2.size(); i++){
            summe = summe + gewinnSpeicher2.get(i);
        }     
        return summe;
    }

    public double berechneMittel(){
        //Bei der Rechnung summeAuszahlungen / spielnr können
        //Dezimalzahlen entstehen. Java rechnen 5/3=1, deshalb
        //explizite Typumwandlung
        return ((double)summeAuszahlungen()) / ((double)spielnr);
    }

    public int zaehleHauptgewinne(){ 
        int hg = 0;
        //durchs Array laufen und Hauptgewinne zählen
        for(int i=0; i<spielnr; i++){
            if(gewinnSpeicher2.get(i) == 10){
                hg++;
                //hg = hg +1;
            }
        }     
        return hg;
    }

    //wiederholt den spielvorgang n mal
    public void spiele(int n){ 
        for(int i=1 ;i<=n;i++){
            spiele();
        }
    }

    //wiederholt den spielvorgang n mal
    public void spielen(int n){ 
        while(n>0){
            n--;
            spiele();
        }
    }    

    public void spieleSelbst(){
        while(Guthaben > 0){
            spiele();
        }
    }

    //Spiele automatisch, bis 10 EUR gewonnen worden sind
    public void gewinneSicher(){
        int anzahl = 0;
        //Wiederholung mit Endbedingung
        do{
            //Sequenz (wird wiederholt, wenn die Bedingung wahr ist)
            spiele();
            anzahl++; //anzahl = anzahl + 1;
        }while((ermittleGewinn() != 10) && (Guthaben > 0));
        setStatusmeldung("Es wurden " + anzahl + " Spielvorgänge benötigt!");
    }    

    private void setStatusmeldung(String s){
        //label.setText(s);
        //System.out.println(s);
        Statusmeldung = s;
    }    

    public String getStatusmeldung(){
        return Statusmeldung;
    }

    public int getGuthaben(){
        return Guthaben;
    }

    public int getFarbnr(int nr){
        return farbnr[nr];
    }
}
