package od.jarod.epam.linear_tasks;

// Найдите значение функции: c = 3 + a.

import java.util.Scanner;

public class Task02 {

	@SuppressWarnings("resource")
	
	public static void main(String[] args) {
		int a;
		
		while (true) 
		try {
			System.out.println("Pls, input a: ");
			
			Scanner s = new Scanner(System.in);
			a = s.nextInt();
			
			break;
		} catch (Exception e) {
			System.out.println("Invalid input, pls try again!");
		}
		
		System.out.println("c = " + (3 + a) );
	}
}
