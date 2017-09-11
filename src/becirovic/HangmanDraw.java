package becirovic;

import javax.swing.*;
import java.awt.*;

/**
 * Klasse die, die paintComponent behinhaltet
 */
public class HangmanDraw extends JPanel{

    //Wert der im Listener übergeben wird
    private int eingabe;


    public HangmanDraw() {

        eingabe = 0;

    }

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        int height = this.getHeight();
        int width = this.getWidth();
        switch (eingabe) {

            case -1:
                //Fehlermeldung
                g.setColor(Color.RED);
                g.drawString("Bitte nur Zahlen von 0-10 eintragen!", 10, 100);
                break;
            case 0:
                break;
            case 1:
                //Insel
                g.setColor(Color.ORANGE);
                g.fillOval((int)(0.05*width), (int)(0.9*height), (int)(0.35*width), (int)(0.2*height));
                break;
            case 2:
                //1.Linie
                g.drawLine((int)(0.23*width), (int)(0.9*height), (int)(0.23*width), (int)(0.15*height));
                //Insel
                g.setColor(Color.ORANGE);
                g.fillOval((int)(0.05*width), (int)(0.9*height), (int)(0.35*width), (int)(0.2*height));
                break;
            case 3:
                //1.Linie
                g.drawLine((int)(0.23*width), (int)(0.9*height), (int)(0.23*width), (int)(0.15*height));
                //2.Linie
                g.drawLine((int)(0.23*width), (int)(0.15*height), (int)(0.65*width), (int)(0.15*height));
                //Insel
                g.setColor(Color.ORANGE);
                g.fillOval((int)(0.05*width), (int)(0.9*height), (int)(0.35*width), (int)(0.2*height));
                break;
            case 4:
                //1.Linie
                g.drawLine((int)(0.23*width), (int)(0.9*height), (int)(0.23*width), (int)(0.15*height));
                //2.Linie
                g.drawLine((int)(0.23*width), (int)(0.15*height), (int)(0.65*width), (int)(0.15*height));
                //3.Linie
                g.drawLine((int)(0.65*width), (int)(0.15*height), (int)(0.65*width), (int)(0.26*height));
                //Insel
                g.setColor(Color.ORANGE);
                g.fillOval((int)(0.05*width), (int)(0.9*height), (int)(0.35*width), (int)(0.2*height));
                break;
            case 5:
                //1.Linie
                g.drawLine((int)(0.23*width), (int)(0.9*height), (int)(0.23*width), (int)(0.15*height));
                //2.Linie
                g.drawLine((int)(0.23*width), (int)(0.15*height), (int)(0.65*width), (int)(0.15*height));
                //3.Linie
                g.drawLine((int)(0.65*width), (int)(0.15*height), (int)(0.65*width), (int)(0.26*height));
                //Kopf
                g.setColor(Color.PINK);
                g.fillOval((int)(0.59*width), (int)(0.26*height), (int)(0.12*width), (int)(0.12*height));
                //Insel
                g.setColor(Color.ORANGE);
                g.fillOval((int)(0.05*width), (int)(0.9*height), (int)(0.35*width), (int)(0.2*height));
                break;
            case 6:
                //1.Linie
                g.drawLine((int)(0.23*width), (int)(0.9*height), (int)(0.23*width), (int)(0.15*height));
                //2.Linie
                g.drawLine((int)(0.23*width), (int)(0.15*height), (int)(0.65*width), (int)(0.15*height));
                //3.Linie
                g.drawLine((int)(0.65*width), (int)(0.15*height), (int)(0.65*width), (int)(0.26*height));
                //Kopf
                g.setColor(Color.PINK);
                g.fillOval((int)(0.59*width), (int)(0.26*height), (int)(0.12*width), (int)(0.12*height));
                //Körper
                g.setColor(Color.BLUE);
                g.fillOval((int)(0.55*width), (int)(0.37*height), (int)(0.2*width), (int)(0.4*height));
                //Insel
                g.setColor(Color.ORANGE);
                g.fillOval((int)(0.05*width), (int)(0.9*height), (int)(0.35*width), (int)(0.2*height));
                break;
            case 7:
                //1.Linie
                g.drawLine((int)(0.23*width), (int)(0.9*height), (int)(0.23*width), (int)(0.15*height));
                //2.Linie
                g.drawLine((int)(0.23*width), (int)(0.15*height), (int)(0.65*width), (int)(0.15*height));
                //3.Linie
                g.drawLine((int)(0.65*width), (int)(0.15*height), (int)(0.65*width), (int)(0.26*height));
                //Linker Arm
                g.drawLine((int)(0.6*width), (int)(0.5*height), (int)(0.46*width), (int)(0.36*height));
                //Kopf
                g.setColor(Color.PINK);
                g.fillOval((int)(0.59*width), (int)(0.26*height), (int)(0.12*width), (int)(0.12*height));
                //Körper
                g.setColor(Color.BLUE);
                g.fillOval((int)(0.55*width), (int)(0.37*height), (int)(0.2*width), (int)(0.4*height));
                //Insel
                g.setColor(Color.ORANGE);
                g.fillOval((int)(0.05*width), (int)(0.9*height), (int)(0.35*width), (int)(0.2*height));
                break;
            case 8:
                //1.Linie
                g.drawLine((int)(0.23*width), (int)(0.9*height), (int)(0.23*width), (int)(0.15*height));
                //2.Linie
                g.drawLine((int)(0.23*width), (int)(0.15*height), (int)(0.65*width), (int)(0.15*height));
                //3.Linie
                g.drawLine((int)(0.65*width), (int)(0.15*height), (int)(0.65*width), (int)(0.26*height));
                //Linker Arm
                g.drawLine((int)(0.6*width), (int)(0.5*height), (int)(0.46*width), (int)(0.36*height));
                //Rechter Arm
                g.drawLine((int)(0.7*width), (int)(0.5*height), (int)(0.86*width), (int)(0.36*height));
                //Kopf
                g.setColor(Color.PINK);
                g.fillOval((int)(0.59*width), (int)(0.26*height), (int)(0.12*width), (int)(0.12*height));
                //Körper
                g.setColor(Color.BLUE);
                g.fillOval((int)(0.55*width), (int)(0.37*height), (int)(0.2*width), (int)(0.4*height));
                //Insel
                g.setColor(Color.ORANGE);
                g.fillOval((int)(0.05*width), (int)(0.9*height), (int)(0.35*width), (int)(0.2*height));
                break;
            case 9:
                //1.Linie
                g.drawLine((int)(0.23*width), (int)(0.9*height), (int)(0.23*width), (int)(0.15*height));
                //2.Linie
                g.drawLine((int)(0.23*width), (int)(0.15*height), (int)(0.65*width), (int)(0.15*height));
                //3.Linie
                g.drawLine((int)(0.65*width), (int)(0.15*height), (int)(0.65*width), (int)(0.26*height));
                //Linker Arm
                g.drawLine((int)(0.6*width), (int)(0.5*height), (int)(0.46*width), (int)(0.36*height));
                //Rechter Arm
                g.drawLine((int)(0.7*width), (int)(0.5*height), (int)(0.86*width), (int)(0.36*height));
                //Linkes Bein
                g.drawLine((int)(0.6*width), (int)(0.7*height), (int)(0.46*width), (int)(0.83*height));
                //Kopf
                g.setColor(Color.PINK);
                g.fillOval((int)(0.6*width), (int)(0.26*height), (int)(0.12*width), (int)(0.12*height));
                //Körper
                g.setColor(Color.BLUE);
                g.fillOval((int)(0.55*width), (int)(0.37*height), (int)(0.2*width), (int)(0.4*height));
                //Insel
                g.setColor(Color.ORANGE);
                g.fillOval((int)(0.05*width), (int)(0.9*height), (int)(0.35*width), (int)(0.2*height));
                break;
            case 10:
                //1.Linie
                g.drawLine((int)(0.23*width), (int)(0.9*height), (int)(0.23*width), (int)(0.15*height));
                //2.Linie
                g.drawLine((int)(0.23*width), (int)(0.15*height), (int)(0.65*width), (int)(0.15*height));
                //3.Linie
                g.drawLine((int)(0.65*width), (int)(0.15*height), (int)(0.65*width), (int)(0.26*height));
                //Linker Arm
                g.drawLine((int)(0.6*width), (int)(0.5*height), (int)(0.46*width), (int)(0.36*height));
                //Rechter Arm
                g.drawLine((int)(0.7*width), (int)(0.5*height), (int)(0.86*width), (int)(0.36*height));
                //Linkes Bein
                g.drawLine((int)(0.6*width), (int)(0.7*height), (int)(0.46*width), (int)(0.83*height));
                //Rechtes Bein
                g.drawLine((int)(0.7*width), (int)(0.7*height), (int)(0.84*width), (int)(0.83*height));
                //Kopf
                g.setColor(Color.PINK);
                g.fillOval((int)(0.6*width), (int)(0.26*height), (int)(0.12*width), (int)(0.12*height));
                //Körper
                g.setColor(Color.BLUE);
                g.fillOval((int)(0.55*width), (int)(0.37*height), (int)(0.2*width), (int)(0.4*height));
                //Insel
                g.setColor(Color.ORANGE);
                g.fillOval((int)(0.05*width), (int)(0.9*height), (int)(0.35*width), (int)(0.2*height));
                break;

        }

    }

    public int getEingabe() {
        return eingabe;
    }

    public void setEingabe(int eingabe) {
        this.eingabe = eingabe;
        this.repaint();
    }
}
