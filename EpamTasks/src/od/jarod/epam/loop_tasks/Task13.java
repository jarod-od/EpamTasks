package od.jarod.epam.loop_tasks;

//Составить таблицу значений функции y = 5 – x^2 / 2, на отрезке [ -5; 5] с шагом 0.5

public class Task13 {

	public static void main(String[] args) {

		double x = 4;

		for (double i = -5; i <= 5; i = i + 0.5) {

			double y = i + (5 - (x * x) / 2);

			System.out.println(y);
		}
	}
}
