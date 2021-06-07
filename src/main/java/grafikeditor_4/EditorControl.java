package grafikeditor_4;

import java.awt.*;

public class EditorControl {
    private char figureType;
    private Zeichnung zeichnung;
    private Point firstPoint;

    public void createFigureWithSecondPoint(Point second) {
        //TODO: Create Figure
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
