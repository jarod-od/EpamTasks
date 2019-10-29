package od.jarod.epam.linear_tasks;

// Даны два числа. Найти среднее арифметическое кубов этих чисел и среднее геометрическое модулей этого числа.

import java.util.Scanner;

public class Task17 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Find midrange cube of numbers");
		
		int a;
		int b;
		
		double midrangeCube;
		double midrangeGeometricModules;
		
		while (true) {
			try {
				System.out.println("Pls input pair of numbers");
				
				Scanner s = new Scanner(System.in);
				a = s.nextInt();
				b = s.nextInt();
				
				System.out.println("a = " + a + ", b = " + b );
				break;
				
			} catch (Exception e){
				System.out.println("Invalid input, pls try again!");
			}
		}
		
		midrangeCube = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
		
		System.out.println("Midrange of cubes number is: " + midrangeCube);
		
		
		midrangeGeometricModules = Math.sqrt(a * b);
		
		System.out.println("MidrangeGeometricModules is: " + midrangeGeometricModules);
	}
}
