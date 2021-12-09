public class HUND{
    //Attributliste
    //Schema: Datentyp Variablenname
    String name;
    int alter;
    String rasse;
    String farbe;
    boolean lebendig;

    //Konstruktor 1
    // - schreibt Attributwerte in die Attribute
    // - hat den gleichen Namen wie die Klasse
    // - kein Rückgabetyp (kein void)
    public HUND(){
        name = "Bello";
        alter = 5;
        rasse = "Schäferhund";
        farbe = "braun";
        lebendig = true;
    }
    
    //Konstruktor 2 mit Eingabeparametern
    public HUND(String nameneu, int alterneu, String rasseneu, String farbeneu, boolean lebendigneu){
        name = nameneu;
        alter = alterneu;
        rasse = rasseneu;
        farbe = farbeneu;
        lebendig = lebendigneu;
    }
    
    //Konstruktor 3
    public HUND(String nameneu, String rasseneu, String farbeneu){
        alter = 0;
        lebendig = true;
        name = nameneu;
        farbe = farbeneu;
        rasse = rasseneu;
    }

    //Methoden
    public void vor_das_auto_laufen(){
        lebendig = false;
        System.out.println("Jaul und tot!");
    }

    public void bellen(){
        if(lebendig == false){
            //1. Fall
            System.out.println("Tote Hunde bellen nicht!");
        }else{
            //2. Fall
            System.out.println("Wuff wufff!");
            System.out.println("Mein Name ist " + name);
            System.out.println("Ich bin ein " + rasse + " und " + farbe);
        }//Ende else
    }//Ende bellen
    
    public void test(){
        //int test;  //Deklarieren
        //test = 5;  //Initialisieren
        double test = 3.1415926; //alles in einer Zeile
        System.out.println("Inhalt von test ist: " + test);
    }//Ende test
    
    //Methode zum Hund umbenennen
    public void umbenennen(){
         name = "kalli";
         //Problem: Alle Hunde heissen Bello oder kalli
    }
    
    //Eingabeparameter nameneu erzeugen 
    public void umbenennen(String nameneu){
        //Attributwert zum Attribut name ändern auf das 
        //was in nameneu steht
        name = nameneu;
    }    
    
    //Methode zum alter ändern
    public void aendereAlter(int a){
        alter = a;
    }
    
    public void aendern(String nameneu, int alterneu){
        name = nameneu; 
        alter = alterneu;
    }
    
}//Ende Klasse
