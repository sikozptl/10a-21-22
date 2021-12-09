public abstract class KFZ extends FAHRZEUG{

    //Attributliste
    //Objekt erbt Attribute aus FAHRZEUG: Geschwindigkeit, HGS, Farbe, Hersteller
    //Jedes KFZ-Objekt HAT einen MOTOR, d.h. 
    MOTOR motor; //Referenzvariable, Datentyp MOTOR, Name motor
    
    //Konstruktor 1
    public KFZ(){
        super(); //Ruft FAHRZEUG-Konstruktor auf
        motor = new MOTOR();
        HoechstGeschwindigkeit = motor.berechneHoechstgeschwindigkeit();
    }

    //Konstruktor 2
    public KFZ(String Herstellerneu, String Farbeneu, double HubraumNeu){
        super(Herstellerneu, Farbeneu);
        motor = new MOTOR(HubraumNeu);
        HoechstGeschwindigkeit = motor.berechneHoechstgeschwindigkeit();
    }
    
    //Methoden ohne Rückgabewert (void)
    //startet motor, wenn aus, stoppt motor, wenn an
    public void startstop(){
        motor.startstop();
    }

    public void beschleunigen(int kmh){
        //Beschleunigen nur dann, wenn motor an ist (if/else)
        if(motor.motorlaeuft == true){
            //beschleunigen() in Oberklasse aufrufen
            super.beschleunigen(kmh); 
        }else{
            System.out.println("Der Motor ist aus!");
        }
    }

    //toString Methode charakterisiert das Objekt, d.h. 
    //liefert Attributwerte des Objekts als Text zurück
    public String toString(){
        return "Das ist ein " + Farbe + "er "+ Hersteller + " mit Hubraum " + motor.Hubraum + " mit Geschindigkeit " + Geschwindigkeit;
    }
}
