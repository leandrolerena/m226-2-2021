package grafikeditor_6.figuren.tests;

import grafikeditor_6.figuren.Rechteck;
import org.mockito.Mockito;

import java.awt.*;

public class RechteckTestMock {

    private Graphics g = Mockito.mock(Graphics.class);

    @org.junit.Test
    public void draw() {
        Rechteck r = new Rechteck(10,10,20,40);
        r.draw(g);
        Mockito.verify(g, Mockito.times(1)).drawRect(10,10,20,40);
    }
}