package grafikeditor_4;

import grafikeditor_4.figuren.Figur;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Zeichnung {
    /** Die Liste der dargestellten Figur-Objekte */
    private List<Figur> figuren = new ArrayList<Figur>();

    public Zeichnung(List<Figur> figuren){
        this.figuren.addAll(figuren);
    }

    public Zeichnung(){}


    /**
     * Zeichnet alle Figuren.
     * @param g Referenz auf das Graphics-Objekt zum zeichnen.
     */

    public void zeichneFiguren(Graphics g) {
        for (Figur f : figuren) {
            f.draw(g);
        }
    }

    /**
     * F�gt eine weitere Figur hinzu und l�st die Auffrischung des Fensterinhaltes aus.
     * @param figur Referenz auf das weitere Figur-Objekt.
     */
    public void hinzufuegen(Figur figur) {
        figuren.add(figur);
    }

    public void hinzufuegen(List<Figur> figurenListe) {
        figuren.addAll(figurenListe);
    }

    /**
     * L�scht alle Figuren und l�st die Auffrischung des Fensterinhaltes aus.
     */
    public void allesLoeschen() {
        figuren.clear();
    }
}
