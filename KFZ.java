public abstract class KFZ extends FAHRZEUG{

    //Attributliste
    
    //Konstruktor 1
    public KFZ(){
        super(); //Ruft FAHRZEUG-Konstruktor auf
        HoechstGeschwindigkeit = berechneHoechstgeschwindigkeit();
    }

    //Konstruktor 2
    public KFZ(String Herstellerneu, String Farbeneu, double HubraumNeu){
        super(Herstellerneu, Farbeneu);
        HoechstGeschwindigkeit = berechneHoechstgeschwindigkeit();
    }
    
    //Methoden ohne Rückgabewert (void)
    //startet motor, wenn aus, stoppt motor, wenn an
    public void startstop(){
        if(motorlaeuft == false){ //Vergleich
            motorlaeuft = true;  //Zuweisung
            System.out.println("Motor wurde angelassen");
        }else{
            motorlaeuft = false;
            System.out.println("Motor wurde ausgeschaltet!");
        }
    }

    public void beschleunigen(int kmh){
        //Beschleunigen nur dann, wenn motor an ist (if/else)
        if(motorlaeuft == true){
            //beschleunigen() in Oberklasse aufrufen
            super.beschleunigen(kmh); 
        }else{
            System.out.println("Der Motor ist aus!");
        }
    }

    //toString Methode charakterisiert das Objekt, d.h. 
    //liefert Attributwerte des Objekts als Text zurück
    public String toString(){
        return "Das ist ein " + Farbe + "er "+ Hersteller + " mit Hubraum " + Hubraum + " mit Geschindigkeit " + Geschwindigkeit;
    }
}
