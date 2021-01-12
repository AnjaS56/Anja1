package Krug1;

public class TestKrug {
	public static Krug kreirajKrug() {
		System.out.println("Kreiranje novog kruga");
		Krug k = new Krug();
		k.setPoluprecnik();
		System.out.println("Cenatar kruga:");
		k.setCentar();
		return k;
	}
	
	public static void main(String[] args) {
		Krug k1 = new Krug();
		k1.setPoluprecnik(3);
		Krug k2 = new Krug();
		k2.setPoluprecnik();
		k2.setCentar();
		k2.ispisKruga();
		Krug k3 = kreirajKrug();
		int odnos1 = k1.odnosKrugova(k2);
		System.out.println("Krugovi");
		k1.ispisKruga();
		System.out.println("i");
		k2.ispisKruga();
		
		if(odnos1 == Konstante.SIJEKUSE)
			System.out.println(" se sijeku");
		else if(odnos1 == Konstante.DODIRUJUSE)
			System.out.println(" se dodiruju");
		else
			System.out.println(" su disjunktni");
	}
}
