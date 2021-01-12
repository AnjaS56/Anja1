package Util;

public class Oblik {
	// Polje oznacavamo kao protected kako bi mogli da mu pristupimo
	// iz podklasa (klase Pravougaonik, Elipsa i Trougao).
	protected Tacka centar;
	protected double obim, povrsina;
	protected static int brojacOblika = 0;
	
		// Staticki inicijalizacioni blok (SIB)
	// ---------------------------------
	// Omogucava da inicijalizujemo (kompleksnije) staticke promenljive.
	// Kada nam nije dovoljna deklaracija sa inicijalizacijom, onda promenljivu
	// mozemo inicijalizovati u SIB-u.
	// SIB se izvrsava pri pokretanju programa, odnosno izvrsava se JEDNOM,
	// dakle POLJA ne mozemo inicijalizovati u SIB-u.
	static {
		// U SIB-u mozemo pisati naredbe.
		// brojacOlika = 0;
	}

	public Oblik(Tacka c) {
		// Primetimo da instanca klase Oblik dobija
		// SOPSTVENU KOPIJU tacke od koje se konstruise,
		// ne koristi prosledjenu tacku direktno.
		
		// Pozivamo konstruktor kopije za tacku.
		centar = new Tacka(c);
	//	centar = c; - koja je razlika izmedju ove i prethidne linije koda
		brojacOblika++;
	}

	/// Konstruktor kopije.
	public Oblik(Oblik o) {
		// Mozemo delegirati odgovornost vec implementiranom konstruktoru.
		this(o.centar);
	}

	public Oblik(double x, double y) {
		centar = new Tacka(x, y);
	}

	public Oblik() {
		centar = new Tacka();
	}

	public Tacka getCentar() {
		return centar;
	}
	
	public double getObim() {
		return obim;
	}

	public double getPovrsinu() {
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

