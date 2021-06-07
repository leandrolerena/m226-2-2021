package grafikeditor_4;

import grafikeditor_4.figuren.Figur;
import grafikeditor_4.figuren.Kreis;
import grafikeditor_4.figuren.Linie;
import grafikeditor_4.figuren.Rechteck;

import java.util.ArrayList;
import java.util.List;

public class Grafikeditor {
    private static final EditorFrame EDITOR_FRAME = new EditorFrame(1400, 700);

    public static void main(String[] args) {
        List<Figur> figuren= new ArrayList<>();
        figuren.add(new Linie(100, 100,200,200));
        figuren.add(new Rechteck(200,200,50,50));
        figuren.add(new Kreis(300,300, 10));
        figuren.add(new Kreis(300,300, 100));

        Zeichnung z = new Zeichnung(figuren);
        EDITOR_FRAME.injectZeichnung(z);

        try {
            System.out.println("Warte 5 Sekunden vor dem verschieben");
            Thread.sleep(5000);
        }
        catch (Exception e){
            System.out.println("Warten unterbrochen");
        }

        System.out.println("Verschiebe figuren");

        figuren.forEach(figur -> figur.move(100,200));

        EDITOR_FRAME.repaint();
    }
}
