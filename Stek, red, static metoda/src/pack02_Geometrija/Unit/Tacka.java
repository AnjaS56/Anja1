package pack02_Geometrija.Unit;

public class Tacka {
	private double x, y;
	
	public Tacka(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Tacka() {
		this(0, 0);
	}
	
	public Tacka(Tacka t) {
		this(t.x, t.y);
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public String toString() {
		return "(" + getX() + ", " + getY() + ")";
	}

}
