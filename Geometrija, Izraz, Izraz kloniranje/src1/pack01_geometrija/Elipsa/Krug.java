package pack01_geometrija.Elipsa;

import pack01_geometrija.Util.Tacka;

public class Krug extends Elipsa {
	public Krug(Tacka c, double r) {
		super(c, r, r);
		setObim();
	}

	public Krug(double x, double y, double r) {
		super(x, y, r, r);
		setObim();
	}
	
	public Krug(double r) {
		super(r, r);
		setObim();
	}

	// Konstruktor kopije
	public Krug(Krug t) {
		super(t.centar, t.a, t.a);
		setObim();
	}
	
	public double getPoluprecnik() {
		return super.getA();
	}
	
	@Override
	protected void setObim() {
		obim = 2 * super.getA() * Math.PI;
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
