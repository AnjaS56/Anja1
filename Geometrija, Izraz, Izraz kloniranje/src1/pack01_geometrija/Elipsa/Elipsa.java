package pack01_geometrija.Elipsa;

import pack01_geometrija.Util.*;

public class Elipsa extends Oblik {
	protected double a, b;

	public Elipsa(Tacka centar, double a, double b) {
		super(centar);
		init(a, b);
	}
	
	public Elipsa(double x, double y, double a, double b) {
		super(x, y);
		init(a, b);
	}

	public Elipsa(double a, double b) {
		super();
		init(a, b);
	}

	// Konstruktor kopije
	public Elipsa(Elipsa p) {
		super(p.centar);
		init(p.a, p.b);
	}
	
	@Override
	protected void setObim() {
		// Priblizna vrijednost, inace se racuna preko eliptickih integrala
		obim = a * Math.PI * (9 - Math.sqrt(35))/2;
	}
	
	@Override
	protected void setPovrsina() {
		super.povrsina = a * b * Math.PI;
	}
	
	private void init(double a, double b) {
		this.a = a;
		this.b = b;
		setObim();
		setPovrsina();
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	@Override
	protected String toStringHelp() {
		String res = "\ta = " + a;
		res += "\n";
		res += "\tb = " + b;
		res += "\n";
		res += super.toStringHelp();
		return res;
	}

	@Override
	public String toString() {
		String res = "Elipsa: \n";
		res += toStringHelp();
		return res;
	}

}
