package od.jarod.epam.linear_tasks;

// (b + (корень из - b во второй степени + 4 умножить на а и с) делить на 2 * а) 
// минус а в третьей степени умножить на с + b  в минус второй степени

// (b + sqrt(b^2 + 4ac)) / 2a - a^3 c + b ^ (-2)

// Все переменные принимают действительные значения.

import java.util.Scanner;

public class Task08 {
		
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
				
		System.out.println( "Function: (b + sqrt(b^2 + 4ac)) / 2a - a^3 c + b ^ (-2)");
		
		while (true)
			try{
			System.out.println("Pls input a, b, c: ");
			
			Scanner s = new Scanner(System.in);
			a = s.nextDouble();
			b = s.nextDouble();
			c = s.nextDouble();
			
			break;
			
		} catch (Exception e) {
			System.out.println("Invalid input, pls try again");
		}
		
		double z = (b + Math.sqrt(b * b + 4. * a * c)) / 2. * a - a * a * a * c + 1. / (b * b);
		
		System.out.println("Z = " + z);
	}
}
