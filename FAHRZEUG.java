public abstract class FAHRZEUG{

    //Attributliste
    String Hersteller;
    String Farbe;
    int Geschwindigkeit;
    int HoechstGeschwindigkeit;    

    //Konstruktor 1
    public FAHRZEUG(){
        Hersteller = "Mercedes";
        Farbe = "schwarz";
        Geschwindigkeit = 0;
        HoechstGeschwindigkeit = 0; //Merke: Anpassen!
    }

    //Konstruktor 2
    public FAHRZEUG(String Herstellerneu, String Farbeneu){
        Hersteller = Herstellerneu;
        Farbe = Farbeneu;
        Geschwindigkeit = 0;
        HoechstGeschwindigkeit = 0;
    }    
    
    //Konstruktor 3
    public FAHRZEUG(String Herstellerneu, String Farbeneu, int HGSneu){
        Hersteller = Herstellerneu;
        Farbe = Farbeneu;
        Geschwindigkeit = 0;
        HoechstGeschwindigkeit = HGSneu;
    }        

    public void beschleunigen(int kmh){
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
        return "Das ist ein " + Farbe + "er "+ Hersteller + " mit Geschindigkeit " + Geschwindigkeit;
    }    
}
