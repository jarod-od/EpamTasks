package od.jarod.epam.condition_tasks;

/*На плоскости XOY задана своими координатами точка А. 
Указать где она расположена (на какой оси или в каком координатном угле)*/

import java.util.Scanner;

public class Task16 {

	public static void main (String[] args) {
		
		System.out.println("Where is dot A?");
		
		double x;
		double y;
		
		while (true) {
			
			try {
				System.out.println("Pls, input x & y: ");
				
				Scanner s = new Scanner(System.in);
				x = s.nextDouble();
				y = s.nextDouble();
				
				break;
				
			} catch (Exception e) {
				System.out.println("Input invalid");
			}
		}
		
		System.out.print("Dot A is on: ");
		
		if (x == 0 && y == 0) {
			System.out.println("zero position");
			
		} else if (x == 0 && y > 0) {
			System.out.println("y-axis");
			
		} else if (y == 0 && x > 0) {
			System.out.println("x-axis");
			
		} else if (x > 0 && y > 0) {
			System.out.println("first quarter");
			
		} else if (x < 0 && y < 0) {
			System.out.println("third quarter");
			
		} else if (x > 0 && y < 0) {
			System.out.println("fourth quarter");
			
		} else if (x < 0 && y > 0) {
			System.out.println("second quarter");
		}
	}
}
