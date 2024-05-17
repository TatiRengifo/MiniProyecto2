import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LienzoPanel extends JPanel {
    
    public int xAnterior, yAnterior, xActual, yActual;
    
    public LienzoPanel() {
        // Establece el color de fondo del panel a blanco
        setBackground(Color.WHITE);
        
        // Añade un MouseListener para manejar eventos de clic del ratón
        addMouseListener(new MouseAdapter() {
            // Este método se llama cuando se presiona el botón del ratón
            public void mousePressed(MouseEvent e) {
                // Guarda las coordenadas donde se presionó el ratón
                xAnterior = e.getX();
                yAnterior = e.getY();
            }
        });
        
        // Añade un MouseMotionListener para manejar eventos de arrastre del ratón
        addMouseMotionListener(new MouseMotionAdapter() {
            // Este método se llama cuando se arrastra el ratón
            public void mouseDragged(MouseEvent e) {
                // Guarda las coordenadas actuales del ratón
                xActual = e.getX();
                yActual = e.getY();
                // Solicita que el panel se vuelva a dibujar
                repaint(); // Vuelve a dibujar el lienzo para actualizar la línea
                // Actualiza las coordenadas anteriores para el próximo movimiento
                xAnterior = xActual;
                yAnterior = yActual;
            }
        });
    }
    
    // Sobrescribe el método paintComponent para dibujar en el panel
    public void paintComponent(Graphics g) {
        // Llama al método paintComponent de la superclase para asegurar el correcto renderizado del fondo
        super.paintComponent(g);
        // Establece el color de dibujo a negro
        g.setColor(Color.BLACK);
        // Dibuja una línea desde las coordenadas anteriores hasta las actuales
        g.drawLine(xAnterior, yAnterior, xActual, yActual);
    }
}

