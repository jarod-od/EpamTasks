package od.jarod.epam.arrays_part1;

/*Дана последовательность чисел. Создать массив из четных чисел этой последовательности. 
Если таких чисел нет, то вывести сообщение об этом факте.
*/
public class Task05 {
	public static void main(String[] args) {

		int[] elem = { 22, 10, 3, 35, 18, 71 };

		int countOdds = 0; // Нечетные числа
		for (int i = 0; i < elem.length; i++) {
			if (elem[i] % 2 == 1) {
				countOdds++;
			}
		}

		int[] evenNumbers = new int[elem.length - countOdds];
		int[] oddsNumbers = new int[countOdds];

		int odds = 0;
		int countEvens = 0;

		for (int i = 0; i < elem.length; i++) {
			if (elem[i] % 2 == 0) {
				evenNumbers[countEvens] = elem[i];
				countEvens++;

			} else {
				oddsNumbers[odds++] = elem[i];
			}
		}

		for (int i = 0; i < evenNumbers.length; i++) {
			System.out.println(evenNumbers[i]);
		}

		if (countEvens == 0) {
			System.out.println("Arrays does not consist evens numbers");
		}
	}
}
