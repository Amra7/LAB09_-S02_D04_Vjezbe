
public class TestPredavanjeOverload {
	
	/**
	 * 
	 * @param args
	 */
	
	public static void ispis () {
	System.out.println("nisi nista proslijedio");
	}
	
	      public static void ispis (int x) {
		  System.out.printf("Proslijedio si cijeli broj %d", x);
		   }
	            public static int ispis (String str, double d) {
			   System.out.printf("Proslijedio si cijeli strin  %s i broj %2.f \n",str,d);
			   return (int) d;
			    }
		
     public static void main(String[] args) {
	ispis();
	ispis(4);
	System.out.println(ispis("1",2));
	
	
    	 
    	 
}
}
