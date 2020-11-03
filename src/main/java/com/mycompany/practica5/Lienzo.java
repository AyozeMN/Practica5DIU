package com.mycompany.practica5;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
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
    private BufferedImage logo = null;

    public Lienzo() {
        try {
            imagen = ImageIO.read(new URL ("https://i.ibb.co/mCgxYWH/rgb.jpg"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            logo = ImageIO.read(new URL ("https://i.ibb.co/1vv3cx6/logo.png"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public BufferedImage getImagen() {
        return imagen;
    }

    public void setImagen(BufferedImage imagen) {
        this.imagen = imagen;
    }

    public BufferedImage getLogo() {
        return logo;
    }

    public void setLogo(BufferedImage logo) {
        this.logo = logo;
    }
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagen, 0, 0, null);
        g.drawImage(logo, 0, 0, null);
    }
}
