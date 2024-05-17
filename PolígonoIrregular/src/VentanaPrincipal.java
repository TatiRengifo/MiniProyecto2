import javax.swing.*;

public class VentanaPrincipal extends JFrame {
    
    public VentanaPrincipal() {
        // Establece el título de la ventana
        setTitle("Dibujar Polígono");
        // Establece el tamaño de la ventana
        setSize(400, 400);
        // Centra la ventana en la pantalla
        setLocationRelativeTo(null);
        // Configura la operación de cierre para que termine el programa al cerrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void iniciar() {
        // Crea una instancia de LienzoPanel, que es donde se dibujará el polígono
        LienzoPanel lienzo = new LienzoPanel();
        // Añade el panel de lienzo a la ventana
        add(lienzo);
        // Hace visible la ventana
        setVisible(true);
    }
}
