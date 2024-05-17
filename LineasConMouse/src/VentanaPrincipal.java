import javax.swing.*;

/**
 * Clase que representa la ventana principal de la aplicación para dibujar líneas.
 */
public class VentanaPrincipal extends JFrame {
    
    /**
     * Constructor de la clase VentanaPrincipal.
     * Configura la ventana con sus propiedades básicas.
     */
    public VentanaPrincipal() {
        // Establece el título de la ventana.
        setTitle("Dibujar Líneas");
        // Establece el tamaño de la ventana a 400x400 píxeles.
        setSize(400, 400);
        // Centra la ventana en la pantalla.
        setLocationRelativeTo(null);
        // Configura la operación por defecto al cerrar la ventana, que es salir de la aplicación.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    /**
     * Método que inicializa y muestra la ventana.
     * Añade el panel de dibujo (LienzoPanel) a la ventana.
     */
    public void iniciar() {
        // Crea una instancia de LienzoPanel.
        LienzoPanel lienzo = new LienzoPanel();
        // Añade el LienzoPanel a la ventana.
        add(lienzo);
        // Hace visible la ventana.
        setVisible(true);
    }
}
