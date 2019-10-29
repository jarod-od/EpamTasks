package od.jarod.epam.linear_tasks;

// Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и объем этого куба.

import java.util.Scanner;

public class Task18 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Square of line is: S = a^2");
		System.out.println("Square of cube is: S = 6a^2");
		System.out.println("Volume of cube is: V = a^3");
		
		double a;
		
		while (true) {
			
			try {
				System.out.println("Pls input a:");
				
				Scanner s = new Scanner(System.in);
				a = s.nextDouble();
				
				System.out.println("a = " + a);
				
				break;
				
			} catch (Exception e) {
				System.out.println("Invalid input, pls try again");
			}		
		}
		
		System.out.println("Square of line is:" + Math.pow(a, 2));
		System.out.println("Square of cube is:" + 6 * Math.pow(a, 2));
		System.out.println("Volume of cube is:" + Math.pow(a, 3));
		
	}
}
