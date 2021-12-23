public class KASTEN{
    
    //Attributliste
    private int links;
    private int oben;
    private int breite;
    private int hoehe;
    
    //Konstruktor 1
    public KASTEN(){
        links = 50;
        oben = 100;
        breite = 200;
        hoehe = 50;
        zeichne();
    }
    
    //Konstruktor 2
    public KASTEN(int linksNeu, int obenNeu, int breiteNeu, int hoeheNeu){
        links = linksNeu;
        oben = obenNeu;
        breite = breiteNeu;
        hoehe = hoeheNeu;
        zeichne();
    }    

    public void zeichne()
    {
        ZEICHENFENSTER.gibFenster().zeichneRechteck(links,oben,breite,hoehe);
    }
    
    public void setzeLinks(int linksNeu)
    {
        links = linksNeu;
    }
    
}
