package od.jarod.epam.condition_tasks;

// Составить программу, которая определит площадь какого круга меньше.

import java.util.Scanner;

public class Task10 {

	public static void main (String[] args) {
		
		System.out.println("Circle square is: PI*R^2");
		
		double radius1;
		double radius2;
		
		while (true) {
			try {
				System.out.println("Pls input radius 1 and radius 2:");
				
				Scanner s = new Scanner(System.in);
				radius1 = s.nextDouble();
				radius2 = s.nextDouble();
				
				System.out.println("radius 1 is:" + radius1 + ", radius 2 is: " + radius2);
				
				break;
				
			} catch (Exception e) {
				System.out.println("Invalid input, pls try again");
			}
		}
		
		double square1 = Math.PI * Math.pow(radius1, 2.);
		System.out.println("Square of first circle is:" + square1);
		
		double square2 = Math.PI * Math.pow(radius2, 2);
		System.out.println("Square of second circle is: " + square2);
		
		
		String compare;
		compare = (square1 < square2) ? "Circle with radius 1 is smaller" : "Circle with radius 2 is bigger";
		
		System.out.println(compare);
	}
}
