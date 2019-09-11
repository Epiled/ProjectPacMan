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
public class Pac extends PieceMove{
    public int score;
    public int timeBoost;
    public int lives;
    private int d = 1;
    public int dir = 30;
    public int dir1 = 300;
    public boolean olho = true;
    
    public Pac(){
        height = 30;
        width = 30;
        color = new Color(245, 225, 50);
        x = 385;
        y = 305;
        this.velx = 0;
        this.vely = 0;
        this.lives = 3;
        this.sprite = 3;
    }
    
    public void eat(Food food){
    }
    public void eat(Ghost ghost){
    }
    public void eat(Boost boost){
    }
    public void draw(Graphics g){
        if (velx == 0 && vely == 0) {
            g.setColor(this.color);
            g.fillArc(x, y, width, height, dir, dir1);
            if (olho == true) {
            g.setColor(new Color(85,0,231));
            g.fillOval(x+((height/2)-height/30), y+((width/6)-width/30), 6, 6);    
            }
            else{
                g.setColor(new Color(85,0,231));
            g.fillOval(x+((width/6)-width/30), y+((height/2)-height/30), 6, 6);
            }
        }
        else if (velx > 0) {    // Movimentação para a Direita
            if (this.sprite == 1) {// 1º Sprite
            // Pac boca aberta
            g.setColor(this.color);
            g.fillArc(x, y, width, height, 30, 300);
            //Olho
            g.setColor(new Color(85,0,231));
            g.fillOval(x+((height/2)-height/30), y+((width/6)-width/30), 6, 6);
            }
            else if (this.sprite == 2) { // 2º Sprite
            // Pac boca semi fechada
            g.setColor(this.color);
            g.fillArc(x, y, width, height, 20, 310);    
            //Olho
            g.setColor(new Color(85,0,231));
            g.fillOval(x+((height/2)-height/30), y+((width/6)-width/30), 6, 6);
            }
            else {// 3º Sprite
            // Pac boca fechada
            g.setColor(this.color);
            g.fillArc(x, y, width, height, 0, 360);    
            //Olho
            g.setColor(new Color(85,0,231));
            g.fillOval(x+((height/2)-height/30), y+((width/6)-width/30), 6, 6);
            }
        }
        else if (velx < 0) {    // Movimentação para a Esquerda
            if (this.sprite == 1) {// 1º Sprite
            // Pac boca aberta
            g.setColor(this.color);
            g.fillArc(x, y, width, height, 210, 300);
            //Olho
            g.setColor(new Color(85,0,231));
            g.fillOval(x+((height/2)-height/30), y+((width/6)-width/30), 6, 6);
            }
            else if (this.sprite == 2) { // 2º Sprite
            // Pac boca semi fechada
            g.setColor(this.color);
            g.fillArc(x, y, width, height, 200, 310);    
            //Olho
            g.setColor(new Color(85,0,231));
            g.fillOval(x+((height/2)-height/30), y+((width/6)-width/30), 6, 6);
            }
            else {// 3º Sprite
            // Pac boca fechada
            g.setColor(this.color);
            g.fillArc(x, y, width, height, 0, 360);    
            //Olho
            g.setColor(new Color(85,0,231));
            g.fillOval(x+((height/2)-height/30), y+((width/6)-width/30), 6, 6);
            }
        }
        else if (vely > 0) {    // Movimentação para Baixo
            if (this.sprite == 1) {// 1º Sprite
            // Pac boca aberta
            g.setColor(this.color);
            g.fillArc(x, y, width, height, 305, 295);
            //Olho
            g.setColor(new Color(85,0,231));
            g.fillOval(x+((width/6)-width/30), y+((height/2)-height/30), 6, 6);
            }
            else if (this.sprite == 2) { // 2º Sprite
            // Pac boca semi fechada
            g.setColor(this.color);
            g.fillArc(x, y, width, height, 295, 305);    
            //Olho
            g.setColor(new Color(85,0,231));
            g.fillOval(x+((width/6)-width/30), y+((height/2)-height/30), 6, 6);
            }
            else {// 3º Sprite
            // Pac boca fechada
            g.setColor(this.color);
            g.fillArc(x, y, width, height, 0, 360);    
            //Olho
            g.setColor(new Color(85,0,231));
            g.fillOval(x+((width/6)-width/30), y+((height/2)-height/30), 6, 6);
            }
        }
        else if (vely < 0) {    // Movimentação para Cima
            if (this.sprite == 1) {// 1º Sprite
            // Pac boca aberta
            g.setColor(this.color);
            g.fillArc(x, y, width, height, 120,300);
            //Olho
            g.setColor(new Color(85,0,231));
            g.fillOval(x+((width/6)-width/30), y+((height/2)-height/30), 6, 6);
            }
            else if (this.sprite == 2) { // 2º Sprite
            // Pac boca semi fechada
            g.setColor(this.color);
            g.fillArc(x, y, width, height, 110, 320);    
            //Olho
            g.setColor(new Color(85,0,231));
            g.fillOval(x+((width/6)-width/30), y+((height/2)-height/30), 6, 6);
            }
            else {// 3º Sprite
            // Pac boca fechada
            g.setColor(this.color);
            g.fillArc(x, y, width, height, 0, 360);    
            //Olho
            g.setColor(new Color(85,0,231));
            g.fillOval(x+((width/6)-width/30), y+((height/2)-height/30), 6, 6);
            }
        }
            this.d++;
            if (d > 1) {
                if (this.sprite == 1) {
                    this.sprite = 2;
                }else if (this.sprite == 2) {
                    this.sprite = 3;
                }else if (this.sprite == 3){
                    this.sprite = 1;
                }
                d = 0;
            }
        }
    
