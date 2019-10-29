package od.jarod.epam.linear_tasks;

// Вычислить длину окружности и площадь круга одного и того же заданного радиуса R

import java.util.Scanner;

public class Task14 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Circumference is: Pi*R^2"); // длина окружности
		System.out.println("Square of circle is: 2*Pi*R");
		
		double radius;
		
		while (true) {
			try {
				System.out.println("Pls input R");
				
				Scanner s = new Scanner(System.in);
				radius = s.nextDouble();
				
				System.out.println("R is: " + radius);
				
				break;
				
			}catch(Exception e) {
				System.out.println("Invalid input, pls try again!");
			}
		}
		System.out.println("Circumference is: " + Math.PI * Math.pow(radius, 2));
		System.out.println("Square is: " + 2 * Math.PI * radius);
	}
}
