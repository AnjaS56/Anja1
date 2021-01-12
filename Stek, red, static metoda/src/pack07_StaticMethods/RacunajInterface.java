package pack07_StaticMethods;

public interface RacunajInterface {
	 public abstract void mul(int a, int b); 
	  
	 public default void
	     add(int a, int b) 
	     {
	         System.out.println("Javni difoltni metod add"); 
	         System.out.printf("%d + %d = %d", a, b, a + b); 
	         System.out.println();
	     } 
	   
	     public static void mod(int a, int b) 
	     {
	         System.out.println("Javni staticki metod mod"); 
	         System.out.printf("%d %% %d = %d", a, b, a % b);   // String str="%"; System.out.printf("%d %s %d = %d", a, str, b, a % b);
	         System.out.println();
	     } 
	   
	     private void sub(int a, int b) 
	     { 
	         System.out.println("Privatni metod sub");
	    	 System.out.printf("%d - %d = %d", a, b, a - b); 
	         System.out.println();
	     } 
	   
	     private static void div(int a, int b) 
	     { 
	         System.out.println("privatni staticki metod div ");
	    	 System.out.printf("%d / %d = %d", a, b, a / b); 
	         System.out.println();
	     } 
	     
	     public static void pozivStatickihMetodeDIV(int a, int b) {
	    	 div(a, b);
	     }
	     
	     public default void pozivPrivatneMetodeSUB(int a, int b) {
	    	 sub(a, b);
	     }
}
