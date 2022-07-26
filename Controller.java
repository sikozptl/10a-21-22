public class Controller{
    
    /* Der Controller erzeugt model und gui.
     * Der Controller braucht Zugriff auf das model und die gui.
     * Deshalb speichert er in Referenzvariablen model und gui.
     */
    
    //Attributliste
    private Model model;
    private View gui;

    //Konstruktor
    public Controller(){
        //2. Neues model erzeugen und Referenz speichern.
        model = new Model();
        
        //3. Neue view erzeugen und Referenz speichern
        //Dieses controller-objekt (this) und das model
        //werden an die view weitergegeben, da auch die view
        //einen Zugriff auf controller und model benötigt.
        gui = new View(this, model);
    }
    
    //Methoden
    public void buttonwurdegeklickt(){
        model.erhoehen();
        gui.aktualisieren();
    }

}
