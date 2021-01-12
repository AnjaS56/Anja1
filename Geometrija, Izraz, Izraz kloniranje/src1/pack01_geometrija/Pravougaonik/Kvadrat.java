package pack01_geometrija.Pravougaonik;

import pack01_geometrija.Util.*;

public class Kvadrat extends Pravougaonik {
	public Kvadrat(Tacka c, double a) {
		super(c, a, a);
	}

	public Kvadrat(double x, double y, double a) {
		super(x, y, a, a);
	}
	
	public Kvadrat(double a) {
		super(a, a);
	}

	public Kvadrat(Kvadrat t) {
		super(t.centar, t.sirina, t.sirina);
	}
	
	public double getDimenzija() {
		return this.sirina;
	}

	public String toString() {
		String res = "Kvadrat:";
		res += "\n";
		res += super.toStringHelp();
		return res;
	}
}

