package Elipsa;
import Util.Tacka;

public class Krug extends Elipsa {
	public Krug(Tacka c, double r) {
		// Poziva se konstruktor Elipsa(Tacka c, double a, double b)
		super(c, r, r);
		setPovrsina();
	}

	public Krug(double x, double y, double r) {
		// Poziva se konstruktor Elipsa(double x, double y, double a, double b)
		super(x, y, r, r);
		setPovrsina();
	}
	
	public Krug(double r) {
		// Poziva se konstruktor Elipsa(ouble a, double b)
		super(r, r);
		setPovrsina();
	}

	/// Konstruktor kopije
	public Krug(Krug t) {
		super(t.centar, t.a, t.a);
		setPovrsina();
	}
	
	public double getPoluprecnik() {
		return this.a;
	}
	
	private void setPovrsina() {
		povrsina = Math.pow(super.a, 2) * Math.PI;
	}
	
	@Override
	protected String toStringHelp() {
		String res = "\tcentar = " + centar.toString();
		res += "\n";
		res += "\tpoluprecnik = " + a;
		res += "\n";
		res += "\tobim = " + obim;
		res += "\n";
		res += "\tpovrsina = " + povrsina;
		return res;
	}
	
	@Override
	public String toString() {
		String res = "Krug:";
		res += "\n";
		res += toStringHelp();
		return res;
	}
	
}
