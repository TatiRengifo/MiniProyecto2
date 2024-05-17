import javax.swing.*;

/**
 * Clase que representa la ventana principal de la aplicación para dibujar líneas aleatorias.
 */
public class VentanaPrincipal extends JFrame {
    
    /**
     * Constructor de la clase VentanaPrincipal.
     * Configura la ventana y sus componentes.
     */
    public VentanaPrincipal() {
        // Establece el título de la ventana.
        setTitle("Dibujar Líneas Aleatorias");
        // Establece el tamaño de la ventana.
        setSize(400, 400);
        // Centra la ventana en la pantalla.
        setLocationRelativeTo(null);
        // Configura la operación por defecto al cerrar la ventana.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Crea una instancia de LienzoPanel y la añade como contenido de la ventana.
        LienzoPanel lienzo = new LienzoPanel();
        setContentPane(lienzo);
        
        // Crea una barra de menú.
        JMenuBar menuBar = new JMenuBar();
        // Crea un menú llamado "Opciones".
        JMenu menu = new JMenu("Opciones");
        // Crea un elemento de menú llamado "Reiniciar Lienzo".
        JMenuItem reiniciarItem = new JMenuItem("Reiniciar Lienzo");
        // Añade un ActionListener al elemento de menú para reiniciar el lienzo.
        reiniciarItem.addActionListener(e -> lienzo.reiniciarLienzo());
        // Añade el elemento de menú al menú.
        menu.add(reiniciarItem);
        // Añade el menú a la barra de menú.
        menuBar.add(menu);
        // Establece la barra de menú en la ventana.
        setJMenuBar(menuBar);
    }
    
    /**
     * Método que hace visible la ventana.
     */
    public void iniciar() {
        // Hace visible la ventana.
        setVisible(true);
    }
}
