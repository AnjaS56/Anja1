package Pravougaonik;

import java.util.Scanner;
import java.util.ArrayList;

public class Pravougaonik {
//	public int tjeme_x, tjeme_y, stranica_a, stranica_b, obim, povrsina;
	private int tjeme_x, tjeme_y, stranica_a, stranica_b, obim, povrsina;
	private Scanner scan = new Scanner(System.in);
	
	public void setTjeme(int x, int y) {
		tjeme_x = x;
		tjeme_y = y;
	}
	
	public void setStranica() {
		System.out.print("a: ");
		stranica_a = scan.nextInt();
		System.out.print("b: ");
		stranica_b = scan.nextInt();
		obim = 2 * (stranica_a + stranica_b);
		povrsina = stranica_a * stranica_b;
	}
	
	public void setStranica(int a, int b) {
		stranica_a = a;
		stranica_b = b;
		obim = 2 * (stranica_a + stranica_b);
		povrsina = stranica_a * stranica_b;
	}
	
	public int getObim() {
		return obim;
	}
	
	public int getPovrsina() {
		return povrsina;
	}
	
	public ArrayList<String> getTjemena() {
		ArrayList<String> res = new ArrayList<String>();
		res.add("A(" + tjeme_x + ", " + tjeme_y + ")");
		res.add("B(" + (tjeme_x + stranica_a) + ", " + tjeme_y + ")");
		res.add("C(" + (tjeme_x + stranica_a) + ", " + (tjeme_y + stranica_b) + ")");
		res.add("D(" + tjeme_x + ", " + (tjeme_y + stranica_b) + ")");
		
		return res;
	}
	
	public void ispis() {
		ArrayList<String> tjemenena = getTjemena();
		System.out.print("Pravougaonik sa tjemenima: ");
		for(String t:tjemenena)
			System.out.print(t+"\t");
		System.out.println();
		System.out.println("ima povrsinu: " + povrsina);
		System.out.println("i obim: " + obim);
	}
}
