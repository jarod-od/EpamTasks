package od.jarod.epam.condition_tasks;

/*
 *  Даны три действительных числа. Возвести  в квадрат те из них, значения которых неотрицательны, 
 *  и в четвертую степень - отрицательные
*/

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;

		while (true) {
			try {

				System.out.println("Pls input a, b, c: ");

				Scanner s = new Scanner(System.in);
				a = s.nextDouble();
				b = s.nextDouble();
				c = s.nextDouble();

				System.out.println("a is: " + a + ", b is: " + b + ", c is: " + c);

				break;

			} catch (Exception e) {
				System.out.println("Invalid input, pls try again");
			}
		}

		if (a >= 0) {
			System.out.println("a is: " + Math.pow(a, 2));
			
		} else {
			System.out.println("a is: " + Math.pow(a, 4));
		}

		if (b >= 0) {
			System.out.println("b is: " + Math.pow(b, 2));
			
		} else {
			System.out.println("b is: " + Math.pow(b, 4));
		}

		if (c >= 0) {
			System.out.println("c is: " + Math.pow(c, 2));
			
		} else {
			System.out.println("c is: " + Math.pow(c, 4));

		}

	}
}
