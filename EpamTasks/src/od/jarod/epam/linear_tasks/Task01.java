package od.jarod.epam.linear_tasks;

import java.util.Scanner;

// Даны два действительных числа х и у.
// Вычислить их сумму, разность, произведение и частное.

public class Task01 {
	/*
	 * private int x; private int y;
	 * 
	 * public int getX() { return x; }
	 * 
	 * public void setX(int x) { this.x = x; }
	 * 
	 * public int getY() { return y; }
	 * 
	 * public void setY(int y) { this.y = y; }
	 */

	@SuppressWarnings("resource")
	
	public static void main(String[] args) {
		/*
		 * Task01 exmpl = new Task01(); exmpl.setX(100); exmpl.setY(200);
		 * System.out.println("Sum = " + (exmpl.getX() + exmpl.getY()) );
		 */
		int x;
		int y;

		while (true) {
			try {
				System.out.println("Input x, y: ");

				Scanner s = new Scanner(System.in);
				x = s.nextInt();
				y = s.nextInt();
				
				break;
				
			} catch (Exception e) {
				System.out.println("Invalid input, sorry. Try again!");
			}
		}
		
		System.out.println("Sum of x + y = " + (x + y));
		System.out.println("Difference of x + y = " + (x - y));
		System.out.println("Multi of x + y = " + (x * y));
		System.out.println("Divide of x + y = " + (x / y));
	}
}
