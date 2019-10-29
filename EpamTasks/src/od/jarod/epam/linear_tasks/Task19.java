package od.jarod.epam.linear_tasks;

// Дана сторона равностороннего треугольника. Найти площадь этого треугольника, его высоту,
// радиусы вписанной и описанной окружности.

import java.util.Scanner;

public class Task19 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Square of triangle is: S = (a^2*root3) / 4");
		System.out.println("Height of triangle is: h = (a*root3) / 2");
		System.out.println("Radiuses of triangle cicumference is: r = a*(root3/6) & R = a*(root3 / 3)");
		
		double lenghtLine;
		
		while (true) {
			try {
				System.out.println("Pls input variable:");
				
				Scanner s = new Scanner(System.in);
				lenghtLine = s.nextDouble();
				
				break;
				
			} catch (Exception e) {
				System.out.println("Invalid input, pls try again!");
			}
		}
		
//	S = (a^2 * root3) / 4 
//	h = (a * root3) / 2
//	r = a * (root3 / 6)
//	R = a * (root3 / 3)
		
		System.out.println("Square is: " + (Math.pow(lenghtLine, 2) * Math.sqrt(3)) / 4);
		System.out.println("Height is: " + (lenghtLine * Math.sqrt(3)) / 2);
		System.out.println("Cicumference in is: " + (lenghtLine * Math.sqrt(3)) / 6);
		System.out.println("Cicumference out is: " + (lenghtLine * Math.sqrt(3)) / 3);
	}
}
