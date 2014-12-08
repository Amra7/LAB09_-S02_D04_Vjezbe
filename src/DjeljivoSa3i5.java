
public class DjeljivoSa3i5 {
public static void main(String[] args) {
	
	System.out.println("unesi jedan broj");
	int num = TextIO.getInt();
	

	int count1 = 0;
	int count2 = 0;
	
	for ( int i = 1; i<=num ; i++) 
	{ 
		if (i % 3 == 0)
		{	
			count1++;	
		}
				              
		if (i % 5 == 0)
		{
			count2++;
		}       
				                      
				
	} 
			System.out.printf("Djeljivo sa 3 %d  i sa 5 %d  puta",count1, count2);
			
}
}
