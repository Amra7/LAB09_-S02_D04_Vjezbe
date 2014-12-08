
public class Piramide {
/**
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5 
 * 1 2 3 4 5 6
 */
	public static void piramida1(int n) {
		//ova petlja ispisuje n redova
		  for (int i = 1; i <=n; i++) {
		                              for ( int j = 1;j<= i; j++){
			                                     System.out.printf("%-3d", j);
		                                                          }
		                   System.out.println();  
	                                   }	
         }
	
	/**
	 * za n ispisuje:
	 *           1
	 *         1 2
	 *       1 2 3
	 *      ....
	 *   1 2 ...(n-1)
	 * 1 2 3 ... n
	 * 
	 */
	public static void piramida2(int a){
		for (int i =1; i<=a; i++) 
		{
			System.out.println();  
			      for ( int j= 1; j<=a-i; j++ ) {
			    	  System.out.printf("%3s","");
			      }
		 	            for ( int k= 1; k<=i; k++ ) {
		 		                System.out.printf("%3s",k);
		 	                       }
		 	  
		}
		System.out.println(); 
	}
	
	
	       public static void main(String[] args) {
		
		   piramida2(6);
	     }
}
