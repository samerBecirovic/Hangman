package becirovic;

import java.util.Random;

/**
 * 1. Model-Klasse für das Hangman-Spiel
 * @author Becirovic Samer
 * @version 09-07-2017
 */
public class Wortliste {

    private String[] wortliste = {"Computer", "Laptop", "Java", "Array"};

    public Wortliste() {



    }

    /**
     * @return the wortliste
     */
    public String[] getWortliste() {
        return wortliste;
    }

    /**
     * @param wortliste the wortliste to set
     */
    public void setWortliste(String[] wortliste) {
        this.wortliste = wortliste;
    }

    /**
     * Nimmt zufällig ein Wort aus der Wortliste
     * @return das zufällige Wort
     */
    public String zufallswort() {

        Random gen = new Random();
        int zufall = gen.nextInt(wortliste.length);
        return wortliste[zufall];

    }

    /**
     * Fügt ein Wort zur Wortliste hinzu
     * @param wort das Wort, das hinzugefügt werden soll
     */
    public void hinzu(String wort) {

        String[] wortlKopie = new String[wortliste.length+1];
        wortlKopie[wortliste.length] = wort;
        wortliste = wortlKopie;

    }

}
