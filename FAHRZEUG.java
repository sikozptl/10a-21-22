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
    
}
