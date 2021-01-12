package Krug;

import java.lang.Math;
import java.util.Scanner;

public class Krug {
	private int poluprecnik=0;
	private int centar_x=0, centar_y=0;
	private double povrsina=0.0, obim=0.0;
	private Scanner scan = new Scanner(System.in);

	
	public void setPoluprecnik(int r) {
		poluprecnik = r;
		povrsina = Math.PI * Math.pow(poluprecnik, 2);
		obim = 2 * poluprecnik * Math.PI;
		
		povrsina = Math.round(povrsina * 100.0) / 100.0;
		obim = Math.round(obim * 100.0)/100.0;
	}
	
	public void setPoluprecnik() {
		System.out.println("Unesite poluprecnik kruga:");
		poluprecnik = scan.nextInt();
		povrsina = Math.PI * Math.pow(poluprecnik, 2);
		obim = 2 * poluprecnik * Math.PI;
		
		povrsina = Math.round(povrsina * 100.0) / 100.0;
		obim = Math.round(obim * 100.0)/100.0;
	}
	
	public int getPoluprecnik() {
		return poluprecnik;
	}
	
	public double getPovrsina() {
		return povrsina;
	}
	
	public double getObim() {
		 return obim;
	}
	
	public void setCentar() {
		System.out.print("X: ");
		centar_x = scan.nextInt();
		System.out.print("Y: ");
		centar_y = scan.nextInt();
	}
	 
	public int getCenatarX() {
		 return centar_x;
	}
	 
	public int getCenatarY() {
		 return centar_y;
	}
	
	public void ispisKruga() {
		System.out.println("Krug K:");
		System.out.println("\tcentar: " + centar_x + ", " + centar_y);
		System.out.println("\tpoluprecnik: " + poluprecnik);
		System.out.println("\tpovrsina: " + povrsina);
		System.out.println("\tobim: " + obim);
	}
	
	public int odnosKrugova(Krug k2) {
		double d = Math.sqrt(Math.pow(centar_x - k2.centar_x, 2) + Math.pow(centar_y -k2.centar_y, 2));
		if(d<(poluprecnik + k2.poluprecnik))
			return -1;
		else if (d==poluprecnik+k2.poluprecnik)
			return 0;
		return 1;
	}
}
