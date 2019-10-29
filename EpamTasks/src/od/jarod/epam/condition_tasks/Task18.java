package od.jarod.epam.condition_tasks;

// Подсчитать количество отрицательных чисел среди a, b, c.

// import java.util.Scanner;

public class Task18 {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = -2;
		int c = 8;
		
		int sum = 0;
		
		if (a < 0) {
			sum = sum + 1;
		}
		
		 if (b < 0) {
			sum = sum + 1;
		 }
		 
		if (c < 0) {
			sum = sum + 1;
		}
				
		System.out.println(sum);
		}
	}
