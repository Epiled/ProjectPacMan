/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

/**
 *
 * @author desenv
 */
public class Block extends Piece{
    
    public Block(){
        this.width=10;
        this.height=10;
        this.color = new Color(195, 154, 4);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillRect(x, y, width, height);
    }
}
