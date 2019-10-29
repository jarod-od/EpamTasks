package od.jarod.epam.loop_tasks;

// Дано натуральное n. Вычислить: 1 + 1/2 + 1/3 + 1/4...+ 1/n

import java.util.Scanner;

public class Task14 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		double n;
		double sum = 0;

		while (true) {

			try {
				System.out.println("Pls input n");
				System.out.print(">");

				Scanner sc = new Scanner(System.in);

				n = sc.nextDouble();

				break;

			} catch (Exception e) {
				System.out.println("Input invalid, pls try again");
			}
		}

		for (double i = 1; i <= n; i++) {

			sum = sum + 1 / i;
			
			System.out.println(sum);
		}
		
		System.out.println(sum);
	}
}
