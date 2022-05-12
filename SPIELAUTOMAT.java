import java.util.Random;

public class SPIELAUTOMAT{
    //Attributliste
    private WALZE walze1;
    private WALZE walze2;
    private WALZE walze3;
    //Zufallsgenerator einbauen
    private Random zufgen;
    private int Guthaben;
    private int spielnr;
    private int[] gewinnSpeicher;

    ///Konstruktor der Klasse AMPEL
    public SPIELAUTOMAT(){
        walze1 = new WALZE(100,100,100,4);
        walze2 = new WALZE(200,100,100,6);
        walze3 = new WALZE(300,100,100,2);
        zufgen = new Random();
        Guthaben = 1000;
        gewinnSpeicher = new int[1000000];
    }    

    //Methoden
    private void setzeFarbmuster(int f1, int f2, int f3){
        walze1.kreis.farbnr = f1;
        //walze1.umfaerben(f1);
        walze2.umfaerben(f2);
        walze3.umfaerben(f3);        
    }

    public void einzahlen(int betrag){
        if(betrag > 0){ 
            Guthaben = Guthaben + betrag;    
            System.out.println("Guthaben: " + Guthaben);
        }else{
            System.out.println("Betrag muss positiv sein!");
        }
    }

    /** Gibt entweder 10 zurück (bei drei gleichen Farben)
     * oder sie gibt 2 zurück (bei zwei gleichen Farben)
     * oder sie gibt 0 zurück (drei verschiedene Farben)
     **/
    private int ermittleGewinn(){
        //hole dir die Farben der drei Vollkreise
        //und speichere sie in Variablen
        //dann Fallunterscheidung(en)
        int w1 = walze1.getFarbe();
        int w2 = walze2.getFarbe();
        int w3 = walze3.getFarbe();        
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
            setzeFarbmuster(zufgen.nextInt(9),zufgen.nextInt(9),zufgen.nextInt(9));
            // Hier Gewinnspeicher mit Gewinn füllen
            gewinnSpeicher[spielnr] = ermittleGewinn();
            spielnr++;
            System.out.print(spielnr + ". ");
            Guthaben = Guthaben + ermittleGewinn();
            //System.out.println("Guthaben: " + Guthaben);
            schreibeWerte();
        }else{
            System.out.println("Alles verzockt. Wirf mehr Geld ein.");
        }
    }
    
    public int summeAuszahlungen(){
        int summe = 0;
        for(int i=0; i<gewinnSpeicher.length; i++){
                summe = summe + gewinnSpeicher[i];
        }     
        return summe;
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
        System.out.println("Es wurden " + anzahl + " Spielvorgänge benötigt!");
    }    

    //Gibt die FarbNr, Gewinn, Guthaben aus
    //Ausgabe: 664 Gewinn: 2 Guthaben: 4
    private void schreibeWerte(){ 
        int w1 = walze1.getFarbe();
        int w2 = walze2.getFarbe();
        int w3 = walze3.getFarbe();     
        System.out.println("FarbNr: " + w1 + w2 + w3 + " Gewinn: " + ermittleGewinn() + " Guthaben: " +Guthaben);
    }
}
