/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacman;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
/**
 *
 * @author desenv
 */
public class Stage1 extends JComponent implements Runnable{
    public Color bgcolor;
    public List<Ghost> ghosts;
    public List<Block> blocks;
    public List<Food> foods;
    public List<Boost> boosts;
    public Pac pac;
    
    public void createBoosts(){
        this.boosts = new ArrayList<>(); // obj boost
        // Construindo boost
        Boost b1 = new Boost();
        b1.x = 25;
        b1.y = 50;
        boosts.add(b1);
        
        Boost b2 = new Boost();
        b2.x = 25;
        b2.y = 400;
        boosts.add(b2);
        
        Boost b3 = new Boost();
        b3.x = 755;
        b3.y = 50;
        boosts.add(b3);
        
        Boost b4 = new Boost();
        b4.x = 755;
        b4.y = 400;
        boosts.add(b4);
    }
    
    public void creteFood(){
    // Colocando localização da comida construida
        this.foods = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
           Food food = new Food();
           food.x = 30+i*30;
           food.y = 30;
           foods.add(food);
           
           Food food1 = new Food();
           food1.x = 30+i*30;
           food1.y = 140;
           foods.add(food1);
           
           Food food2 = new Food();
           food2.x = 30+i*30;
           food2.y = 255;
           foods.add(food2);
           
           Food food3 = new Food();
           food3.x = 30+i*30;
           food3.y = 365;
           foods.add(food3);
           
           Food food4 = new Food();
           food4.x = 520+i*30;
           food4.y = 30;
           foods.add(food4);
           
           Food food5 = new Food();
           food5.x = 520+i*30;
           food5.y = 140;
           foods.add(food5);
           
           Food food6 = new Food();
           food6.x = 520+i*30;
           food6.y = 255;
           foods.add(food6);
           
           Food food7 = new Food();
           food7.x = 520+i*30;
           food7.y = 365;
           foods.add(food7);
        }
        for (int i = 0; i < 4; i++) {
           Food food8 = new Food();
           food8.x = 30+i*30;
           food8.y = 85;
           foods.add(food8);
           
           Food food9 = new Food();
           food9.x = 30+i*30;
           food9.y = 200;
           foods.add(food9);
           
           Food food10 = new Food();
           food10.x = 30+i*30;
           food10.y = 315;
           foods.add(food10);
           
           Food food11 = new Food();
           food11.x = 30+i*30;
           food11.y = 440;
           foods.add(food11);
           
           Food food12 = new Food();
           food12.x = 670+i*30;
           food12.y = 85;
           foods.add(food12);
           
           Food food13 = new Food();
           food13.x = 670+i*30;
           food13.y = 200;
           foods.add(food13);
           
           Food food14 = new Food();
           food14.x = 670+i*30;
           food14.y = 315;
           foods.add(food14);
           
           Food food15 = new Food();
           food15.x = 670+i*30;
           food15.y = 440;
           foods.add(food15);
        }
        for (int i = 0; i < 5; i++) {
           Food food16 = new Food();
           food16.x = 480+i*30;
           food16.y = 80;
           foods.add(food16);
           
           Food food17 = new Food();
           food17.x = 480+i*30;
           food17.y = 195;
           foods.add(food17);
           
           Food food18 = new Food();
           food18.x = 480+i*30;
           food18.y = 310;
           foods.add(food18);
           
           Food food19 = new Food();
           food19.x = 480+i*30;
           food19.y = 435;
           foods.add(food19);
           
           Food food20 = new Food();
           food20.x = 180+i*30;
           food20.y = 80;
           foods.add(food20);
           
           Food food21 = new Food();
           food21.x = 180+i*30;
           food21.y = 195;
           foods.add(food21);
           
           Food food22 = new Food();
           food22.x = 180+i*30;
           food22.y = 310;
           foods.add(food22);
           
           Food food23 = new Food();
           food23.x = 180+i*30;
           food23.y = 435;
           foods.add(food23);
           
           Food food24 = new Food();
           food24.x = 330+i*30;
           food24.y = 30;
           foods.add(food24);
           
           Food food25 = new Food();
           food25.x = 330+i*30;
           food25.y = 435;
           foods.add(food25);
        }
        for (int i = 0; i < 12; i++) {
           Food food26 = new Food();
           food26.x = 335;
           food26.y = 65+i*30;
           foods.add(food26);
           
           Food food27 = new Food();
           food27.x = 450;
           food27.y = 65+i*30;
           foods.add(food27);
        }
        for (int i = 0; i < 2; i++) {
           Food food28 = new Food();
           food28.x = 375+i*30;
           food28.y = 135;
           foods.add(food28);
           
           Food food29 = new Food();
           food29.x = 375+i*30;
           food29.y = 80;
           foods.add(food29);
           
           Food food30 = new Food();
           food30.x = 375+i*30;
           food30.y = 250;
           foods.add(food30);
           
           Food food31 = new Food();
           food31.x = 375+i*30;
           food31.y = 360;
           foods.add(food31);
        }
    }
    
    public void createGhosts(){
        this.ghosts = new ArrayList<>();
        // Construindo o Fantasma
        Ghost boo = new Ghost();
        boo.color = new Color(141,254,138);
        boo.x = 385;
        boo.y = 185;
        ghosts.add(boo);
        
        Ghost boo2 = new Ghost();
        boo2.color = new Color(106,254,140);
        boo2.x = 385;
        boo2.y = 230;
        ghosts.add(boo2);
        
        Ghost boo3 = new Ghost();
        boo3.color = new Color(235,198,137);
        boo3.x = 385;
        boo3.y = 350;
        ghosts.add(boo3);
        
        Ghost boo4 = new Ghost();
        boo4.color = new Color(199,252,136);
        boo4.x = 345;
        boo4.y = 350;
        ghosts.add(boo4);
    }
    
    public void createBlocks(){
        this.blocks = new ArrayList<>();
        // linha de baixo 
        Block baixo = new Block();
        baixo.width = 800;
        baixo.x = 0;
        baixo.y = 465;
        blocks.add(baixo);
        
        // linha de cima
        Block cima = new Block();
        cima.width = 800;
        cima.x = 0;
        cima.y = 0;
        blocks.add(cima);
        
        
        //linha da direita
        Block direita = new Block();
        direita.height = 475;
        direita.x = 0;
        direita.y = 0;
        blocks.add(direita);
        
        //linha da esquerda
        Block esquerda = new Block();
        esquerda.height = 475;
        esquerda.x = 790;
        esquerda.y = 0;
        blocks.add(esquerda);

        // labirinto
        
        for (int i = 0; i < 4; i++) { // Construindo paredes pelo (for)
        Block p1 = new Block(); // p1 = "Parede 1"
            p1.height = 55;
            p1.width = 20;
            p1.x = 150;
            p1.y = 410-i*117; // 1
            blocks.add(p1);
        Block p3 = new Block();
            p3.height = 55;
            p3.width = 20;
            p3.x = 300;
            p3.y = 10+i*110; // 2
            blocks.add(p3);
        Block p4 = new Block();
            p4.height = 55;
            p4.width = 20;
            p4.x = 480;
            p4.y = 10+i*110;
            blocks.add(p4);   // 3
        Block p5 = new Block();
            p5.height = 55;
            p5.width = 20;
            p5.x = 630;
            p5.y = 59+i*117; // 4
            blocks.add(p5);
        } 
        
        
        for (int i = 0; i < 3; i++) {
            Block p6 = new Block();
            p6.width = 50;
            p6.x = 120;
            p6.y = 107+i*117;
            blocks.add(p6);
            
            Block p7 = new Block();
            p7.width = 50;
            p7.x = 630;
            p7.y = 107+i*117;
            blocks.add(p7);
            
            Block p8 = new Block();
            p8.width = 80;
            p8.x = 240;
            p8.y = 110+i*114;
            blocks.add(p8);
            
            Block p9 = new Block();
            p9.width = 80;
            p9.x = 480;
            p9.y = 110+i*114;
            blocks.add(p9);
        }
        
        
        for (int i = 0; i < 3; i++) {
            Block p10 = new Block();
            p10.width = 50;
            p10.x = 10;
            p10.y = 107+i*117;
            blocks.add(p10);
            
            Block p11 = new Block();
            p11.width = 50;
            p11.x = 740;
            p11.y = 107+i*117;
            blocks.add(p11);
        }
        
        for (int i = 0; i < 4; i++) {
            Block p12 = new Block();
            p12.width = 30;
            p12.x = 65;
            p12.y = 60+i*117;
            blocks.add(p12);
            
            Block p13 = new Block();
            p13.width = 30;
            p13.x = 700;
            p13.y = 60+i*117;
            blocks.add(p13);
        }
        
        
        for (int i = 0; i < 2; i++) {
            Block p14 = new Block();
            p14.width = 50;
            p14.x = 375;
            p14.y = 60+i*50;
            blocks.add(p14);
            
            Block p15 = new Block();
            p15.width = 50;
            p15.x = 375;
            p15.y = 385+i*700;
            blocks.add(p15);
            
            Block p16 = new Block();
            p16.width = 50;
            p16.x = 375;
            p16.y = 277+i*60;
            blocks.add(p16);
        }
        
        Block p17 = new Block();
            p17.width = 50;
            p17.x = 375;
            p17.y = 170;
            blocks.add(p17);
            
            Block p18 = new Block();
            p18.width = 50;
            p18.x = 375;
            p18.y = 220;
            blocks.add(p18);

        Block p19 = new Block();
            p19.height = 55;
            p19.x = 375;
            p19.y = 170;
            blocks.add(p19);
           
            Block p20 = new Block();
            p20.height = 55;
            p20.x = 415;
            p20.y = 170;
            blocks.add(p20);

       
        for (int i = 0; i < 2; i++) {
            Block p21 = new Block();
            p21.width = 30;
            p21.x = 215+i*335;
            p21.y = 60;
            blocks.add(p21);
            
            Block p22 = new Block();
            p22.width = 30;
            p22.x = 215+i*335;
            p22.y = 400;
            blocks.add(p22);
            
            Block p23 = new Block();
            p23.width = 30;
            p23.x = 215+i*335;
            p23.y = 175;
            blocks.add(p23);
            
            Block p24 = new Block();
            p24.width = 30;
            p24.x = 215+i*335;
            p24.y = 290;
            blocks.add(p24);
        }
    }
    
    public Stage1(){
        createBoosts();
        createBlocks();
        createGhosts();
        creteFood();
    }
    
    public void gameOver(){
    }
    
    public void win(){
    }

    private void base(Graphics g){
        g.setColor(bgcolor);
        g.fillRect(0, 0, getWidth(), getHeight());
        
        // barra preta
        g.setColor(Color.BLACK);
        g.fillRect(0, 480, getWidth(), getHeight());
        
        // barra verde
        g.setColor(new Color(57, 159, 0));
        g.fillRect(0, 490, getWidth(), 40);
        
        // vidas
        for(int i=0;i<pac.lives;i++){
            g.fillRect(50+i*31, 535, 20, 20);
        }
        
        // pontos
        g.setFont(new Font("Arial", Font.BOLD, 35));
        g.setColor(Color.BLACK);
        g.drawString(String.valueOf(this.pac.score), (getWidth()/2)+40, 522);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Criando g2 para usar o Antialiasing
        Graphics2D g2 = (Graphics2D)g;
        // Antialiasing do Graphics2D
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON); // RTX (ON) :3
        
        // pinta base
        base(g);
        
        // Desenha Block
        for(Block b: blocks){
            b.draw(g);
        }
        // Desenha Boost
        for(Boost b: boosts){
            b.draw(g);
        }
        // Desenha Food
        for(Food f: foods){
            f.draw(g);
        }
        // Desenha Ghost
        for(Ghost a: ghosts){
            a.draw(g);
        }
        // Desenha PAC
        pac.move();
        pac.draw(g);
        
        for(Block b: blocks){
            pac.collide(b);
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                long inicio = System.currentTimeMillis();
                repaint();
                Thread.sleep(33);
                long fim = System.currentTimeMillis();
                //System.out.println("Tempo: "+(fim-inicio));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}