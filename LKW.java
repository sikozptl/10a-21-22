public class LKW extends KFZ{

    //Konstruktor 1
    public LKW(){
        //Ruft den übergeordneten Konstruktor auf
        //d.h. wir verwenden den Konstruktor in KFZ
        super();
    }    
    
    //Konstruktor 2
    public LKW(String Herstellerneu, String Farbeneu, double HubraumNeu){
        //Verwende den 2. KFZ Konstruktor
        super(Herstellerneu, Farbeneu, HubraumNeu);
    }        

}
