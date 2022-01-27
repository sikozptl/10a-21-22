/**Ein Objekt der Klasse Walze soll aussehen wie 
 * ein Quadrat mit einem farbigen Vollkreis innen drin.
*/
public class WALZE{  
    //Jede Walze hat ein VOLLKREIS-Objekt und ein KASTEN-Objekt
    //Attributliste
    private VOLLKREIS kreis;
    private KASTEN kasten;
    
    //Konstruktor der Klasse WALZE
    //Der Kreis soll im Kasten sein.
    public WALZE(){
        kreis = new VOLLKREIS(150,150,50-1,2);
        kasten = new KASTEN(100, 100, 100, 100);
    }

    //Zweiter Konstruktor
    public WALZE(int linksN, int obenN, int breiteN, int farbeN){
        //Reihenfolge VOLLKREIS-Konstruktor:  xM, yM, radius, farbe
        kreis = new VOLLKREIS(linksN+breiteN/2,obenN+breiteN/2,breiteN/2,farbeN);
        //Reihenfolge KASTEN-Konstruktor:  links, oben, breite, hoehe
        kasten = new KASTEN(linksN,obenN,breiteN,breiteN);
    }
    
    //Dritter Konstruktor
    public WALZE(int xM, int yM, int radius, int farbe, int dummy){
        //Reihenfolge VOLLKREIS-Konstruktor:  xM, yM, radius, farbe
        kreis = new VOLLKREIS(xM,yM,radius,farbe);
        //Reihenfolge KASTEN-Konstruktor:  links, oben, breite, hoehe
        kasten = new KASTEN(xM-radius,yM-radius,2*radius,2*radius);    
    }
    
    public void umfaerben(int farbeN){
        //Aufruf der Methode setfarbnr in VOLLKREIS
        kreis.setfarbnr(farbeN);
    }
    
    public int getFarbe(){
        return kreis.getFarbe();
    }
    
}