    public void move(){
        this.x= this.x+ this.velx;
        this.y= this.y+ this.vely;
    }
    public void collide(Block b){
        
        // Pontos de colisão do Pac
        int p1x = this.x;// Canto superior esquerdo
        int p1y = this.y;
        
        int p2x = this.x + this.width;// Canto superior direito
        int p2y = this.y;
        
        int p3x = this.x + this.width;// Canto inferior direito
        int p3y = this.y + this.height;
        
        int p4x = this.x; // Canto inferior esquerdo
        int p4y = this.y + this.height;
        
        // Pontos de colisão do(s) bloco(s)
        int b1x = b.x;// Canto superior esquerdo
        int b1y = b.y;
        
        int b2x = b.x + b.width; // canto superior direito
        int b2y = b.y; 
        
        int b3x = b.x + b.width;// Canto inferior direito
        int b3y = b.y + b.height;
       
        int b4x = b.x;
        int b4y = b.y + b.height;
        
        // Calculo de distancia entre os blocos
        int d1x = p1x - b2x;
        int d1y = p1y - b4y;
        int d2x = b1x - p2x;
        int d2y = p2y - b3y;
        int d3x = b4x - p3x;
        int d3y = b2y - p3y;
        int d4x = p4x - b3x;
        int d4y = b2y - p4y;
        
        // Pac ponto 1 (X,Y) Canto superior esquerdo
        if (p1x >= b1x && p1x <= b2x) {
            if (p1y >= b1y && p1y <= b4y) {
                if (velx == -5) {
                this.x = x - d1x + 1;
                this.velx = 0;
                }
                 if (vely == -5) {
                this.y = y - d1y + 1;
                this.vely = 0;
                }
            }
        }
        
        // Pac ponto 2 (X,Y) Canto superior direito
        if (p2x >= b1x && p2x <= b2x) {
            if (p2y >= b1y && p2y <= b4y) {
                if (velx == 5) {
                this.x = x + d2x - 1;
                this.velx = 0;
                }
                 if (vely == -5) {
                this.y = y - d2y + 1;
                this.vely = 0;
                }
            }
        }
        // Pac ponto 3 (X,Y) Canto inferior direito
         if (p3x >= b1x && p3x <= b2x) {
            if (p3y >= b1y && p3y <= b4y) {
                if (velx == 5) {
                this.x = x + d3x - 1;
                this.velx = 0;
                }
                 if (vely == 5) {
                this.y = y + d3y - 1;
                this.vely = 0;
                }
            }
        }
         // Pac ponto 4 (X,Y) Canto inferior esquerdo
         if (p4x >= b1x && p4x <= b2x) {
            if (p4y >= b1y && p4y <= b4y) {
                if (velx == -5) {
                this.x = x - d4x + 1;
                this.velx = 0;
                }
                 if (vely == 5) {
                this.y = y + d4y - 1;
                this.vely = 0;
                }
            }
        }
        
    }
}
