package od.jarod.epam.condition_tasks;

// Определить, делителем каких чисел a, b, c является число k.

public class Task20 {

	public static void main(String[] args) {

		int a = 55;
		int b = 60;
		int c = 80;

		int k = 5;

		if ((a % k) == 0) {
			System.out.println("k is 'a' number divider.");
		} else {
			System.out.println("k is not 'a' number divider");
		}

		
		if ((b % k) == 0) {
			System.out.println("k is 'b' number divider.");
		} else {
			System.out.println("k is not 'b' number divider");
		}

		
		if ((c % k) == 0) {
			System.out.println("k is 'c' number divider.");
		} else {
			System.out.println("k is not 'c' number divider");
		}

	}

}
