package od.jarod.epam.condition_tasks;

// Составить программу равны ли два числа а и b?

import java.util.Scanner; 

public class Task04 {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		System.out.println("a & b the same?");
		
		int a;
		int b;
		
		while (true) {
			
			try {
				System.out.println("Pls input a & b");
				
				Scanner s = new Scanner(System.in);
				a = s.nextInt();
				b = s.nextInt();
				
				boolean bool;
				bool = (a == b) ? true : false;

				System.out.println(bool);

				break;
				
			} catch (Exception e) {
				System.out.println("Invalid input, pls try again");
			}
		}
	}
}
