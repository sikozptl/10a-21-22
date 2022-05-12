public class ArrayTest{
    //Attributliste
    String[] einArray; //Deklarierung
    int[] einIntArray;
    KUH[] kuhHerde;
    
    //Konstruktor
    public ArrayTest(){
        //Array oder Felder
        einArray = new String[120]; //Initialisieren
        einIntArray = new int[5];
        kuhHerde = new KUH[20];
        
        //KUHArray mit Werten befüllen
        for(int i=0; i<kuhHerde.length; i++){
            kuhHerde[i] = new KUH() ;
        }     
        
        //IntArray mit Werten befüllen
        for(int i=0; i<einIntArray.length; i++){
            einIntArray[i] = i+1 ;
        }            
       
        //StringArray mit Werten füllen
        for(int i=0; i<einArray.length; i++){
            einArray[i] = "Coronatest" ;
        }        
        
        einArray[0] = "Meine ";
        einArray[1] = "Oma ";
        einArray[2] = "fährt ";
        einArray[3] = "im ";
        einArray[4] = "Hühnerstall ";
        einArray[5] = "Motorrad.";
        
        // in einer Zeile
        //int[] einAnderesIntArray = new int[100];
    }
    
    //Aufgabe 5
    public void herdeMuht(){
        for(int i=0; i<kuhHerde.length; i++){
            kuhHerde[i].muhen();
        }     
    }
    
    //Aufgabe 6
    public void herdeMelken(){
        for(int i=0; i<kuhHerde.length; i++){
            kuhHerde[i].melken(35);
        }     
    }    
    
    //Aufgabe 2
    //Alle Werte im Array sollen addiert werden
    public void aufsummieren(){
        int summe = 0;
        for(int i=0; i<einIntArray.length; i++){
            summe = summe + einIntArray[i];
        }
        System.out.println("Summe: " + summe);
    }
    
    public void ausgeben(){
        for(int i=0; i<einArray.length; i++){
            System.out.println(i + ": " + einArray[i]);
        }
    }
}
