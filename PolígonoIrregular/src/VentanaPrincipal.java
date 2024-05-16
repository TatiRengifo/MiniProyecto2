import javax.swing.*;

public class VentanaPrincipal extends JFrame {
    
    public VentanaPrincipal() {
        setTitle("Dibujar Polígono");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void iniciar() {
        LienzoPanel lienzo = new LienzoPanel();
        add(lienzo);
        setVisible(true);
    }
}
