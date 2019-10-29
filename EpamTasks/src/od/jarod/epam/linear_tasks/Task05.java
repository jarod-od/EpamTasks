package od.jarod.epam.linear_tasks;

// Составить алгоритм нахождения среднеарифметического двух чисел.

import java.util.Scanner;

public class Task05 {
	
	@SuppressWarnings("resource")
	
	public static void main(String[] args) {
		int a;
		int b;
		
		
		while (true)
			try {
				System.out.println("Pls input a, b: ");
				
				Scanner s = new Scanner(System.in);
				a = s.nextInt();
				b = s.nextInt();
				
			break;	
			
			} catch (Exception e) {
				System.out.println("Invalid input, pls try again!");
			}
		
		int z = (a + b) / 2;
		
		System.out.println("Midrange is " + z );
	}
}
