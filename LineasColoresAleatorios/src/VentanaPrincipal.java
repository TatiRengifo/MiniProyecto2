import javax.swing.*;

public class VentanaPrincipal extends JFrame {
    
    public VentanaPrincipal() {
        setTitle("Dibujar Líneas Aleatorias");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        LienzoPanel lienzo = new LienzoPanel();
        setContentPane(lienzo);
        
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Opciones");
        JMenuItem reiniciarItem = new JMenuItem("Reiniciar Lienzo");
        reiniciarItem.addActionListener(e -> lienzo.reiniciarLienzo());
        menu.add(reiniciarItem);
        menuBar.add(menu);
        setJMenuBar(menuBar);
    }
    
    public void iniciar() {
        setVisible(true);
    }
}
