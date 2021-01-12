/*
 * U niz se unose datumi kao stringovi formata dd-mm-yyyy. Napisati program koji sortira niz datuma
 */


import java.util.Scanner;

public interface G1_Zadatak_01 {
	
	static int veciDatum(String datum1, String datum2) {
		int dan1 = Integer.parseInt(datum1.substring(0, 2));
		int mjesec1 = Integer.parseInt(datum1.substring(3, 5));
		int godina1 = Integer.parseInt(datum1.substring(6));
		
		// drugi nacin
		String[] dmg = datum2.split("-");
		int dan2 = Integer.parseInt(dmg[0]);
		int mjesec2 = Integer.parseInt(dmg[1]);
		int godina2 = Integer.parseInt(dmg[2]);
		
		int res = 0;
		if(godina1<godina2)
			res = 2;
		if(res==0 && godina1>godina2)
			res = 1;
		if(res==0 && mjesec1>mjesec2)
			res = 1;
		if(res==0 && mjesec1<mjesec2)
			res = 2;
		if(res==0 && dan1>dan2)
			res = 1;
		if(res==0 && dan1<dan2)
			res = 2;
		return res;
	}
	
	static String[] sort(String[] datumi) {
		for(int i=0; i<datumi.length-1; i++)
			for(int j=i+1; j<datumi.length; j++)
				if(veciDatum(datumi[i], datumi[j])==2) {
					String temp = datumi[i];
					datumi[i] = datumi[j];
					datumi[j] = temp;
				}
		return datumi;
	}

	public static void main(String[] args) {
		Scanner unosSaTastature = new Scanner(System.in);
		System.out.println("Unesite duzinu niza datuma: ");
		int n = unosSaTastature.nextInt();
		String[] datumi = new String[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Unesite " + (i+1) + "-ti datum: ");
			String datum = unosSaTastature.next();
			datumi[i] = datum;
			
			// Uporedjivanje stringova: "".compareTo(datum.strip())!=0
			
		}
		unosSaTastature.close();
		
		datumi = sort(datumi);
		for(String d:datumi)
			System.out.println(d);
	}

}
