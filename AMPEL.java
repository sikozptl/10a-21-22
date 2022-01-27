public class AMPEL{
    //Attributliste
    private WALZE walze1;
    private WALZE walze2;
    private WALZE walze3;
    
    ///Konstruktor der Klasse AMPEL
    public AMPEL(){
        walze1 = new WALZE(100,100,100,4);
        walze2 = new WALZE(100,200,100,6);
        walze3 = new WALZE(100,300,100,2);
    }

    //Methoden
    public void schalteRot(){
        walze1.umfaerben(4);
        walze2.umfaerben(8);
        walze3.umfaerben(8);
    }
    
    public void schalteGruen(){
        walze1.umfaerben(8);
        walze2.umfaerben(8);
        walze3.umfaerben(2);
    }
    
    public void schalteGelb(){
        walze1.umfaerben(8);
        walze2.umfaerben(6); 
        walze3.umfaerben(8);      
    }
    
    public void schalteRotGelb(){
        walze1.umfaerben(4);
        walze2.umfaerben(6); 
        walze3.umfaerben(8);              
    }
    
    public void schalteAus(){
        walze1.umfaerben(8);
        walze2.umfaerben(8); 
        walze3.umfaerben(8);           
    }
    public void umschalten(){
        if(walze1.getFarbe() == 4){
            if(walze2.getFarbe() == 6){
                schalteGruen();
            }
        }
        
    }
    public void zeichnen(){
    
    }
}
