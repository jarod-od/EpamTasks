package od.jarod.epam.linear_tasks;

// Дан прямоугольник, ширина которого в два раза меньше длины. Найти площадь прямоугольника.

import java.util.Scanner;

public class Task07 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int a;
		int b;
		
		int square;
		 
		while (true)
			try {
				System.out.println("Pls input long side a: ");
				
				Scanner s = new Scanner(System.in);
				a = s.nextInt();
				
				break;
				
		} catch (Exception e) {
			System.out.println("Input invalid, pls try again!");
		}
		
		b = a / 2;
		square = a * b;
		
		System.out.println("Square of rectangular is " + square);
	}
}
