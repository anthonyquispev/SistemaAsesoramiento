 
package modelo;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Imagen extends javax.swing.JPanel{
    
    private BufferedImage ruta; 
    
    public Imagen(int ancho, int alto, BufferedImage ruta) {
        this.setSize(ancho, alto);
        this.ruta = ruta;
    }
    
    public void paint(Graphics g) {
        Dimension tamaño = getSize();
        BufferedImage img = ruta;
        
        g.drawImage(img, 0, 0, tamaño.width, tamaño.height, null);
        setOpaque(false);
        super.paintComponent(g);
    }
    
}
