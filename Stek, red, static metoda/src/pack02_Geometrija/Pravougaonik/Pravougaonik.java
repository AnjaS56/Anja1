package pack02_Geometrija.Pravougaonik;

import pack02_Geometrija.Unit.*;

public class Pravougaonik extends Oblik implements Obim, Povrsina {
	private double sirina, visina;
	protected double obim, povrsina;

	public Pravougaonik(Tacka centar, double sirina, double visina) {
		super(centar);
		this.sirina = sirina;
		this.visina = visina;
		setObim();
		setPovrsina();
	}

	public Pravougaonik() {
		this(new Tacka(), 10, 20);
	}
	
	public double getSirina() {
		return sirina;
	}
	
	public double getVisina() {
		return visina;
	}
	
	@Override
	public void setObim() {
		obim = 2 * (visina + sirina);
	}
	
	@Override
	public void setPovrsina() {
		povrsina = visina * sirina;
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
		String classname= this.getClass().getName();
		classname = classname.substring(classname.lastIndexOf('.') + 1);
		String res = classname + ":";
		/*
		res += "\n\t";
		res += "sirina: " + getSirina();
		res += "\n\t";
		res += "visina: " + getVisina();
		res +="\n\t";
		res += "povrsina: " + getPovrsina();
		res += "\n\t";
		res += "obim: " + getObim();
		*/
		return res;
	}
}
