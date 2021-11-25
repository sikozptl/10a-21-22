public class MOTORRAD extends KFZ{
    
    //Konstruktor 1
    public MOTORRAD(){
        //Ruft den übergeordneten Konstruktor auf
        //d.h. wir verwenden den Konstruktor in KFZ
        super();
    }    
    
    //Konstruktor 2
    public MOTORRAD(String Herstellerneu, String Farbeneu, double HubraumNeu){
        //Verwende den 2. KFZ Konstruktor
        super(Herstellerneu, Farbeneu, HubraumNeu);
    }        

}
