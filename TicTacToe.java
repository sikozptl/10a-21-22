import javax.swing.JLabel;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class TicTacToe implements MouseListener{
    //Attributliste
    WALZE[] feld;
    String spieler;
    boolean spielistzuende;
    private JLabel label;

    //Konstruktor
    public TicTacToe(){
        ZEICHENFENSTER.gibFrame().addMouseListener(this);
        label = new JLabel("TicTacToe");
        ZEICHENFENSTER.gibFenster().komponenteHinzufuegen(label,"unten"); 
        feld = new WALZE[9]; 
        feld[0] = new WALZE(100,100,100,8);
        feld[1] = new WALZE(200,100,100,8);
        feld[2] = new WALZE(300,100,100,8); 
        feld[3] = new WALZE(100,200,100,8); 
        feld[4] = new WALZE(200,200,100,8); 
        feld[5] = new WALZE(300,200,100,8); 
        feld[6] = new WALZE(100,300,100,8); 
        feld[7] = new WALZE(200,300,100,8);         
        feld[8] = new WALZE(300,300,100,8); 
        spieler = "blau";
        spielistzuende = false;
    }

    //Methoden
    public void faerbe(int nr){
        if(feld[nr].getFarbe() == 8){
            if(spieler=="blau"){
                feld[nr].umfaerben(1);
                checkIfGameOver();
                spieler = "rot";
            }else{
                feld[nr].umfaerben(4);
                checkIfGameOver();
                spieler = "blau";
            }
        }else{
            ausgeben("Feld ist schon belegt.");
        }        
    }

    public void mousePressed(MouseEvent e) {
        if(spielistzuende){
            for(int i=0; i<=8; i++){
                feld[i].umfaerben(8);
            }
            spielistzuende = false;
            ausgeben("Neues Spiel");
            return;
        }
        //System.out.println("Die Maus wurde angeklickt an Position (" +e.getX() +", " + e.getY() +")");
        int x = e.getX() -8;
        int y = e.getY() -32;
        if(y>100 && y<200){
            if(x>100 && x<200){ faerbe(0);}
            if(x>200 && x<300){ faerbe(1);}
            if(x>300 && x<400){ faerbe(2);}            
        }
        if(y>200 && y<300){
            if(x>100 && x<200){ faerbe(3);}
            if(x>200 && x<300){ faerbe(4);}
            if(x>300 && x<400){ faerbe(5);}            
        }
        if(y>300 && y<400){
            if(x>100 && x<200){ faerbe(6);}
            if(x>200 && x<300){ faerbe(7);}
            if(x>300 && x<400){ faerbe(8);}            
        }        
        //Wenn 
    }

    private boolean checkIfGameOver(){
        int f0 = feld[0].getFarbe();
        int f1 = feld[1].getFarbe();
        int f2 = feld[2].getFarbe();
        int f3 = feld[3].getFarbe();
        int f4 = feld[4].getFarbe();
        int f5 = feld[5].getFarbe();
        int f6 = feld[6].getFarbe();
        int f7 = feld[7].getFarbe();
        int f8 = feld[8].getFarbe();
        
        //Wenn 3 gleiche farben, horizontal, vertikal, diagonal
        if(
        (f0==f1 && f1==f2 && f2!=8) ||
        (f3==f4 && f4==f5 && f5!=8) ||
        (f6==f7 && f7==f8 && f8!=8) ||
        (f0==f3 && f3==f6 && f6!=8) ||
        (f1==f4 && f4==f7 && f7!=8) ||
        (f2==f5 && f5==f8 && f8!=8) ||
        (f0==f4 && f4==f8 && f8!=8) ||
        (f2==f4 && f4==f6 && f6!=8) 
        ){ 
            ausgeben(spieler + " hat gewonnen.");
            spielistzuende = true;
            return true;
        }
        
        //Wenn alle Felder belegt sind ... Unentschieden
        if((f1!=8) && (f2!=8) && (f3!=8) && (f4!=8) && 
        (f5!=8) && (f6!=8) && (f7!=8) && (f8!=8)){
            ausgeben("Unentschieden");
            spielistzuende = true;
            return true;
        }
        return false;
    }
    
    public void ausgeben(String s){
        //System.out.println(s);
        label.setText(s);
    }

    public void mouseReleased(MouseEvent e) {} 

    public void mouseEntered(MouseEvent e) {}

    public void mouseExited(MouseEvent e) {}

    public void mouseClicked(MouseEvent e) {}    
}