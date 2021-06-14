package grafikeditor_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EditorPanel extends JPanel {
    private EditorControl control;

    public EditorPanel(EditorControl control){
        this.control = control;
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mouseClicked(e);
                control.setFirstPoint(new Point(e.getX(), e.getY()));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                control.createFigureWithSecondPoint(new Point(e.getX(), e.getY()));
                repaint();
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        control.repaintAll(g);
    }
}
