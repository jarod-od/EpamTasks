package od.jarod.epam.condition_tasks;

/*Даны целые числа m и n. Если числа не равны, то заменить каждое из них одним и тем же числом, 
равным большему из исходных, а если равны, то заменить нулями.*/

import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		
		double m;
		double n;
		
		while (true) {
			
			try {
				System.out.println("Pls input m & n");
				
				Scanner s = new Scanner(System.in);
				m = s.nextDouble();
				n = s.nextDouble();
				
				break;
				
			} catch (Exception e) {
				System.out.println("Invalid input, pls try again");
			}
		}
		
		if (m == n) {
			System.out.println("m & n = 0");
		}
		
		if (m != n) {
			
			if (m > n) {
				System.out.println("m & n = " + m);
			} else {
				System.out.println("m & n = " + n);
			}
		}
	}
}
