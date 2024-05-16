import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class LienzoPanel extends JPanel {
    
    private Random random;
    
    public LienzoPanel() {
        setBackground(Color.WHITE);
        random = new Random();
        
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                int x1 = e.getX();
                int y1 = e.getY();
                int x2 = random.nextInt(getWidth());
                int y2 = random.nextInt(getHeight());
                Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
                Graphics g = getGraphics();
                g.setColor(color);
                g.drawLine(x1, y1, x2, y2);
            }
        });
    }
    
    public void reiniciarLienzo() {
        repaint();
    }
}
