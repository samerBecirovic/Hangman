package becirovic;

import javax.swing.*;
import javax.swing.text.Document;
import java.awt.*;

/**
 * Panel Klasse für das Hangman-Spiel
 * @author Becirovic Samer
 * @version 09-10-2017
 */
public class HangmanPanel extends JPanel{

    private JTextField textField;
    private JSlider slider;
    private HangmanControl control;
    private HangmanDraw draw;

    public HangmanPanel(HangmanControl control) {

        draw = new HangmanDraw();
        this.control = control;
        this.setLayout(new BorderLayout());
        textField = new JTextField();
        slider = new JSlider(0, 10, 0);
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(1);
        slider.setSnapToTicks(true);

        Document document = textField.getDocument();
        document.addDocumentListener(this.control);
        slider.addChangeListener(this.control);

        this.add(textField, BorderLayout.PAGE_START);
        this.add(slider, BorderLayout.PAGE_END);
        this.add(draw, BorderLayout.CENTER);

    }

    public JTextField getTextField() {
        return textField;
    }

    public void setTextField(JTextField textField) {
        this.textField = textField;
    }

    public JSlider getSlider() {
        return slider;
    }

    public void setSlider(JSlider slider) {
        this.slider = slider;
    }

    public HangmanControl getControl() {
        return control;
    }

    public void setControl(HangmanControl control) {
        this.control = control;
    }

    public HangmanDraw getDraw() {
        return draw;
    }

    public void setDraw(HangmanDraw draw) {
        this.draw = draw;
    }
}
