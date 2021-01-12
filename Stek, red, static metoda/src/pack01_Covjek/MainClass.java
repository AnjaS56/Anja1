package pack01_Covjek;

public class MainClass {

	public static void main(String[] args) {
		Covjek sz = new Covjek("Svetozar", "Zivkovic", 28);
		sz.zdravo();
		sz.hello();
		// Referenca sz koja referise na objekat klase 'Covjek'
		// mozemo kastovati na "NESTO STO IMPLEMENTIRA INTERFEJS 'SrpskiJezik'".
		// Na ovaj nacin mozemo omoguciti polimorfno izvrsavanje metoda,
		// a usput korisnika osloboditi brige o tome sa kojom klasom radi, ono
		// sto je za korisnika bitno je koje to funkcije pruza interfejs.
		
		SrpskiJezik sj = new Covjek("Nikola", "Markovic", 23);
		sj.dovidjenja();
		sj = sz;
		sj.hvala();
		
		EngleskiJezik ej = sz;
		ej.thanks();
		// ej = sj;
		// ej.hvala();

	}

}
