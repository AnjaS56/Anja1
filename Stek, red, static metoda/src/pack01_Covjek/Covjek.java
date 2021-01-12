package pack01_Covjek;

public class Covjek implements SrpskiJezik, EngleskiJezik {
	private String ime, prezime;
	private int godine;
	
	public Covjek(String ime, String prezime, int godine) {
		this.ime = ime;
		this.prezime = prezime;
		this.godine = godine;
	}
	
	public String getIme() {
		return ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	public int getGodine() {
		return godine;
	}
	
	@Override
	public String toString() {
		return ime + " " + prezime + " godine: " + godine;
	}
	
	@Override
	public void hello() {
		System.out.println("Hello, " + ime + " :)");
	}
	
	@Override
	public void goodbye() {
		System.out.println(ime + ", goodbye!");
	}
	
	@Override
	public void thanks() {
		System.out.println("Thank you!");
	}
	
	@Override
	public void zdravo() {
		System.out.println("Zdravo, " + ime);
	}
	
	@Override
	public void dovidjenja() {
		System.out.println("Dovidjenja, " + ime);
	}
	
	@Override
	public void hvala() {
		System.out.println("Hvala");
	}
	
}
