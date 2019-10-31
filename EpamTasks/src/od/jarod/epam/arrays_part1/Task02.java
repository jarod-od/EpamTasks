package od.jarod.epam.arrays_part1;

/*
 * В целочисленной последовательности есть нулевые элементы. 
   Создать массив из номеров этих элементов
*/

public class Task02 {
	public static void main(String[] args) {
		
		int[] elem = {0, 33, 23, 0, 87, 0, 4,-3};
		
		int counterZeroNumbers = 0;
		
		for (int i = 0; i < elem.length; i++) {
			if (elem[i] == 0) {
				counterZeroNumbers++;
//				System.out.println(elem[i]);
			}	
		}
		System.out.println(counterZeroNumbers);
		
		int[] zeroNumbers = new int[counterZeroNumbers];
		for (int i = 0; i < zeroNumbers.length; i++) {
			System.out.println(zeroNumbers[i]);
		}
	}
}
