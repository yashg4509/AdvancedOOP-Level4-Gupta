package _04_02_Polymorphs;
import java.awt.Color;
import java.awt.Graphics;

public class CirclePolymorph extends Polymorph{

	int counter = 0;
	CirclePolymorph(int x, int y) {
		super(x, y);
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(getX(), getY(), getWidth(), getHeight());
	}
	
	@Override
	public void update() {
		
		double d = counter;
		int moveX =  (int) (5*Math.cos(Math.toRadians(d)));
		int moveY =  (int) (5*Math.sin(Math.toRadians(d)));
		setX(getX() + moveX);
		setY(getY() + moveY);
		counter += 5;
		
		//setX(getX() + 5);
	}
	
}
