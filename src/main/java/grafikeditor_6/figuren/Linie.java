package grafikeditor_6.figuren;

import java.awt.*;

public class Linie extends Figur {
	private int endX;
	private int endY;

	public Linie(int x, int y, int endX, int endY) {
		super(x, y, Color.BLACK, false);
		this.setEndX(endX);
		this.setEndY(endY);
	}

	public Linie(int x, int y, int endX, int endY, Color farbe) {
		super(x, y, farbe, false);
		this.setEndX(endX);
		this.setEndY(endY);
	}

	public int getEndX() {
		return endX;
	}

	public void setEndX(int endX) {
		this.endX = endX;
	}

	public int getEndY() {
		return endY;
	}

	public void setEndY(int endY) {
		this.endY = endY;
	}

	@Override
	public void draw(Graphics g) {
		g.drawLine(x, y, endX, endY);
	}

	@Override
	public void move(int deltaX, int deltaY) {
		super.move(deltaX, deltaY);
		this.endX += deltaX;
		this.endY += deltaY;
	}
}
