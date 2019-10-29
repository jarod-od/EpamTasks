package od.jarod.epam.loop_tasks;

/*
 * Последовательность an строится так: a1 = 1, an = 6 + an-1, для каждого n > 1. 
 * Составьте программу нахождения первых 10 членов этой последовательности.
*/

public class Task12 {

	public static void main(String[] args) {

		int a = 2;

		for (int i = 1; i <= 10; i++) {

			a = 6 + (a - 1);

			System.out.println(a);
		}
	}
}
