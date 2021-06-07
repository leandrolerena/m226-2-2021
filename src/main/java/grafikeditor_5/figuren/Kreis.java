package grafikeditor_5.figuren;

import java.awt.*;

public class Kreis extends Figur {
	private int radius;

	public Kreis(int x, int y, int radius) {
		super(x, y, Color.BLACK, false);
		this.setRadius(radius);
	}

	public Kreis(int x, int y, int radius, Color farbe, boolean ausgefuellt) {
		super(x, y, farbe, ausgefuellt);
		this.setRadius(radius);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw(Graphics g) {
		g.drawOval(this.x - radius, this.y - radius, radius*2,  radius*2);
	}
}
