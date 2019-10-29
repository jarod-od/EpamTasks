package od.jarod.epam.condition_tasks;

/*
 * Составить программу сравнения двух чисел 1 и 2. 
 * Если 1 меньше 2 - вывести на экран слово "yes", в противном случае слово "no"
 */

import java.util.Scanner;

public class Task02 {
	
	public static void main (String[] args) {
		
		System.out.println("if a < b, then print - yes");
		
		byte a;
		byte b;
		
		while (true) {
			try {
				System.out.println("Pls input a & b");
				Scanner s = new Scanner(System.in);
				a = s.nextByte();
				b = s.nextByte();
				
				break;
				
			} catch (Exception e) {
				System.out.println("Invalid input");
			}
		}
		
		String answer;
		
		answer = (a < b) ? "yes" : "no";
		
		System.out.println(answer);
		
	}
}
