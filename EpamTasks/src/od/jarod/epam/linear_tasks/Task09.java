package od.jarod.epam.linear_tasks;

// Вычислить значение выражения по формуле. Все переменные принимают действительные значения
// (a/c * b/d) -(ab - c) / cd

import java.util.Scanner;

public class Task09 {
	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double d;
		
		System.out.println("(a/c * b/d) -(ab - c) / cd");
		
		while (true)
			try{
			System.out.println("Pls input a, b, c, d: ");
			
			Scanner s = new Scanner(System.in);
			a = s.nextDouble();
			b = s.nextDouble();
			c = s.nextDouble();
			d = s.nextDouble();
				
			break;
			
		}catch (Exception e) {
			System.out.println("Invalid input, pls try again!");
		}
		
		double value = ((a / c) * (b / d)) - (a * b)  / d;
		
		System.out.println(value);
	}
}
