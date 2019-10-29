package od.jarod.epam.loop_tasks;

/*
 * Напишите программу, где пользователь вводит любое целое положительное число.
 * А программа суммирует все числа от 1 до введенного пользователем.
*/

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {

		int a;
		int sum = 0;

		while (true) {

			try {
				System.out.println("Pls input a number > ");

				Scanner sc = new Scanner(System.in);
				a = sc.nextInt();

				break;

			} catch (Exception e) {
				System.out.println("Invalid input, pls try again");
			}
		}

		//if (a != 0 && (a / a) == 1) TODO запилить проверку, как узнаю 
			
			for (int i = 1; i <= a; i++) {
				sum = sum + i;
			}
			System.out.println(sum);
		}
	}

