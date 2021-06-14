package grafikeditor_6.figuren.tests;

import grafikeditor_6.figuren.Rechteck;

import static org.junit.Assert.assertEquals;

public class RechteckTestStub {
    private GraphicsStub g = new GraphicsStub();

    @org.junit.Test
    public void draw() {
        Rechteck r = new Rechteck(10,10,20,40);
        r.draw(g);
        assertEquals(g.nbOfDrawRectCalls, 1);
    }
}