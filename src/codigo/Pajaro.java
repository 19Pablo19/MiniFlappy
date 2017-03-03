/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author jorgecisneros
 */
public class Pajaro extends Ellipse2D.Double{
    Color colorPajaro;
    int yVelocidad = -2;
    
    public Pajaro(int _radio, Color _color){
        super(100, 100, _radio, _radio);
        colorPajaro = _color;
    }
    
    public void mueve(Graphics2D g2){
        this.y -= yVelocidad;
        g2.setColor(colorPajaro);
        g2.fill(this);

    }
}
