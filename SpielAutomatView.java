import javax.swing.JButton;
import javax.swing.JLabel;

public class SpielAutomatView{
    //Attributliste
    private WALZE walze1;
    private WALZE walze2;
    private WALZE walze3;

    private JButton spieleknopf;
    private JButton aufladenknopf;
    private JButton grossergewinnknopf;    
    private JButton spieleselbstknopf;     
    private JLabel label;
    private JLabel guthabenlabel;  
    private SpielAutomatModel model;
    private SpielAutomatController controller;

    ///Konstruktor der Klasse AMPEL
    public SpielAutomatView(SpielAutomatModel m, SpielAutomatController c){
        model = m;
        controller = c;
        walze1 = new WALZE(100,100,100,4);
        walze2 = new WALZE(200,100,100,6);
        walze3 = new WALZE(300,100,100,2);

        //JButton erzeugen
        spieleknopf = new JButton("Spiele");
        aufladenknopf = new JButton("Aufladen");
        grossergewinnknopf = new JButton("gewinne Sicher");  
        spieleselbstknopf  = new JButton("alles verzocken!");  
        label = new JLabel("Guthaben: " + model.getGuthaben());
        guthabenlabel = new JLabel("Guthaben: " + model.getGuthaben());        
        //JButton dem ZEICHENFENSTER hinzufügen
        ZEICHENFENSTER.gibFenster().komponenteHinzufuegen(spieleknopf,"rechts");
        ZEICHENFENSTER.gibFenster().komponenteHinzufuegen(aufladenknopf,"rechts");
        ZEICHENFENSTER.gibFenster().komponenteHinzufuegen(grossergewinnknopf,"rechts");        
        ZEICHENFENSTER.gibFenster().komponenteHinzufuegen(spieleselbstknopf,"rechts");        
        ZEICHENFENSTER.gibFenster().komponenteHinzufuegen(label,"unten");        
        ZEICHENFENSTER.gibFenster().komponenteHinzufuegen(guthabenlabel,"rechts");                
        //JButton mit Aktion versehen: spiele() aufrufen
        spieleknopf.addActionListener(e -> controller.spiele());
        aufladenknopf.addActionListener(e -> controller.einzahlen(10));
        grossergewinnknopf.addActionListener(e -> controller.gewinneSicher());        
        spieleselbstknopf.addActionListener(e -> controller.spieleSelbst());                
    }    

    //Methoden
    public void aktualisieren(){
        guthabenlabel.setText("Guthaben: " + model.getGuthaben());
        //label.setText("Sie haben " + model.ermittleGewinn() + " EUR gewonnen!");
        label.setText(model.getStatusmeldung());
        walze1.umfaerben(model.getFarbnr(0));
        walze2.umfaerben(model.getFarbnr(1));
        walze3.umfaerben(model.getFarbnr(2));        
    }
}
