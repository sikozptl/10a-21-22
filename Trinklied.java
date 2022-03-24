public class Trinklied{

    //Konstruktor
    public Trinklied() {
        singeDasLied();
    }

    //Methoden
    public void singeDasLied(){
        for(int anzahl = 99; anzahl>=1; anzahl--){
            System.out.print(astr(anzahl) +" "+  wort(anzahl)+ " of beer on the wall, ");
            System.out.println(astr(anzahl) + " " +wort(anzahl) +" of beer.");
            System.out.print("Take one down and pass it around, ");
            System.out.println(astr(anzahl-1) +" " +wort(anzahl-1) +" of beer on the wall.");
            System.out.println("");
            }

        System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
        System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");        
    }    
    
    public String wort(int anzahl){
        if(anzahl==1){
            return "bottle";
        }else{
            return "bottles";
        }
    }
    
    public String astr(int anzahl){
        if(anzahl == 0){
            return "no more";
        }else{
            return ""+anzahl;
        }
    }
}