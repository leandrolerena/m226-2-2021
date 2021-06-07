package grafikeditor_4.figuren;

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
