package pack06_DefineMetod;

public class MainClass implements SumaParnihINeparnihBrojeva {
	
	private static int suma(int... nums) {
		int s=0;
		for(int i:nums) {
			s+=i;
		}
		return s;
	}
	
	public static void main(String[] args) {
		SumaParnihINeparnihBrojeva demo = new MainClass();
         
        int sumOfEvens = demo.addEvenNumbers(1,2,3,4,5,6,7,8,9);
        System.out.println(sumOfEvens);
         
        int sumOfOdds = demo.addOddNumbers(1,2,3,4,5,6,7,8,9);
        System.out.println(sumOfOdds);
        
        // ilustracija primjera metode koja ima ulazni parametar int...
        System.out.println(suma(3,5,7,12,4));
    } 
}
