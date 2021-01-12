package pack01_geometrija.Pravougaonik;

import pack01_geometrija.Util.*;

public class Pravougaonik extends Oblik {
	protected double sirina, visina;
	protected Tacka tjemeA, tjemeB, tjemeC, tjemeD;

	public Pravougaonik(Tacka centar, double sirina, double visina) {
		super(centar);
		init(sirina, visina);
	}

	public Pravougaonik(double x, double y, double sirina, double visina) {
		super(x, y);
		init(sirina, visina);
	}

	public Pravougaonik(double sirina, double visina) {
		super();
		init(sirina, visina);
	}

	public Pravougaonik(Pravougaonik p) {
		super(p.centar);
		init(p.sirina, p.visina);
	}
	
	@Override
	protected void setObim() {
		obim = 2 * (visina + sirina);
	}
	
	@Override
	protected void setPovrsina() {
		povrsina = visina * sirina;
	}

	private void init(double sirina, double visina) {
		this.visina = visina;
		this.sirina = sirina;
		
		setObim();
		setPovrsina();
		
		double adx = centar.getX() - sirina/2;
		double bcx = centar.getX() + sirina/2;
		double aby = centar.getY() - visina/2;
		double cdy = centar.getY() + visina/2;
		this.tjemeA = new Tacka(adx, aby);
		this.tjemeB = new Tacka(bcx, aby);
		this.tjemeC = new Tacka(bcx, cdy);
		this.tjemeD = new Tacka(adx, cdy);
	}

	public double getSirina() {
		return sirina;
	}

	public double getVisina() {
		return visina;
	}
	
	public Tacka getTjemeA() {
		return tjemeA;
	}
	
	public Tacka getTjemeB() {
		return tjemeB;
	}
	
	public Tacka getTjemeC() {
		return tjemeC;
	}
	
	public Tacka getTjemeD() {
		return tjemeD;
	}

	@Override
	protected String toStringHelp() {
		String res = "\tsirina = " + sirina;
		res += "\n";
		res += "\tvisina = " + visina;
		res += "\n";
		res += "\ttjemena: ";
		res += "A" + tjemeA.toString();
		res += "\tB" + tjemeB.toString();
		res += "\tC" + tjemeC.toString();
		res += "\tD" + tjemeD.toString();
		res += "\n";
		res += super.toStringHelp();
		return res;
	}
	
	@Override
	public String toString() {
		String res = "Pravougaonik:";
		res += "\n";
		res += toStringHelp();
		return res;
	}
}
