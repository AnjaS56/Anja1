package pack02_Geometrija.Krug;
import pack02_Geometrija.Unit.*;

public class Krug extends Oblik implements Obim, Povrsina  {
	private double poluprecnik;
	private double obim, povrsina;
	
	public Krug(Tacka centar, double r) {
		super(centar);
		this.poluprecnik = r;
		setObim();
		setPovrsina();
	}

	public Krug() {
		this(new Tacka(), 10);
	}
	
	public double getPoluprecnik() {
		return poluprecnik;
	}
	
	@Override
	public void setPovrsina() {
		povrsina = Math.pow(getPoluprecnik(), 2) * Math.PI;
	}

	@Override
	public void setObim() {
		obim = 2 * getPoluprecnik() * Math.PI;
	}

	@Override
	public double getObim() {
		return obim;
	}

	@Override
	public double getPovrsina() {
		return povrsina;
	}
	
	@Override
	public String toString() {
		String res = "Krug:";
		/*
		res += "\n\t";
		res += "poluprecnik: " + getPoluprecnik();
		res += "\n\t";
		res += "centar: " + getCentar();
		res +="\n\t";
		res += "povrsina: " + getPovrsina();
		res += "\n\t";
		res += "obim: " + getObim();
		*/
		return res;
	}
	
}
