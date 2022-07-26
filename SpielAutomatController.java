public class SpielAutomatController{

    /* Der Controller erzeugt model und gui.
     * Der Controller braucht Zugriff auf das model und die gui.
     * Deshalb speichert er in Referenzvariablen model und gui.
     */

    //Attributliste
    private SpielAutomatModel model;
    private SpielAutomatView gui;

    //Konstruktor
    public SpielAutomatController(){
        //2. Neues model erzeugen und Referenz speichern.
        //model = new Model();
        model = new SpielAutomatModel();

        //3. Neue view erzeugen und Referenz speichern
        //Dieses controller-objekt (this) und das model
        //werden an die view weitergegeben, da auch die view
        //einen Zugriff auf controller und model benötigt.
        //gui = new View(this, model);
        gui = new SpielAutomatView(model,this);
    }

    //Methoden
    public void spiele(){
        model.spiele();
        gui.aktualisieren();
    }

    public void einzahlen(int i){
        model.einzahlen(i);
        gui.aktualisieren();
    }

    public void gewinneSicher(){
        model.gewinneSicher();
        gui.aktualisieren();
    }

    public void spieleSelbst(){
        model.spieleSelbst();
        gui.aktualisieren();
    }
}
