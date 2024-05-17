import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

/**
 * Clase que representa un panel donde se dibujan líneas aleatorias
 * en respuesta a los clics del mouse.
 */
public class LienzoPanel extends JPanel {
    
    private Random random;
    
    /**
     * Constructor de la clase LienzoPanel.
     * Configura el panel y su comportamiento al recibir clics del mouse.
     */
    public LienzoPanel() {
        // Establece el color de fondo del panel a blanco.
        setBackground(Color.WHITE);
        // Inicializa el generador de números aleatorios.
        random = new Random();
        
        // Añade un listener para manejar eventos de clic del mouse.
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // Obtiene las coordenadas donde se hizo clic.
                int x1 = e.getX();
                int y1 = e.getY();
                // Genera coordenadas aleatorias para el segundo punto de la línea.
                int x2 = random.nextInt(getWidth());
                int y2 = random.nextInt(getHeight());
                // Genera un color aleatorio para la línea.
                Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
                // Obtiene el objeto Graphics para dibujar la línea.
                Graphics g = getGraphics();
                // Establece el color del objeto Graphics.
                g.setColor(color);
                // Dibuja la línea entre los dos puntos.
                g.drawLine(x1, y1, x2, y2);
            }
        });
    }
    
    /**
     * Método que reinicia el lienzo repintándolo.
     */
    public void reiniciarLienzo() {
        // Llama al método repaint, que solicita que el panel se vuelva a pintar.
        repaint();
    }
}
