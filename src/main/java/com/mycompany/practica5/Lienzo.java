package com.mycompany.practica5;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Ayoze, Nicolás
 */
public class Lienzo extends JPanel {
    private BufferedImage imagen = null;

    public Lienzo() {
        try {
            imagen = ImageIO.read(new URL ("https://quecartucho.es/blog/wp-content/uploads/2014/05/rgb.jpg"));
            this.setPreferredSize(new Dimension(imagen.getWidth(), imagen.getHeight()));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public void paintComponents(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, null);
    }
}
