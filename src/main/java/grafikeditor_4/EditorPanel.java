package grafikeditor_4;

import javax.swing.*;
import java.awt.*;

public class EditorPanel extends JPanel {
    private EditorControl control;
    public EditorPanel(EditorControl control){
        this.control = control;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        control.repaintAll(g);
    }
}
