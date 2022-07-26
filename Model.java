public class Model{
   
    //Attributliste
    //x ist die anzahl der klicks.
    private int x;

    //Konstruktor
    public Model(){
        x = 0;
    }
    
    //Methoden
    public void erhoehen(){
        x++;
    }
    
    public int getX(){
        return x;
    }
    
}
