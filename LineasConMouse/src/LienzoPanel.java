import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LienzoPanel extends JPanel {
    
    public int xAnterior, yAnterior, xActual, yActual;
    
    public LienzoPanel() {
        setBackground(Color.WHITE);
        
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                xAnterior = e.getX();
                yAnterior = e.getY();
            }
        });
        
        addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseDragged(MouseEvent e) {
                xActual = e.getX();
                yActual = e.getY();
                repaint(); // Vuelve a dibujar el lienzo para actualizar la línea
                xAnterior = xActual;
                yAnterior = yActual;
            }
        });
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawLine(xAnterior, yAnterior, xActual, yActual);
    }
}

