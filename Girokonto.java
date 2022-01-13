public class Girokonto{
    //Attributliste
    String Kontoinhaber;
    int Kundennummer;
    double Kontostand;
    String iban;
    double dispo;
    boolean gesperrt;

    //Konstruktor
    public Girokonto(){
        Kontoinhaber = "Ulrich Schneider";
        Kundennummer = 666;
        Kontostand = 500.00;
        iban = "DE 13 1234 1234 4321 31";
        dispo = 8000.00;
        gesperrt = false;
    }
    
    //Konstruktor 2
    /** Methode, die den gleichen Namen hat wie die Klasse.
       Wird benötigt um Attributen Attributwerte zuzuweisen und 
       um Objekte zu erstellen. Er wird direkt nach Objekterstellung aufgerufen.
       */
    public Girokonto(String KontoinhaberNeu, int KundennummerNeu, String ibanNeu){
        Kontoinhaber = KontoinhaberNeu;
        Kundennummer = KundennummerNeu;
        iban = ibanNeu;
    }    
    
    //Methoden
    public void setDispo(double dispoNeu){
        dispo = dispoNeu;
    }
    
    public void einzahlen(double betrag){
        if(betrag >= 0){
            Kontostand = Kontostand + betrag;
        }else{
            System.out.println("Der eingezahlte Betrag muss positiv sein!");
        }
    }
    
    public void abheben(double betrag){
        if(gesperrt == false){
            //will der kunde zu viel abheben?
            if(betrag <= dispo + Kontostand){
                Kontostand = Kontostand - betrag;
                System.out.println("Betrag wurde erfolgreich abgehoben!");
            }else{
                System.out.println("Sie wollen zu viel abheben. Ihr Konto wurde gesperrt.");            
                gesperrt = true;
            }
        }else{
            System.out.println("Ihr Konto ist gesperrt. Kontaktieren Sie ihren Banker");
        }
    }    
    
    public void ueberweisen(double betrag, Girokonto ziel){
        abheben(betrag);
        //..Prüfen ob Konto gesperrt?!? 
        ziel.einzahlen(betrag);
    }    
    
    public static void main(String[] args){
        Girokonto konto1 = new Girokonto();
        Girokonto konto2 = new Girokonto();
        konto1.einzahlen(100);
        konto2.abheben(250);
        konto1.ueberweisen(20,konto2);
    }
}
