public class MOTOR{
    
    //Attributliste
    boolean motorlaeuft;
    double Hubraum;
    double Leistung;
    
    //Konstruktor 1
    public MOTOR(){
        motorlaeuft = false;
        Hubraum = 2.0;
        Leistung = berechneLeistung(); //Methode mit Rückgabewert   
    }

    //Konstruktor 2
    public MOTOR(double HubraumNeu){
        motorlaeuft = false;
        Hubraum = HubraumNeu;
        Leistung = berechneLeistung(); //Methode mit Rückgabewert            
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
}
