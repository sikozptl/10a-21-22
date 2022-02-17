
import java.util.Random;

public class SPIELAUTOMAT{
    //Attributliste
    private WALZE walze1;
    private WALZE walze2;
    private WALZE walze3;
    //Zufallsgenerator einbauen
    private Random zufgen;

    ///Konstruktor der Klasse AMPEL
    public SPIELAUTOMAT(){
        walze1 = new WALZE(100,100,100,4);
        walze2 = new WALZE(200,100,100,6);
        walze3 = new WALZE(300,100,100,2);
        zufgen = new Random();
    }    
 
    //Methoden
    private void setzeFarbmuster(int f1, int f2, int f3){
        walze1.umfaerben(f1);
        walze2.umfaerben(f2);
        walze3.umfaerben(f3);        
    }
    
    public void spiele(){
        setzeFarbmuster(zufgen.nextInt(9),zufgen.nextInt(9),zufgen.nextInt(9));
    }
}
