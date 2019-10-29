package od.jarod.epam.loop_tasks;

// С помощью оператора while напишите программу вывода всех четных чисел в диапазоне от 2 до 100

public class Task04 {

	public static void main(String[] args) {

		int i = 2;

		while (i <= 100) {
			/*
			 * System.out.print( i + " ");
			 *  i += 2;
			 */

			if (i % 2 == 0)

				System.out.println(i);
			i++;
		}
	}
}
