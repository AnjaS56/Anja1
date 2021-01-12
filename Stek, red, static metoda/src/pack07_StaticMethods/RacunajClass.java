package pack07_StaticMethods;

public class RacunajClass implements RacunajInterface {
	@Override
    public void mul(int a, int b) 
    { 
        System.out.print("Answer by Abstract method = "); 
        System.out.println(a * b); 
    } 
  
    public static void main(String[] args) 
    { 
    	RacunajInterface racunaj = new RacunajClass(); 
    	racunaj.mul(2, 3); 
    	racunaj.add(6, 2);
    	racunaj.pozivPrivatneMetodeSUB(6, 2); 
        RacunajInterface.mod(5, 3); 
        RacunajInterface.pozivStatickihMetodeDIV(5, 3);
    } 
}
