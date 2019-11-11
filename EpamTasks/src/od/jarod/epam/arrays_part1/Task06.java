package od.jarod.epam.arrays_part1;

/*Дана последовательность чисел. 
Указать наименьшую длину числовой оси, содержащую все числа.
*/
public class Task06 {
	public static void main(String[] args) {
		
		int [] digits = {20, 4, 55, 8, 60, 87, 32};
		
		int max = digits[0];
		int min = digits[0];
		
		for(int i = 1; i < digits.length; i++) {
			
			if(digits[i] > max) {
				max = digits[i];
				
			} else if (digits[i] < min) {
				min = digits[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
		System.out.println("x axis length is: " + (max - min));
	}
}
