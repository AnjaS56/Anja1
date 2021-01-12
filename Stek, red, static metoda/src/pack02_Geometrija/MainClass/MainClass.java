package pack02_Geometrija.MainClass;

import pack02_Geometrija.Duz.*;
import pack02_Geometrija.Krug.*;
import pack02_Geometrija.Pravougaonik.*;
import pack02_Geometrija.Unit.*;

public class MainClass {

	public static void main(String[] args) {
		Pravougaonik pravougaonik = new Pravougaonik();
		Kvadrat kvadrat = new Kvadrat(new Tacka(2, 3), 10);
		Krug krug = new Krug();
		
		// prouzrokovace gresku
		Povrsina[] povrsine = {pravougaonik, kvadrat, krug /*, Duz */};
		for (Povrsina p: povrsine) {
			System.out.println(p);
			System.out.println("P = " + p.getPovrsina());
			if (p instanceof Obim) {
				System.out.println("O = " + ((Obim)p).getObim());
			}
			System.out.println();
		}
		
		/*
		 for (Povrsina p: povrsine)
		 	System.out.println(p);
		 */
		
		Duz duz = new Duz(new Tacka(), new Tacka(2, 3));
		// Greska pri kompilaciji jer implicitno kastovanje
		// provjerava da li moze da se izvrsi kastovanje.
		// Povrsina p = duz;
		
		// Nije greska u kompilaciji, ali jeste greska u fazi izvrsavanja (sto je losije od prethodnog).
		// Povrsina p = (Povrsina)duz;
		// System.out.println(p.getPovrsina());
	}

}
