/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author SrHumano
 */
public class Game extends JFrame implements KeyListener{
    /**
     * Cria uma janela com o nome PacMan
     */
    private Pac pac;
    private Stage1 s1;
    public Game(){
        super("Pacman");
        Dimension d = new Dimension(800, 600);
        setSize(d);
        setMinimumSize(d);
        setMaximumSize(d);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addKeyListener(this);
        pac = new Pac();
        s1 = new Stage1();
        s1.pac = pac;
        s1.bgcolor = new Color(85,0,231);
        add(s1);
        setVisible(true);        
    }
    
    public static void main(String args[]){
        Game game = new Game();
        game.start();
    }
            @Override
            public void keyTyped(KeyEvent ke) {
            }// não uso e nem posso apagar
            @Override
            public void keyPressed(KeyEvent ke) { // recebe as teclas precionadas
                if (ke.getKeyCode() == 40) {//seta de baixo
                    pac.velx = 0;
                    pac.vely = 5;
                    pac.dir= 305;
                    pac.dir1 = 295;
                    pac.olho = false;
                }
                if (ke.getKeyCode() == 38) {//seta de cima
                    pac.velx = 0;
                    pac.vely = -5;
                    pac.dir= 120;
                    pac.dir1 = 300;
                    pac.olho = false;
                }
                if (ke.getKeyCode() == 37) {//seta da esquerda
                    pac.velx = -5;
                    pac.vely = 0;
                    pac.dir= 210;
                    pac.dir1 = 300;
                    pac.olho = true;
                }
                if (ke.getKeyCode() == 39) {//seta da direita
                    pac.velx = 5;
                    pac.vely = 0;
                    pac.dir= 30;
                    pac.dir1 = 300;
                    pac.olho = true;
                }
            }
        @Override
        public void keyReleased(KeyEvent ke) {
    }// Não uso e nem posso apagar
        
        public void start(){
            Thread t = new Thread(s1);
            t.start();
        }
}