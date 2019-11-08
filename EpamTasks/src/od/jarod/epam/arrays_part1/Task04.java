package od.jarod.epam.arrays_part1;

// Дана последовательность действительных чисел. Выяснить, будет ли она возрастающей.

public class Task04 {
	public static void main(String[] args) {

		double[] elements = { 42., 3., 2., 1., 0., -7 };
		
		String str = "temp";
		for (int i = 1; i < elements.length; i++) {

			if (elements[i] >= elements[i - 1]) {
				str = "возрастающая";
				
			} else {
				str = "убывающая";
			}
		}
		System.out.println("Последовательность - " + str);
	}
}
