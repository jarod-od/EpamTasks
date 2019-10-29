package od.jarod.epam.linear_tasks;

// Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.

import java.util.Scanner;

public class Task20 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Square circle is: S = πR²");
		System.out.println("a circleLengt is: C = 2πR ");
		System.out.println("radius is: C / 2*π ");

		
	double circleLengt;
	
		while (true) {
			
			try {
				System.out.println("Pls input a circleLengt: ");
				
				Scanner s = new Scanner(System.in);
				circleLengt = s.nextDouble();
				
				break;
				
			} catch (Exception e) {
				System.out.println("Invalid input, pls try again!");
			}
		}
		
		/*
		 * C = 2πR длина окружности
		 * 18,84 = 2 * 3,14 *R 
		 * R = 18.84 / 6.28  R = 3м радиус окружности
		 * S = πR² площадь окружности 
		 * S = 3.14 *3 ² = 3.14 * 9 = 28.26м² = 28,3м²
		 */

		double radius = circleLengt / (2 * Math.PI);
		
		System.out.println("Square of circle is: " + Math.PI * Math.pow(radius, 2));
		
		
	}
}
