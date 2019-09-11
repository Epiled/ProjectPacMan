/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

/**
 *
 * @author desenv
 */
public abstract class PieceMove extends Piece{
    public int velx;
    public int vely;
    public int sprite = 1;
    public abstract void move();
    public void die(){
        
    }
    protected void ress(){
        
    }
}
