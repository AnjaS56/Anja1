/*
 * Generišu se slucajni brojevi manji od 100 sve dok se ne izgeneriše 3 fibonacijevih
 * brojeva. Ispitati koliko je do tada generisano brojeva ciji su
 * prosti faktori samo 2 i 3.
 */

import java.util.Random;

public class G1_Zadatak_02 {
	static boolean prost23(int n) {
		if(n==1)
			return false;
		while(n%2 == 0)
			n = n/2;
		while(n%3 == 0)
			n /= 3;
		
		return n==1;
	}

	public static void main(String[] args) {
		int[] fibonacijeviBrojevi = {1, 2, 3, 5, 8, 13, 21, 34, 55, 89};
		int brojFibonacijevih = 0, trazeniBroj = 0;
		Random rand = new Random();
		System.out.println("Generisani brojevi su:");
		while(brojFibonacijevih<3) {
			int k = rand.nextInt(100);
			System.out.print(k + ", ");
			if(prost23(k))
				trazeniBroj++;
			for(int f:fibonacijeviBrojevi)
				if(f == k) {
					brojFibonacijevih++;
					break;
				}
		}
		System.out.println();
		System.out.println("Trazeni broj je " + trazeniBroj);
	}

}
