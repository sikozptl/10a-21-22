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
}
