package od.jarod.epam.condition_tasks;

//Составить программу нахождения наименьшего  из квадратов двух чисел a и b

import java.util.Scanner;

public class Task08 {

	public static void main (String[] args) {
		
		double a;
		double b;
		
		while (true) {
			try {
				System.out.println("Pls input a & b: ");
				
				Scanner sc = new Scanner(System.in);
				a = sc.nextDouble();
				b = sc.nextDouble();
				
				System.out.println("a is: " + a + " and b is: " + b);
				
				break;
				
			} catch (Exception e) {
				System.out.println("Invalid input, pls try again");
			}
		}
		
		
		String s;
		s = (Math.sqrt(a) < Math.sqrt(b)) ? "a" : "b";
		System.out.println("Smaller square number is: " + s);
	}
}
