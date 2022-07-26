import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class View{
    
    //Attributliste
    //Graphische Komponenten
    private JButton button;
    private JLabel jlabel;
    private JFrame frame;
    //Referenzen auf model und controller speichern
    private Controller controller;
    private Model model;

    //Konstruktor
    //1. Der Konstruktor benötigt zwei Parameter.
    //Man soll ihm einen controller und ein model übergeben können.
    public View(Controller c, Model m) {
        //Model und Controller übernehmen
        //und in eigenen Attributen speichern.
        controller = c;
        model = m;

        //Graphische Komponenten erzeugen
        frame = new JFrame("Graphical User Interface");
        button = new JButton("klick mich" );  
        //jlabel = new JLabel("Klicks: "+ model.getX());
        jlabel = new JLabel("Klicks: 0");

        //ActionLIstener erzeugen und dem Button hinzufügen
        button.addActionListener(new ButtonListener());

        //Was soll passieren, wenn jemand das Fram schliesst ... 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //label und button dem Frame hinzufügen
        frame.getContentPane().add(jlabel, BorderLayout.NORTH);
        frame.getContentPane().add(button, BorderLayout.SOUTH);
        //Alle Komponenten im Frame auf optimale größe bringen:
        frame.pack();
        //Fenster sichtbar machen
        frame.setVisible(true);
    }

    //Methoden
    public void aktualisieren(){
        jlabel.setText("Klicks: " + model.getX());
        //jlabel.setText("Klicks: 0");
    }

    //ActionListener in eigener, inneren Klasse.
    class ButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent event) {
            controller.buttonwurdegeklickt();
        }
    }
}