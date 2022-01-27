public class VOLLKREIS{
    
    //Attributliste
    private int x; //x-Koordinate Mittelpunkt
    private int y; //y-Koordinate
    private int radius;
    private int farbnr;
    
    // 0 schwarz, 1 blau, 2 grün, 3 türkis
    // 4 rot, 5 magenta, 6 gelb, 7 grau, 8 weiß
    
    //Konstruktor 1
    public VOLLKREIS(){
        x = 100;
        y = 100;
        radius = 80;
        farbnr = 1;
        zeichne();
    }
    
    //Konstruktor 2
    public VOLLKREIS(int xNeu, int yNeu, int radiusNeu, int farbnrNeu){
        x = xNeu;
        y = yNeu;
        radius = radiusNeu;
        farbnr = farbnrNeu;
        zeichne();
    }
    
    //Konstruktor 3
    public VOLLKREIS(int farbnrNeu){
        x = 100;
        y = 100;
        radius = 100;
        farbnr = farbnrNeu;
        zeichne();
    }    
    
    public void setfarbnr(int farbnrNeu){
        farbnr = farbnrNeu;
        zeichne();
    }
    
    public int getFarbe(){
        return farbnr;
    }

    //Methoden
    public void zeichne(){
        ZEICHENFENSTER.gibFenster().fuelleKreis(x,y,radius,farbnr);
    }
}