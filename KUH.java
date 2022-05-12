public class KUH{
    //Attributliste
    String name;
    String farbe;
    int gibtMilchProTag;
    int milchHeuteGemolken;

    //Konstruktor
    public KUH(){
        name = "Elsa";
        farbe = "schwarzweiß";
        gibtMilchProTag = 35;
        milchHeuteGemolken = 0;
    }
    
    //Methoden
    public void muhen(){
        System.out.println(name + " sagt: Muuuuuuuuuh!");
    }
    
    public void melken(int liter){
        if(gibtMilchProTag-milchHeuteGemolken >= liter){
            System.out.println(name + " gibt " + liter + " Liter Milch.");
            milchHeuteGemolken = milchHeuteGemolken + liter;
        }else{
            liter = gibtMilchProTag-milchHeuteGemolken;
            System.out.println(name + " gibt " + liter + " Liter Milch.");
            milchHeuteGemolken = milchHeuteGemolken + liter;
        }
    }

}
