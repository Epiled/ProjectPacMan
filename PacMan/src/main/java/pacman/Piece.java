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
public abstract class Piece extends PieceShape{
    public int x;
    public int y;
    public Color color;

    @Override
    public abstract void draw(Graphics g);
}
