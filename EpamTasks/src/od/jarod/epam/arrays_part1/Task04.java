package od.jarod.epam.arrays_part1;

// Дана последовательность действительных чисел. Выяснить, будет ли она возрастающей.

public class Task04 {
	public static void main(String[] args) {

		double[] elements = { 22., 33., 44., 55., 66., 77 };
		
		String str = "temp";
		for (int i = 0; i < elements.length-1; i++) {

			if (elements[i+1] > elements[i]) {
				str = "быц";
				System.out.println(elements[i]);
				
			} else {
				str = "тыц";
			}
		}
		System.out.println("Последовательность - " + str);
	}
}
