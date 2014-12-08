
public class DjeljivoSa3i5DoWhile {
public static void main(String[] args) {
	
		System.out.println("unesi jedan broj: ");
		int num = TextIO.getInt();

		int count1 = 0;
		int count2 = 0;
		int i = 1;

		do {
			if (i % 3 == 0) {
				count1++;
			}
			if (i % 5 == 0) {
				count2++;
			}
			i++;

		} while (i <= num);
		System.out.printf("Broje je djeljiv sa 3 %d puta i sa 5 %d puta ",
				count1, count2);
}
}
