package grafikeditor_6.figuren;

import java.awt.*;

public class Rechteck extends Figur {
	private int breite;
	private int hoehe;
	
	public Rechteck(int x, int y, int breite, int hoehe) {
		super(x, y, Color.BLACK, false);
		this.setBreite(breite);
		this.setHoehe(hoehe);
	}

	public Rechteck(int x, int y, int breite, int hoehe, Color farbe, boolean ausgefuellt) {
		super(x, y, farbe, ausgefuellt);
		this.setBreite(breite);
		this.setHoehe(hoehe);
	}

	public Rechteck(Point firstPoint, Point secondPoint) {
		super(0, 0, Color.BLACK, false);

		Point a, b, c, d;

		a = new Point(Math.min(firstPoint.x, secondPoint.x), Math.min(firstPoint.y, secondPoint.y));
		b = new Point(Math.min(firstPoint.x, secondPoint.x), Math.max(firstPoint.y, secondPoint.y));
		c = new Point(Math.max(firstPoint.x, secondPoint.x), Math.min(firstPoint.y, secondPoint.y));
		d = new Point(Math.max(firstPoint.x, secondPoint.x), Math.max(firstPoint.y, secondPoint.y));

		this.x = a.x;
		this.y = a.y;
		this.farbe = Color.BLACK;
		this.aufgefuellt = false;

		this.setHoehe((int) a.distance(b));
		this.setBreite((int) a.distance(c));
	}

	public int getBreite() {
		return breite;
	}

	public void setBreite(int breite) {
		this.breite = breite;
	}

	public int getHoehe() {
		return hoehe;
	}

	public void setHoehe(int hoehe) {
		this.hoehe = hoehe;
	}

	@Override
	public void draw(Graphics g) {
		g.drawRect(x, y, breite, hoehe);
	}

}
