import javax.swing.*;

public class DibujarPoligonoApp {
    public static void main(String[] args) {
        // El método invokeLater asegura que la creación de la interfaz gráfica de usuario (GUI)
        // se realice en el hilo de despacho de eventos (Event Dispatch Thread).
        SwingUtilities.invokeLater(new Runnable() {
            // La clase Runnable define una tarea que se puede ejecutar.
            public void run() {
                // Se crea una instancia de VentanaPrincipal.
                VentanaPrincipal ventana = new VentanaPrincipal();
                // Se llama al método iniciar() para configurar y mostrar la ventana.
                ventana.iniciar();
            }
        });
    }
}
