package od.jarod.epam.condition_tasks;

// Составить программу: определения наименьшего из двух чисел а и b

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		System.out.println("Find minority a or b");
		
		int a;
		int b;
		
		while (true) {
			
			try {
				System.out.println("Pls input a & b:");
				
				Scanner s = new Scanner (System.in);
				a = s.nextInt();
				b = s.nextInt();
				
				break;
				
			} catch (Exception e) {
				System.out.println("Invalid input, pls try again");
			}
		}
			String answer;
			
			answer = (a < b) ? "a" : "b";
			
			System.out.println("Minority number is:" + answer);
			
	}
}
