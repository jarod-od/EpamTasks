package od.jarod.epam.linear_tasks;

// Вычислить расстояние между двумя точками (х1, у1) и (x2, y2).

import java.util.Scanner;


public class Task12 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("Function is: 1 / (x2 - x1)^2 + (y2 - y1)^2" );
		
		double x1;
		double x2;
		double y1;
		double y2;
		
		while (true)
			try {
			System.out.println("Pls input x1, x2, y1, y2 ");
			
			Scanner s = new Scanner(System.in);
			x1 = s.nextDouble();
			x2 = s.nextDouble();
			y1 = s.nextDouble();
			y2 = s.nextDouble();
			
			break;
			
		}catch (Exception e) {
			System.out.println("Input invalid, pls try again!");
		}
		
		double z = Math.sqrt (Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		
		System.out.println("Value z is " + z);
	}
}
