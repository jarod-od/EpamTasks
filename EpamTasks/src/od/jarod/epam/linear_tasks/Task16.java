package od.jarod.epam.linear_tasks;

// Найти произведение чисел заданного четырехзначного числа.

import java.util.Scanner;

public class Task16 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("Find a multi of all digits this number");

		int number;
		
		int fourthDigit;
		int thirdDigit;
		int secondDigit;
		int firstDigit;

		while (true) {
			try {
					Scanner s = new Scanner(System.in);
					number = s.nextInt();
					
					if (number < 1000 || number > 9999) {
						System.out.println("Pls input a number between 1000 - 9999");
					}

					break;
				
			} catch (Exception e) {
				System.out.println("Invalid input, pls try again!");
			}
		}
/*
 * Получить остаток от деления на 10. Это будет крайняя правая цифра числа.
 * Получить остаток от деления на 100 и разделить результат на 10. Это будет вторая справа цифра числа.
 * Получить остаток от деления на 1000 и разделить результат на 100. Это будет третья справа цифра числа. 
 * Выполнить целое деление на 1000. Это будет первая слева цифра числа.
 */
		
		fourthDigit = number % 10;
		thirdDigit = (number % 100) / 10;
		secondDigit = (number % 1000) / 100;
		firstDigit = number / 1000;
		
		int multiOfAllDigits = fourthDigit * thirdDigit * secondDigit * firstDigit;
		
		System.out.println("Multi of all digits in your number is: " + multiOfAllDigits);
	}
}


