import javax.swing.*;

public class DibujarLineasApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                VentanaPrincipal ventana = new VentanaPrincipal();
                ventana.iniciar();
            }
        });
    }
}
