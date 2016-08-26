package view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class BackgroudedPanel extends JPanel {

    private BufferedImage img;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Graphics2D g2 = (Graphics2D) g;
        
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
        
        g2.drawImage(img, 0, 0, getWidth(), getHeight(), this);
    }
    
    public void updateBackground(BufferedImage image) {
        this.img = image;
        this.paintComponent(this.getGraphics());
    }

}
