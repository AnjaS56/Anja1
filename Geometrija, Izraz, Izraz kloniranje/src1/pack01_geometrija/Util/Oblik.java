package pack01_geometrija.Util;

public abstract class Oblik {
	// Polje oznacavamo kao protected kako bi mogli da mu pristupimo
	// iz podklasa (klase Pravougaonik, Elipsa i Trougao).
	protected Tacka centar;
	protected double obim, povrsina;
	protected static int brojacOblika;
	
		// Staticki inicijalizacioni blok (SIB)
	// ---------------------------------
	// Omogucava da inicijalizujemo (kompleksnije) staticke promenljive.
	// Kada nam nije dovoljna deklaracija sa inicijalizacijom, onda promenljivu
	// mozemo inicijalizovati u SIB-u.
	// SIB se izvrsava pri pokretanju programa, odnosno izvrsava se JEDNOM,
	// dakle POLJA ne mozemo inicijalizovati u SIB-u.
	static {
		// U SIB-u mozemo pisati naredbe.
		brojacOblika = 0;
	}

	public Oblik(Tacka c) {
		centar = new Tacka(c);
		brojacOblika++;
	}

	/// Konstruktor kopije.
	public Oblik(Oblik o) {
		this(o.centar);
	}

	public Oblik(double x, double y) {
		this(new Tacka(x, y));
	}

	public Oblik() {
		this(new Tacka());
	}
	
	protected abstract void setObim();
	protected abstract void setPovrsina();
	

	public Tacka getCentar() {
		return centar;
	}
	
	public double getObim() {
		return obim;
	}

	public double getPovrsina() {
		return povrsina;
	}
	
	public int getBrojacOblika() {
		return brojacOblika;
	}

	protected String toStringHelp() {
		String res = "\tcentar = " + centar.toString();
		res += "\n";
		res += "\tobim = " + obim;
		res += "\n";
		res += "\tpovrsina = " + povrsina;
		return res;
	}

	public String toString() {
		String res = "Oblik:\n";
		res += "\n";
		res += toStringHelp();
		return res;
	}
}
