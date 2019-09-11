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
public class Boost extends Piece{

    public Boost() {
        width=20;
        height=20;
        color = new Color(222,255,102);
    }
    
    public void eaten(){
    }
    public void draw(Graphics g){
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
