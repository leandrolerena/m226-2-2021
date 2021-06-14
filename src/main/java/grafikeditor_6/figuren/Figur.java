package grafikeditor_6.figuren;

import java.awt.*;

public abstract class Figur {
	protected int x;
	protected int y;
	protected Color farbe;
	protected boolean aufgefuellt;

	public Figur (int x, int y, Color farbe, boolean ausgefuellt) {
		this.x = x;
		this.y = y;
		this.farbe = farbe;
		this.aufgefuellt = ausgefuellt;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Color getfarbe() {
		return farbe;
	}

	public abstract void draw(Graphics g);

	public void move(int deltaX, int deltaY){
		this.x += deltaX;
		this.y += deltaY;
	}

}
