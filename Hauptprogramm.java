/*
 * Programmablauf:
 * 
 * - main Methode im Hauptprogramm starten!
 * - Hauptprogramm erzeugt Controller
 * 1. Der Konstruktor in der View benötigt zwei Parameter
 *    (für Controller und Model).
 * 2. Controller erzeugt Model und speichert Referenz
 * 3a. Controller erzeugt GUI und speichert Referenz
 * 3b. Controller gibt Referenz auf sich selbst (this) an die GUI weiter
 * 3c. Controller gibt Referenz auf das Model an die GUI weiter.
 */

public class Hauptprogramm{
    
    public static void main(String[] args){
        new Controller();
    }
}
