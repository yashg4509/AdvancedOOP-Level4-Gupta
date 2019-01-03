package _04_02_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;


import javax.imageio.ImageIO;

public class ImageMorph extends Polymorph{

	
	BufferedImage img;
	
	
	ImageMorph(int x, int y) {
		super(x, y);
		try {
			img = ImageIO.read(this.getClass().getResourceAsStream("x1c.jpeg"));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	
	@Override
	public void draw(Graphics g) {
		g.drawImage(img, getX(), getY(),100,100, null);	
	}
	
}
