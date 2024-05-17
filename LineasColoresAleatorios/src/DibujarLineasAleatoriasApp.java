import javax.swing.*;

/**
 * Clase principal de la aplicación que dibuja líneas aleatorias.
 */
public class DibujarLineasAleatoriasApp {

    /**
     * Método principal que inicia la aplicación.
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // SwingUtilities.invokeLater asegura que la GUI se inicialice en el hilo de despacho de eventos de Swing.
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Crear una instancia de la ventana principal de la aplicación.
                VentanaPrincipal ventana = new VentanaPrincipal();
                // Iniciar la ventana principal.
                ventana.iniciar();
            }
        });
    }
}

    