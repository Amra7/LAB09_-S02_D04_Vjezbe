import java.util.Scanner;


public class ProsjekBrojeva {
public static void main(String[] args) {
	
	
	System.out.println("Unesi broj:" );
			Scanner in = new Scanner (System.in);
			int num = in.nextInt();
			
			
        	int count = 0;
			int suma = 0;
			
			
			do  {
				System.out.println(" unesi broj:" );
				suma = suma + num ;
				count++;
				System.out.printf(" prosjek brojeva je %d", (double)suma/count );
			} while ( num != -1);
			
}
}
