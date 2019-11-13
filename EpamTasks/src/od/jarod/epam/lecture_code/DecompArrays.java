package od.jarod.epam.lecture_code;

import java.util.Random;

public class DecompArrays {

	public static void main(String[] args) {

		int n = 7;
		int[] array = new int[n];
			
		initWithRandom(array);
		print(array);
		
		  // TODO sum = sumK(array, 2);
	}

	public static void initWithRandom(int[] array) {
		Random rand = new Random(); // объект генерирующий числа

		for (int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(100);
		}
	}
	
	public static void print(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		} 
		System.out.println();
	}
	public static int sumК(int[] array, int k) { // найти сумму чисел кратному К
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
			int sum = 0;
			sum += array[i];
			}
		}
		return 0;
	}
}
