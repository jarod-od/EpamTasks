package od.jarod.epam.condition_tasks;

/*Даны действительные числа х и у, не равные друг другу.
Меньшее из этих чисел заменить  половиной их суммы, а большее - их удвоенным произведением.
*/

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {

		double x;
		double y;

		while (true) {

			try {
				System.out.println("Pls input x & y. Number should't be equals ");

				Scanner s = new Scanner(System.in);
				x = s.nextDouble();
				y = s.nextDouble();

				break;

			} catch (Exception e) {
				System.out.println("Input invalid");
			}
		}

		if (x != y) {

			if (x < y) {
				System.out.println("x is: " + (x + y) / 2);
				
			} else {
				System.out.println("y is: " + (x * y) * 2);

			}

			if (x == y) {
				System.out.println("Numbers are equals");
			}
		}
	}
}
