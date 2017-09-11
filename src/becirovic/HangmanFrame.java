package becirovic;

import javax.swing.*;

/**
 * Frame für das Hangman-Spiel
 * @author Becirovic Samer
 * @versin 09-18-2017
 */
public class HangmanFrame extends JFrame{

    public HangmanFrame(JPanel panel) {

        super("Hangman");
        this.add(panel);
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

}
