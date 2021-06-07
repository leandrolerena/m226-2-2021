package grafikeditor_5;

import grafikeditor_5.figuren.Figur;
import grafikeditor_5.figuren.Kreis;
import grafikeditor_5.figuren.Linie;
import grafikeditor_5.figuren.Rechteck;

import java.awt.*;

public class EditorControl {
    private char figureType = 'l';
    private Zeichnung zeichnung;
    private Point firstPoint;

    public void createFigureWithSecondPoint(Point second) {
        Figur figur = null;
        switch (figureType){
            case 'l':
                figur = new Linie(firstPoint.x, firstPoint.y, second.x, second.y);
                break;
            case 'k':
                figur = new Kreis(firstPoint.x, firstPoint.y, (int) second.distance(firstPoint));
                break;
            case 'r':
                figur = new Rechteck(firstPoint, second);
                break;
        }

        if (figur != null){
            zeichnung.hinzufuegen(figur);
        }
    }

    public EditorControl(){
        zeichnung = new Zeichnung();
    }

    public void setFigureType(char figureType) {
        this.figureType = figureType;
    }

    public EditorControl(Zeichnung zeichnung){
        this.zeichnung = zeichnung;
    }

    public void repaintAll(Graphics g) {
        zeichnung.zeichneFiguren(g);
    }

    public void setZeichnung(Zeichnung zeichnung) {
        this.zeichnung = zeichnung;
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }
}
