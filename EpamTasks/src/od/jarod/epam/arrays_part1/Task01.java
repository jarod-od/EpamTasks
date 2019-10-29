package od.jarod.epam.arrays_part1;

//В массив А[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Task01 {
	public static void main(String[] args) {
		
		int[] elem = {22, 33, 44, 55, 6, 77, 8, 9};
		
		int sum = 0;
		int divider = 2;
		
		for (int i = 0; i < elem.length; i++) {
			
			if (i%2 == 0) {
				sum = sum + elem[i];
			}
		}
		System.out.println(sum);
		
	}
}
