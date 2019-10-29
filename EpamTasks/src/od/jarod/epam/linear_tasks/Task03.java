package od.jarod.epam.linear_tasks;

// Найдите значение функции:
// z = 2 * x + (y - 2) * 5

import java.util.Scanner;

public class Task03 {

	@SuppressWarnings("resource")
	
	public static void main(String[] args) {
		int x = 5;
		int y = 7;

		while (true)
		 	try {
		 		System.out.println("Pls type x, y: ");
		 		
		 		Scanner s = new Scanner(System.in);
		 		x = s.nextInt();
		 		y = s.nextInt();
		 		
		 		break;
			
		 	} catch (Exception e) {
			System.out.println("Input invalid, pls try again!");
		}

		int z = 2 * x + (y - 2) * 5;
		
		System.out.println("z = " + z);
	}
}
