package grafikeditor_6.figuren.tests;

public class GraphicsStub extends ConcreteGraphics{
    int nbOfDrawRectCalls = 0;
    @Override
    public void drawRect(int x, int y, int width, int height) {
        nbOfDrawRectCalls++;
    }
}
