package _05_Polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class MovingMorph extends Polymorph{

	public MovingMorph(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	@Override
	public void update() {
		Random ran = new Random();
		setX(ran.nextInt(500));
		setY(ran.nextInt(500));
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.green);
		g.fillRect(getX(), getY(), getWidth() , getHeight());
		
	}

}
