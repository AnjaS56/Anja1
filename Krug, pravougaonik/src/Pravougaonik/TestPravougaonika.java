package Pravougaonik;

public class TestPravougaonika {

	public static void main(String[] args) {
		/*
		 * Sta mozemo primijetiti ukoliko se radi o javnim atributima? Da li uvijek imamo korektne podatke?
		Pravougaonik p = new Pravougaonik();
		p.stranica_a = 12;
		p.stranica_b = 8;
		p.ispis();
		p.obim = 40;
		p.povrsina = 96;
		p.ispis();
		p.povrsina = 23234;
		p.obim = 17;
		p.ispis();
		*/
		
		Pravougaonik p1 = new Pravougaonik();
		p1.setTjeme(2, 1);
		p1.setStranica();
		System.out.println("Ovaj pravpugaonik ima povrsinu " + p1.getPovrsina());
		System.out.println("poziv metode ispis");
		p1.ispis();
		
		Pravougaonik p2 = new Pravougaonik();
		p2.setTjeme(-2, 0);
		p2.setStranica(12, 5);
		p2.ispis();
	}

}
