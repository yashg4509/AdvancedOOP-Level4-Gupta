package _04_02_Polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener {
    public static final int WIDTH = 900;
    public static final int HEIGHT = 600;
    
    private JFrame window;
    private Timer timer;
    
    ArrayList<Polymorph> morphs = new ArrayList<Polymorph>();
    Polymorph bluePoly;
    Polymorph redPoly;
    Polymorph movingPoly;
    Polymorph circlePoly;
    Polymorph mousePoly;
    Polymorph imgPoly;
    Polymorph clickMorph;
    
    public static void main(String[] args) {
   	 new PolymorphWindow().buildWindow();
    }
    
    public void buildWindow(){
    	bluePoly = new BluePolymorph(50, 50);
    	redPoly = new RedMorph(100,100);
    	movingPoly = new MovingMorph(150,150);
    	circlePoly = new CirclePolymorph(70, 70);
    	mousePoly = new MouseMorph(123, 123);
    	imgPoly = new ImageMorph(60, 60);
    	clickMorph = new ClickPolymorph(40, 40);
    	
    	morphs.add(bluePoly);
    	morphs.add(redPoly);
    	morphs.add(movingPoly);
    	morphs.add(circlePoly);
    	morphs.add(mousePoly);
    	morphs.add(imgPoly);
    	morphs.add(clickMorph);
    	
    	window = new JFrame("IT'S MORPHIN' TIME!");
    	window.add(this);
    	window.getContentPane().setPreferredSize(new Dimension(500, 500));
    	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	window.pack();
    	window.setVisible(true);
    	window.addMouseMotionListener((MouseMorph) mousePoly);
   	 
   	 
   	 	timer = new Timer(1000 / 30, this);
   	 	timer.start();
    }
    
    public void paintComponent(Graphics g){
    //draw background
   	 g.setColor(Color.LIGHT_GRAY);
   	 g.fillRect(0, 0, 500, 500);
   	
   	 //draw polymorph
   	 
   	 for(Polymorph e: morphs) {
   		 e.draw(g);
   	 }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
   	 repaint();
   	 
   	 for(Polymorph p: morphs) {
   		 p.update();
   	 }
   	 
    }

	
}