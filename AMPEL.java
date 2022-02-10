public class AMPEL{
    //Attributliste
    private WALZE walze1;
    private WALZE walze2;
    private WALZE walze3;
    private String zustand;

    ///Konstruktor der Klasse AMPEL
    public AMPEL(){
        walze1 = new WALZE(100,100,100,4);
        walze2 = new WALZE(100,200,100,6);
        walze3 = new WALZE(100,300,100,2);
        zustand = "gelb";
    }
    

    //Methoden
    private void schalteRot(){
        zustand = "rot";
        walze1.umfaerben(4);
        walze2.umfaerben(8);
        walze3.umfaerben(8);
    }

    private void schalteGruen(){
        zustand = "gruen";        
        walze1.umfaerben(8);
        walze2.umfaerben(8);
        walze3.umfaerben(2);
    }

    private void schalteGelb(){
        zustand = "gelb";        
        walze1.umfaerben(8);
        walze2.umfaerben(6); 
        walze3.umfaerben(8);      
    }

    private void schalteRotGelb(){
        zustand = "rotgelb";        
        walze1.umfaerben(4);
        walze2.umfaerben(6); 
        walze3.umfaerben(8);              
    }

    private void schalteAus(){
        zustand = "aus";        
        walze1.umfaerben(8);
        walze2.umfaerben(8); 
        walze3.umfaerben(8);           
    }

    public void umschalten(){
        switch(zustand) {
            case "aus" : schalteRot(); break;
            case "rot" : schalteRotGelb(); break;
            case "rotgelb" : schalteGruen(); break;
            case "gruen" : schalteGelb(); break;
            case "gelb" : schalteRot(); break;
        }
    }    

}
