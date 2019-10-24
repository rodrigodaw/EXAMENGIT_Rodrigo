import java.util.Scanner;

public class Criogenización_374 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int contmax = 0;
		int contmin = 0;
		
		while (true) {
			
			n = sc.nextInt();

			if (n==0) {
				break;
			}
			
			if (n > max) {
				
				max = n;
				contmax = 1;
				
			}
			
			if (n < min) {
				
				min = n;
				contmax = 1;
				
			}
			
			if (n == max) {
				
				contmax++;
				
			}
			
			if (n == min) {
				
				contmin++;
				
			}
		
		}
		
		System.out.println( min + " " + contmin + " " + max + " " + contmax);
		
	}
}
