package pack04_Red;

public class Niz implements Red {
	private int kapacitet = 1000;
	private int[] elementi = new int[kapacitet];
	private int pocetak, kraj, brElemenata;
	
	// Ne navodimo konstruktor, dovoljan nam je podrazumevani.

	@Override
	public void add(int x) {
		if (brElemenata == kapacitet-1) {
			System.err.println("Red je popunjen!");
			return;
		}

		elementi[kraj] = x;
		brElemenata++;
		kraj = (kraj + 1) % kapacitet;
	}

	@Override
	public int remove() {
		if (brElemenata == 0) {
			System.err.println("Red je prazan!");
			return 0;
		}

		int tmp = elementi[pocetak];
		pocetak = (pocetak + 1) % kapacitet;
		brElemenata--;
		return tmp;
	}

	@Override
	public int head() {
		if (brElemenata == 0) {
			System.err.println("Red je prazan!");
			return 0;
		}
		return elementi[pocetak];
	}

	@Override
	public int back() {
		if (brElemenata == 0) {
			System.err.println("Red je prazan!");
			return 0;
		}
		if (kraj == 0)
			return elementi[kapacitet-1];
		else
			return elementi[kraj-1];
	}

	@Override
	public void prikaziRed() {
		System.out.print("[ ");
		
		int i = pocetak;
		while (i != kraj) {
			System.out.print(elementi[i] + " ");
			i = (i + 1) % kapacitet;
		}
		
		System.out.println("]");
	}

	@Override
	public int size() {
		return brElemenata;
	}
}

