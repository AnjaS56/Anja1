package pack02_Geometrija.Pravougaonik;

import pack02_Geometrija.Unit.*;

//Kvadrat ne implementira direktno interfejse 'Povrsina' i 'Obim',
//no ipak ih poseduje jer ih nasledjuje od klase 'Pravougaonik'.
public class Kvadrat  extends Pravougaonik {
	public Kvadrat(Tacka centar, double a) {
		super(centar, a, a);
	}
	
	public double getStranica() {
		return getSirina();
	}
}
