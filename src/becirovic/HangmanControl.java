package becirovic;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 * Control für das Hangman-Spiel
 * @author Becirovic Samer
 * @version 09-10-2017
 */
public class HangmanControl implements DocumentListener, ChangeListener {

    private HangmanPanel panel;
    private HangmanFrame frame;

    public HangmanControl() {

        panel = new HangmanPanel(this);
        frame = new HangmanFrame(panel);

    }

    @Override
    public void changedUpdate(DocumentEvent e) {


    }

    @Override
    public void insertUpdate(DocumentEvent e) {

        int wert = 0;
        try {

            wert = Integer.parseInt(panel.getTextField().getText());

        }catch (NumberFormatException ex) {
            if (panel.getTextField().getText().equals("")) {

                wert = 0;

            }else {

                wert = -1;

            }

        }

        if (wert < 0 || wert > 10) {

            wert = -1;

        }

        this.panel.getDraw().setEingabe(wert);

    }

    @Override
    public void removeUpdate(DocumentEvent e) {


    }

    @Override
    public void stateChanged(ChangeEvent e) {
        this.panel.getDraw().setEingabe(panel.getSlider().getValue());

    }

    public static void main(String[] args) {

        new HangmanControl();

    }

}

