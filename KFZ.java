public abstract class KFZ extends FAHRZEUG{

    //Attributliste
    boolean motorlaeuft;
    double Hubraum;
    double Leistung;

    //Konstruktor 1
    public KFZ(){
        super(); //Ruft FAHRZEUG-Konstruktor auf
        motorlaeuft = false;
        Hubraum = 2.0;
        Leistung = berechneLeistung(); //Methode mit Rückgabewert    
        HoechstGeschwindigkeit = berechneHoechstgeschwindigkeit();
    }

    //Konstruktor 2
    public KFZ(String Herstellerneu, String Farbeneu, double HubraumNeu){
        super(Herstellerneu, Farbeneu);
        motorlaeuft = false;
        Hubraum = HubraumNeu;
        Leistung = berechneLeistung(); //Methode mit Rückgabewert
        HoechstGeschwindigkeit = berechneHoechstgeschwindigkeit();
    }

    //Methode mit Rückgabewert
    public double berechneLeistung(){
        return Hubraum * 70;
    }
    
    public int berechneHoechstgeschwindigkeit(){
        if( (2*Leistung) <= 310){
            //Explizite Umwandlung von double nach Integer
            return (int) (2*Leistung);
        }else{
            return 310;
        }
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
            if(kmh>=0){
                //Beschleunigen nur dann, wenn Hoechstgeschwindigkeit noch nicht erreicht ist
                if(Geschwindigkeit + kmh < HoechstGeschwindigkeit ){
                    //neue Geschwindigkeit = alte Geschwindigkeit + 10
                    Geschwindigkeit = Geschwindigkeit + kmh;
                    System.out.println("Geschwindigkeit ist " + Geschwindigkeit);
                }else{
                    Geschwindigkeit = HoechstGeschwindigkeit;
                    System.out.println("Höchstgeschwindigkeit erreicht!");
                }
            }else{
                System.out.println("kmh muss positiv sein!");
            }
        }else{
            System.out.println("Der Motor ist aus!");
        }
    }

    //Soll um 10 beschleunigen
    public void beschleunigen(){
        //Aufruf von beschleunigen(int kmh)
        beschleunigen(10);  
    }

    public void bremsen(int kmh){
        //nicht in negative Werte laufen lassen (if/else)
        if(kmh>=0){
            if(Geschwindigkeit - kmh >= 0){
                Geschwindigkeit = Geschwindigkeit - kmh;   
                System.out.println("Geschwindigkeit ist " + Geschwindigkeit);
            }else{
                Geschwindigkeit = 0;
                System.out.println("Das Auto steht!");   
            }
        }else{
            System.out.println("kmh muss positiv sein!");
        }
    }    

    public void bremsen(){
        bremsen(10);
    }

    public void setFarbe(String farbeneu){
        Farbe = farbeneu;
    }

    public void setHersteller(String herstellerneu){
        Hersteller = herstellerneu;
    }    

    public void setHerstellerFarbe(String herstellerneu, String farbeneu){
        Hersteller = herstellerneu;
        Farbe = farbeneu;
    }        

    //toString Methode charakterisiert das Objekt, d.h. 
    //liefert Attributwerte des Objekts als Text zurück
    public String toString(){
        return "Das ist ein " + Farbe + "er "+ Hersteller + " mit Hubraum " + Hubraum + " mit Geschindigkeit " + Geschwindigkeit;
    }
    

}
