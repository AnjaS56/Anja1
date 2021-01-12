/*
 * Popuniti matricu slucajnim prirodnim brojevima do 100, matrica je dimenzije 6x6. Sortirati elemente
 * matrice dijagonalno (opadajuce) (sve dijagonale krenuvši od glavne su sortirane u opadajucem poretku).
 */

import java.util.Random;

public class G1_Zadatak_03 {
	static void sort_niza(int[] niz) {
		int n = niz.length;
		for(int i=0; i<n-1; i++)
			for(int j=i+1; j<n; j++)
				if(niz[i]<niz[j]) {
					int temp = niz[i];
					niz[i] = niz[j];
					niz[j] = temp;
				}
	}
	static void sort_matrice(int[][] mat) {
		int n = mat.length;    // broj vrsta
		for(int k=0; k<n; k++) {
			int[] niz = new int[n-k];
			for(int i=0; i<n-k; i++)
				niz[i] = mat[i][i+k];
			sort_niza(niz);
			for(int i=0; i<n-k; i++)
				mat[i][i+k] = niz[i];
		}
	}
	static void ispis_matrice(int[][] mat) {
		int n = mat.length;
		int m = mat[0].length;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++)
				System.out.printf("%3d", mat[i][j]);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Random rand = new Random();
		int[][] matrica = new int[6][6];
		for(int i=0; i<6; i++)
			for(int j=0; j<6; j++)
				matrica[i][j] = rand.nextInt(100);
		System.out.println("Generisana matrica je:");
		ispis_matrice(matrica);
		sort_matrice(matrica);
		System.out.println();
		System.out.println("Sortirana matrica:");
		ispis_matrice(matrica);

	}

}
