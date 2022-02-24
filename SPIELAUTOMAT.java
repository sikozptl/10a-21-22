import java.util.Random;

public class SPIELAUTOMAT{
    //Attributliste
    private WALZE walze1;
    private WALZE walze2;
    private WALZE walze3;
    //Zufallsgenerator einbauen
    private Random zufgen;
    private int Guthaben;

    ///Konstruktor der Klasse AMPEL
    public SPIELAUTOMAT(){
        walze1 = new WALZE(100,100,100,4);
        walze2 = new WALZE(200,100,100,6);
        walze3 = new WALZE(300,100,100,2);
        zufgen = new Random();
        Guthaben = 5;
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
            System.out.println("Guthaben: " + Guthaben);
        }else{
            System.out.println("Betrag muss positiv sein!");
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
        int w1 = walze1.getFarbe();
        return 0;
    }

    public void spiele(){
        if(Guthaben > 0){
            setzeFarbmuster(zufgen.nextInt(9),zufgen.nextInt(9),zufgen.nextInt(9));
            Guthaben = Guthaben - 1;
            System.out.println("Guthaben: " + Guthaben);
        }else{
            System.out.println("Alles verzockt. Wirf mehr Geld ein.");
        }
    }
}
