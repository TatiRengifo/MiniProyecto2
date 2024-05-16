import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class LienzoPanel extends JPanel {
    
    private ArrayList<Point> puntosPoligono;
    
    public LienzoPanel() {
        setBackground(Color.WHITE);
        puntosPoligono = new ArrayList<>();
        
        addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                puntosPoligono.add(e.getPoint());
                repaint(); // Vuelve a dibujar el lienzo para actualizar el polígono
            }
        });
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        
        if (puntosPoligono.size() > 1) {
            for (int i = 0; i < puntosPoligono.size() - 1; i++) {
                Point punto1 = puntosPoligono.get(i);
                Point punto2 = puntosPoligono.get(i + 1);
                g.drawLine(punto1.x, punto1.y, punto2.x, punto2.y);
            }
        }
        
        // Dibuja el último segmento del polígono
        if (puntosPoligono.size() > 1) {
            Point primerPunto = puntosPoligono.get(0);
            Point ultimoPunto = puntosPoligono.get(puntosPoligono.size() - 1);
            g.drawLine(ultimoPunto.x, ultimoPunto.y, primerPunto.x, primerPunto.y);
        }
    }
}
