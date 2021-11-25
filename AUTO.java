public class AUTO extends KFZ{

    //Konstruktor 1
    public AUTO(){
        //Ruft den übergeordneten Konstruktor auf
        //d.h. wir verwenden den Konstruktor in KFZ
        super();
    }    
    
    //Konstruktor 2
    public AUTO(String Herstellerneu, String Farbeneu, double HubraumNeu){
        //Verwende den 2. KFZ Konstruktor
        super(Herstellerneu, Farbeneu, HubraumNeu);
    }    
    
    //main Methode kann zum Testen und Fehlersuchen verwendet werden
    public static void main(String[] args){
        //erstelle zwei Auto Objekte
        //Schema: DATENTYP VARIABLENNAME wird zugewiesen KONSTRUKTOR-Aufruf
        AUTO car1 = new AUTO();
        AUTO car2 = new AUTO("BMW", "grün", 2.4);
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        //Anlassen
        car1.startstop();
        car2.startstop();
        //Losfahren
        car1.beschleunigen();
        System.out.println(car2.HoechstGeschwindigkeit);
        car2.beschleunigen();
    }    
    
}
