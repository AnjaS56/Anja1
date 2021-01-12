package pack02_Geometrija.Unit;

public abstract class Oblik {
	private Tacka centar;
	
	public Oblik(Tacka centar) {
		this.centar = new Tacka(centar);
	}
	
	public Tacka getCentar() {
		return centar;
	}

}
