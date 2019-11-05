package od.jarod.epam.arrays_part1;

//Дана последовательность целых чисел. Выяснить, какое число встречается раньше 
//	- положительное или отрицательное

public class Task03 {
	public static void main(String[] args) {

		int[] numbers = { 3, 4, -5, 8, -45 };

		String marker = " ";
		for (int i = 0; i < numbers.length;) {

			if (numbers[i] < 0) {
				marker = "First element is negative: " + numbers[i];
				break;

			} else {
				marker = "First element is positive: " + numbers[i];
				break;
			}
		}
		System.out.println(marker);
	}
}
