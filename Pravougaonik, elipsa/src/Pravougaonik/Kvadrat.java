package Pravougaonik;
import Util.Tacka;

public class Kvadrat extends Pravougaonik {
	public Kvadrat(Tacka c, double a) {
		// Poziva se konstruktor Pravougaonik(Tacka c, double sirina, double visina)
		super(c, a, a);
	}

	public Kvadrat(double x, double y, double a) {
		// Poziva se konstruktor Pravougaonik(double x, double y, double sirina, double visina)
		super(x, y, a, a);
	}
	
	public Kvadrat(double a) {
		// Poziva se konstruktor Pravougaonik(double sirina, double visina)
		super(a, a);
	}

	/// Konstruktor kopije
	public Kvadrat(Kvadrat t) {
		// Poziva se konstruktor Pravougaonik(Tacka c, double sirina, double visina)
		super(t.centar, t.sirina, t.sirina);
	}
	
	public double getDimenzija() {
		return this.sirina;
	}

	public String toString() {
		return "Kvadrat centar = " + centar + " a = " + sirina;
	}
}
