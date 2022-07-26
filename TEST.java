public class TEST{
    
    //main Methode kann zum Testen und Fehlersuchen verwendet werden
    public static void main(String[] args){
        //erstelle zwei Auto Objekte
        //Schema: DATENTYP VARIABLENNAME wird zugewiesen KONSTRUKTOR-Aufruf
        AUTO car1 = new AUTO();
        AUTO car2 = new AUTO("BMW", "grün", 2.4);
        
        new AUTO().startstop();
        
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        //Anlassen
        car1.startstop();
        car2.startstop();
        //Losfahren
        car1.beschleunigen();
        System.out.println("HoechstGeschwindigkeit car2: " + car2.getHoechstGeschwindigkeit());
        car2.beschleunigen();

        //Fahrrad-Test
        FAHRRAD rad1 = new FAHRRAD();       
        System.out.println(rad1.toString());
        rad1.beschleunigen(90);
        System.out.println("Geschwindigkeit rad1: " + rad1.getGeschwindigkeit());
    }
}
