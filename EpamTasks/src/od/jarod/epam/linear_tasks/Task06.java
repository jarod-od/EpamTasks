package od.jarod.epam.linear_tasks;

// В n малых бидонах 80 литров молока. Сколько литров молока в m больших бидонах,
// если в каждом большом бидоне на 12 литров больше чем в малом?

import java.util.Scanner;

public class Task06 {

	@SuppressWarnings("resource")

	public static void main(String[] args) {
		int n;
		int m;

		while (true)
			try {
				System.out.println("Pls input n, m: ");

				Scanner s = new Scanner(System.in);
				n = s.nextInt();
				m = s.nextInt();

				break;

			} catch (Exception e) {
				System.out.println("Invalid input, pls try again!");
			}

		int z = ((80 / n) + 12) * m;

		System.out.println("In " + m + " can of milk " + z + " litres of milk");
	}
}
