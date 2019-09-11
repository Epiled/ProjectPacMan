/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author desenv
 */
public class Ghost extends PieceMove{
    public Ghost(){
        height = 30;
        width = 30;
    }
    public boolean killer;
    public void kill(Pac pac){
    }
    @Override
    public void draw(Graphics g) {
        // definindo formato de Ghost
        g.setColor(this.color);
        g.fillOval(x, y, width, height);
        g.fillRect(x, y+(height/2), width, height-(height/2));
        
        //Olho
        g.setColor(new Color(255,0,0));
        g.fillArc(x+((width/2)+width/15), y+((width/6)+width/15), height/3, height/3, 215, 205);
        //Olho 2
        g.fillArc(x+(width/6), y+((width/6)+width/15), height/3, height/3, 130, 200);
        
        // perninhas do fantasma ou seja lá o que for aquilo abaixo dele...
        g.setColor(this.color);
        g.fillOval(x, y+(((width/2)+width/10)+width/6), width/3, width/3);
        
        g.setColor(this.color);
        g.fillOval(x+width/3, y+(((width/2)+width/10)+width/6), width/3, width/3);
        
        g.setColor(this.color);
        g.fillOval(x+(width/3)*2, y+(((width/2)+width/10)+width/6), width/3, width/3);
        
    }
    public void move(){
        
    }
}
