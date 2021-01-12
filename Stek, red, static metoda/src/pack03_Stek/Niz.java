package pack03_Stek;

public class Niz implements Stek {
	private int[] elementi;
	private int vrhSteka, kapacitet;

	public Niz() {
		this(10);
	}

	public Niz(int kapacitet) {
		this.kapacitet = kapacitet;
		vrhSteka = -1;
		elementi = new int[kapacitet];
	}

	public int getKapacitet() {
		return kapacitet;
	}

	@Override
	public int pop() {
		if (vrhSteka == -1) {
			System.err.println("Stek je prazan");
			return 0;
		}
		
		return elementi[vrhSteka--];
	}

	@Override
	public boolean push(int x) {
		if (vrhSteka == kapacitet-1) {
			return false;
		}
		vrhSteka++;
		elementi[vrhSteka] = x;
		return true;
		
	}

	@Override
	public int top() {
		if (vrhSteka == -1) {
			System.err.println("Stek je prazan");
			return 0;
		}

		return elementi[vrhSteka];
	}
	
	@Override
	public void show() {
		System.out.println("Sadrzaj: [ " + toString() + "]");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= vrhSteka; i++)
			sb.append(elementi[i]).append(" ");
		return sb.toString();
	}

	@Override
	public int size() {
		return vrhSteka + 1;
	}
}
