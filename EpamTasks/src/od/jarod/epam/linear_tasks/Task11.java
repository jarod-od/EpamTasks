package od.jarod.epam.linear_tasks;

// Вычислить периметр и площадь прямоугольного треугольника, по длинам a и b двух катетов

import java.util.Scanner;

public class Task11 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		double a;
		double b;
		
		double perimetr;
		double square;
		
		while (true)
			try {
				System.out.println("Pls input a, b: ");
				
				Scanner s = new Scanner(System.in);
				a = s.nextDouble();
				b = s.nextDouble();
				
				break;
			} catch (Exception e) {
				System.out.println("Invalid input, pls try again");
			}
		
		double c = Math.sqrt((a * a) + (b * b));
		
		perimetr = a + b + c;
		square = (a * b) / 2;
		System.out.println("Perimetr = " + perimetr);
		System.out.println("Square = " + square);
	
	}
}
