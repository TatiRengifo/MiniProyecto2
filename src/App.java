import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;


public class App extends JFrame{

    Container contenedor;

    //Creacion de paneles
    JPanel panel1, panel2, panel3, panel4, panel5, panel6, panel7;


    public App() {

        contenedor = getContentPane();
        BorderLayout layout = new BorderLayout();
        contenedor.setLayout(layout);

        componentes_panel_1();
        componentes_panel_2();
        componentes_panel_3();
        componentes_panel_4();
        componentes_panel_5();
        componentes_panel_6();
        componentes_panel_7();
       
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 700);
        setVisible(true);

    }

    private void componentes_panel_1(){ //Panel principal
        panel1 = new JPanel();
        GridLayout layout2 = new GridLayout();
        Color colorFondo = new Color(36, 35, 35);
        panel1.setBackground(colorFondo);
       
        panel1.setLayout(null);
        contenedor.add(panel1); 
    }

    private void componentes_panel_2(){ //Panel terminal
        panel2 = new JPanel();
        GridLayout layout3 = new GridLayout();
        panel2.setBounds(300,500,1200,500);
        Color colorFondo = new Color(36, 35, 35);
        panel2.setBackground(colorFondo);
  
        panel2.setLayout(null);
        panel1.add(panel2);
    }

    private void componentes_panel_3(){ //Panel explorer
        panel3 = new JPanel();
        GridLayout layout4 = new GridLayout();
        panel3.setBounds(50,30,250,700);
        Color colorFondo = new Color(53, 53, 53);
        panel3.setBackground(colorFondo);
        
        panel3.setLayout(null);
        panel1.add(panel3);
    }

    private void componentes_panel_4(){ //Panel lateral
        panel4 = new JPanel();
        GridLayout layout5 = new GridLayout();
        panel4.setBounds(0,30,50,700);
        Color colorFondo = new Color(50, 50, 50);
        panel4.setBackground(colorFondo);
         
        panel4.setLayout(null);
        panel1.add(panel4);
    }

    private void componentes_panel_5(){  //Panel superior
        panel5 = new JPanel();
        GridLayout layout6 = new GridLayout();
        panel5.setBounds(0,0,1200,30);
        Color colorFondo = new Color(50, 50, 50);
        panel5.setBackground(colorFondo);
       
        panel5.setLayout(null);
        panel1.add(panel5);
    }

    private void componentes_panel_6(){ //Barra superior de la terminal
        panel6 = new JPanel();
        GridLayout layout7 = new GridLayout();
        panel6.setBounds(0,0,1200,30);
        Color colorFondo = new Color(36, 35, 35);
        panel6.setBackground(colorFondo);
    
        panel6.setLayout(null);
        panel2.add(panel6);

    }

    private void componentes_panel_7(){ //Linea divisora
        panel7 = new JPanel();
        GridLayout layout8 = new GridLayout();
        panel7.setBounds(0,0,1200,1);
        Color colorFondo = new Color(71, 70, 69);
        panel7.setBackground(colorFondo);

        panel7.setLayout(null);
        panel6.add(panel7);
    }

   

    public static void main(String[] args) throws Exception {
        App app = new App();
    }
}