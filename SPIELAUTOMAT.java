import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;

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
    private JButton spieleknopf;
    private JButton aufladenknopf;
    private JButton grossergewinnknopf;    
    private JLabel label;

    ///Konstruktor der Klasse AMPEL
    public SPIELAUTOMAT(){
        walze1 = new WALZE(100,100,100,4);
        walze2 = new WALZE(200,100,100,6);
        walze3 = new WALZE(300,100,100,2);
        zufgen = new Random();
        Guthaben = 1000;
        gewinnSpeicher = new int[1000000];
        //JButton erzeugen
        spieleknopf = new JButton("Spiele");
        aufladenknopf = new JButton("Aufladen");
        grossergewinnknopf = new JButton("gewinne Sicher");  
        label = new JLabel("Guthaben: " + Guthaben);
        //JButton dem ZEICHENFENSTER hinzufügen
        ZEICHENFENSTER.gibFenster().komponenteHinzufuegen(spieleknopf,"rechts");
        ZEICHENFENSTER.gibFenster().komponenteHinzufuegen(aufladenknopf,"rechts");
        ZEICHENFENSTER.gibFenster().komponenteHinzufuegen(grossergewinnknopf,"rechts");        
        ZEICHENFENSTER.gibFenster().komponenteHinzufuegen(label,"unten");        
        //JButton mit Aktion versehen: spiele() aufrufen
        spieleknopf.addActionListener(e -> spiele());
        aufladenknopf.addActionListener(e -> einzahlen(10));
        grossergewinnknopf.addActionListener(e -> gewinneSicher());        
    }    

    //Methoden
    private void setzeFarbmuster(int f1, int f2, int f3){
        walze1.umfaerben(f1);
        walze2.umfaerben(f2);
        walze3.umfaerben(f3);        
    }

    public void einzahlen(int betrag){
        if(betrag > 0){ 
            Guthaben = Guthaben + betrag;    
            ausgeben("Guthaben: " + Guthaben);
        }else{
            ausgeben("Betrag muss positiv sein!");
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
            ausgeben(spielnr + ". ");
            Guthaben = Guthaben + ermittleGewinn();
            //ausgeben("Guthaben: " + Guthaben);
            schreibeWerte();
        }else{
            ausgeben("Alles verzockt. Wirf mehr Geld ein.");
        }
    }
    
    public int summeAuszahlungen(){
        int summe = 0;
        for(int i=0; i<gewinnSpeicher.length; i++){
                summe = summe + gewinnSpeicher[i];
        }     
        return summe;
    }
    
    public double berechneMittel(){
        //Bei der Rechnung summeAuszahlungen / spielnr können
        //Dezimalzahlen entstehen. Java rechnen 5/3=1, deshalb
        //explizite Typumwandlung
        return ((double)summeAuszahlungen()) / ((double)spielnr);
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
        ausgeben("Es wurden " + anzahl + " Spielvorgänge benötigt!");
    }    

    //Gibt die FarbNr, Gewinn, Guthaben aus
    //Ausgabe: 664 Gewinn: 2 Guthaben: 4
    private void schreibeWerte(){ 
        int w1 = walze1.getFarbe();
        int w2 = walze2.getFarbe();
        int w3 = walze3.getFarbe();     
        //ausgeben("FarbNr: " + w1 + w2 + w3 + " Gewinn: " + ermittleGewinn() + " Guthaben: " +Guthaben);
        ausgeben(" Guthaben: " +Guthaben);        
    }
    
    private void ausgeben(String s){
        label.setText(s);
        System.out.println(s);
    }
}
