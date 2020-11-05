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
    private BufferedImage imagenClon = null;
    private BufferedImage logo = null;
    int posx = 0; int posy = 0;

    public Lienzo() {
        try {
            imagen = ImageIO.read(new URL ("https://i.ibb.co/mCgxYWH/rgb.jpg"));
            imagenClon = ImageIO.read(new URL ("https://i.ibb.co/mCgxYWH/rgb.jpg"));
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
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(imagenClon, 0, 0, null);
        g.drawImage(logo, posx, posy, null);
    }
    
    public void drawLogo(int x, int y) {
        this.posx = x;
        this.posy = y;
        this.repaint();
    }
    
    public void changeColor(boolean c_red, boolean c_green, boolean c_blue) {
        imagenClon = UtilsPractica5.seleccionarComponentes(imagen, c_red, c_green, c_blue);
        this.repaint();
    }
}
