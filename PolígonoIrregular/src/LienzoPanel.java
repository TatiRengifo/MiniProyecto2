import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class LienzoPanel extends JPanel {
    
    private ArrayList<Point> puntosPoligono;
    
    public LienzoPanel() {
        // Establece el color de fondo del panel a blanco
        setBackground(Color.WHITE);
        // Inicializa la lista que almacenará los puntos del polígono
        puntosPoligono = new ArrayList<>();
        
        // Añade un MouseListener para manejar eventos de clic del ratón
        addMouseListener(new MouseAdapter() {
            // Este método se llama cuando se hace clic con el ratón
            public void mouseClicked(MouseEvent e) {
                // Añade el punto donde se hizo clic a la lista de puntos del polígono
                puntosPoligono.add(e.getPoint());
                // Solicita que el panel se vuelva a dibujar
                repaint(); // Vuelve a dibujar el lienzo para actualizar el polígono
            }
        });
    }
    
    // Sobrescribe el método paintComponent para dibujar en el panel
    public void paintComponent(Graphics g) {
        // Llama al método paintComponent de la superclase para asegurar el correcto renderizado del fondo
        super.paintComponent(g);
        // Establece el color de dibujo a negro
        g.setColor(Color.BLACK);
        
        // Dibuja líneas entre los puntos para formar el polígono
        if (puntosPoligono.size() > 1) {
            for (int i = 0; i < puntosPoligono.size() - 1; i++) {
                Point punto1 = puntosPoligono.get(i);
                Point punto2 = puntosPoligono.get(i + 1);
                g.drawLine(punto1.x, punto1.y, punto2.x, punto2.y);
            }
        }
        
        // Dibuja el último segmento del polígono para cerrar la figura
        if (puntosPoligono.size() > 1) {
            Point primerPunto = puntosPoligono.get(0);
            Point ultimoPunto = puntosPoligono.get(puntosPoligono.size() - 1);
            g.drawLine(ultimoPunto.x, ultimoPunto.y, primerPunto.x, primerPunto.y);
        }
    }
}
