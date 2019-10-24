import java.util.Scanner;

public class Criogenizacion_374 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int casos;
		long n = 0;
		long min = Integer.MAX_VALUE;
		long max = Integer.MIN_VALUE;
		long contmax = 0;
		long contmin = 0;
		
		casos = sc.nextInt();
		
		for (int i = 0; i < casos; i++){

			
			n = sc.nextInt();

			
			
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
