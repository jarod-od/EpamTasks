package od.jarod.epam.condition_tasks;

// Составить программу, которая определит по трём введенным сторонам, 
// является ли данный треугольник равносторонним.

import java.util.Scanner;

public class Task09 {

	public static void main (String[] args) {
		
		System.out.println("Pls input a, b, c: ");
		
		int a;
		int b;
		int c;
		
		while (true) {
			try {
				Scanner s = new Scanner(System.in);
				a = s.nextInt();
				b = s.nextInt();
				c = s.nextInt();
				
				System.out.println("a is: "+ a + ", b is: " + b + ", c is:" + c);
				
				break;
				
			} catch (Exception e) {
				System.out.println("Invalid input, pls try again");
			}
		}
		
		
		
		if (a == b && b == c && a == c) {
			System.out.println("Triangle is deuce!");
		} else {
			System.out.println("This triangle is not deuce!");
		}
	}
}
