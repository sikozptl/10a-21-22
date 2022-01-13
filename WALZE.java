/**Ein Objekt der Klasse Walze soll aussehen wie 
 * ein Quadrat mit einem farbigen Vollkreis innen drin.
*/
public class WALZE{
    //Attributliste
    VOLLKREIS kreis;
    KASTEN kasten;
    
    //Konstruktor
    public WALZE(){
        kreis = new VOLLKREIS();
        kasten = new KASTEN();
    }

}
