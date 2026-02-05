package _05_Polymorphs;

import java.awt.Graphics;

public abstract class Polymorph {
    private int x;
    private int y;
    private int WIDTH;
    private int HEIGHT;
    
    public Polymorph(int x, int y, int width, int height){
   	 this.x = x;
   	 this.y = y;
   	 this.WIDTH = width;
   	 this.HEIGHT = height;
    }
    
    public int getX() {
    	return x;
    }
    
    public void setX(int x) {
    	this.x = x;
    }
    
    public int getY() {
    	return y;
    }
    
    public void setY(int y) {
    	this.y = y;
    }
    
    public int getWidth() {
    	return WIDTH;
    }
    
    public void setWidth(int width) {
    	this.WIDTH = width;
    }
    
    public int getHeight() {
    	return WIDTH;
    }
    
    public void setHeight(int height) {
    	this.HEIGHT = height;
    }
    
    
    public abstract void update();
    
    public abstract void draw(Graphics g);
}
