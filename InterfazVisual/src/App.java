import javax.swing.ImageIcon;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;


public class App extends JFrame{

    Container contenedor;

    //Creacion de paneles
    JPanel panel1, panel2, panel3, panel4, panel5, panel6, panel7;

    //Creacion de botones
    JButton boton1, boton2, boton3, boton4, boton5,boton6,boton7,boton8, boton9, boton10, boton11,
    boton12, boton13, BotonFlechaDerecha, BotonFlechaIzquierda, BotonPuntos;;

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
        //Logo Visual
        ImageIcon logo = new ImageIcon("MiniProyecto2/Captura-removebg-preview.png");
        JLabel  LogoVisual = new JLabel();
        LogoVisual.setBounds(480, 60, 550, 450);
        LogoVisual.setIcon(new ImageIcon(logo.getImage().getScaledInstance(550, 400, Image.SCALE_SMOOTH)));

        panel1.setLayout(null);
        panel1.add(LogoVisual);
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
        //Boton 6
        boton6 = new JButton("File");
        boton6.setBounds(40, 5, 30, 20);
        Color colorFondoBoton = new Color(125,  125, 125);
        boton6.setForeground(colorFondoBoton);
        boton6.setBackground(colorFondo);
        boton6.setBorder(null);
        boton6.setFocusPainted(false); 
        //Boton 7
        boton7 = new JButton("Edit");
        boton7.setBounds(75, 5, 30, 20);
        boton7.setForeground(colorFondoBoton);
        boton7.setBackground(colorFondo);  
        boton7.setBorder(null);
        boton7.setFocusPainted(false);
        //Boton 8
        boton8 = new JButton("Selection");
        boton8.setBounds(110, 5, 60, 20);
        boton8.setForeground(colorFondoBoton);
        boton8.setBackground(colorFondo);
        boton8.setBorder(null);
        boton8.setFocusPainted(false);
        //Boton 9
        boton9 = new JButton("Wiew");
        boton9.setBounds(175, 5, 50, 20);
        boton9.setForeground(colorFondoBoton);
        boton9.setBackground(colorFondo);
        boton9.setBorder(null);
        boton9.setFocusPainted(false);
        //Boton 10
        boton10 = new JButton("Go");
        boton10.setBounds(220, 5, 40, 20);
        boton10.setForeground(colorFondoBoton);
        boton10.setBackground(colorFondo);
        boton10.setBorder(null);
        boton10.setFocusPainted(false);
        //Boton 11
        boton11 = new JButton("Run");
        boton11.setBounds(250, 5, 40, 20);
        boton11.setForeground(colorFondoBoton);
        boton11.setBackground(colorFondo);
        boton11.setBorder(null);
        boton11.setFocusPainted(false);
        //Boton 12
        boton12 = new JButton(". . .");
        boton12.setBounds(280, 2, 40, 20);
        boton12.setForeground(colorFondoBoton);
        boton12.setBackground(colorFondo);
        boton12.setBorder(null);
        boton12.setFocusPainted(false);
        //Boton 13
        boton13 = new JButton("GUI_VS_code");
        boton13.setBounds(500, 5, 300, 20);
        boton13.setForeground(colorFondoBoton);
        Color FondoBoton_13= new Color(74, 74, 74);
        boton13.setBackground(FondoBoton_13);
        boton13.setFocusPainted(false);
        //Boton BotonFechaDerecha
        BotonFlechaDerecha = new JButton();
        BotonFlechaDerecha.setBounds(420, 5, 30, 25);
        ImageIcon flechad = new ImageIcon("MiniProyecto2/BotonFlechaD.PNG");
        BotonFlechaDerecha.setIcon(new ImageIcon(flechad.getImage().getScaledInstance(BotonFlechaDerecha.getWidth(),BotonFlechaDerecha.getHeight(),Image.SCALE_SMOOTH)));
        //Creacion de la accion del boton
        Color colorFondo2 = new Color(100,100,100);
        Border lineBorder = BorderFactory.createLineBorder(colorFondo,5);
        Border selectBorder = BorderFactory.createLineBorder(colorFondo2,1);
        BotonFlechaDerecha.setBorder(lineBorder);
        BotonFlechaDerecha.getModel().addChangeListener(new ChangeListener(){
        @Override
        public void stateChanged(ChangeEvent e) {
            if (BotonFlechaDerecha.getModel().isPressed()){
                BotonFlechaDerecha.setBorder(selectBorder);
            }else{
                BotonFlechaDerecha.setBorder(lineBorder);
            }
        }
        });
        //Boton BotonFechaIzquierda
        BotonFlechaIzquierda = new JButton();
        BotonFlechaIzquierda.setBounds(450, 5, 30, 25);
        ImageIcon flechai = new ImageIcon("MiniProyecto2/BotonFlechaI.PNG");
        BotonFlechaIzquierda.setIcon(new ImageIcon(flechai.getImage().getScaledInstance(BotonFlechaDerecha.getWidth(),BotonFlechaDerecha.getHeight(),Image.SCALE_SMOOTH)));
        //Creacion de la accion del boton
        BotonFlechaIzquierda.setBorder(lineBorder);
        BotonFlechaIzquierda.getModel().addChangeListener(new ChangeListener(){
        @Override
        public void stateChanged(ChangeEvent e) {
            if (BotonFlechaIzquierda.getModel().isPressed()){
                BotonFlechaIzquierda.setBorder(selectBorder);
            }else{
                BotonFlechaIzquierda.setBorder(lineBorder);
            }
        }
        });
        panel5.setLayout(null);
        panel5.add(boton6);
        panel5.add(boton7);
        panel5.add(boton8);
        panel5.add(boton9);
        panel5.add(boton10);
        panel5.add(boton11);
        panel5.add(boton12);
        panel5.add(boton13);
        panel5.add(BotonFlechaDerecha);
        panel5.add(BotonFlechaIzquierda);
        panel1.add(panel5);
    }

    private void componentes_panel_6(){ //Barra superior de la terminal
        panel6 = new JPanel();
        GridLayout layout7 = new GridLayout();
        panel6.setBounds(0,0,1200,30);
        Color colorFondo = new Color(36, 35, 35);
        panel6.setBackground(colorFondo);

        //Boton 1
        boton1 = new JButton("PROBLEMS");
        boton1.setBounds(10, 10, 100, 20);
        Color colorFondoBoton_1 = new Color(138, 138, 138);
        boton1.setForeground(colorFondoBoton_1);
        boton1.setBackground(colorFondo);
        boton1.setBorder(null);
        boton1.setFocusPainted(false);
        //Boton 2
        boton2 = new JButton("OUTPUT");
        boton2.setBounds(100, 10, 100, 20);
        Color colorFondoBoton_2 = new Color(138, 138, 138);
        boton2.setForeground(colorFondoBoton_2);
        boton2.setBackground(colorFondo);
        boton2.setBorder(null);
        boton2.setFocusPainted(false);
        //Boton 3
        boton3 = new JButton("DEBUG CONSOLE");
        boton3.setBounds(210, 10, 100, 20);
        Color colorFondoBoton_3 = new Color(138, 138, 138);
        boton3.setForeground(colorFondoBoton_3);
        boton3.setBackground(colorFondo);
        boton3.setBorder(null);
        boton3.setFocusPainted(false);
        //Boton 4
        boton4 = new JButton("TERMINAL");
        boton4.setBounds(320, 10, 100, 20);
        Color colorFondoBoton_4 = new Color(138, 138, 138);
        boton4.setForeground(colorFondoBoton_4);
        boton4.setBackground(colorFondo);
        boton4.setBorder(null);
        boton4.setFocusPainted(false);
        //Boton 5
        boton5 = new JButton("PORTS");
        boton5.setBounds(400, 10, 100, 20);
        Color colorFondoBoton_5 = new Color(138, 138, 138);
        boton5.setForeground(colorFondoBoton_5);
        boton5.setBackground(colorFondo);
        boton5.setBorder(null);
        boton5.setFocusPainted(false);

        panel2.add(boton1);
        panel2.add(boton2);
        panel2.add(boton3);
        panel2.add(boton4);
        panel2.add(boton5);

    
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