package od.jarod.epam.linear_tasks;

// Написать программу, которая выводит на экран первые четыре степени числа Пи

public class Task15 {

	public static void main(String[] args) {
		
		System.out.println("Pi^1,2,3,4");
		
		double pi = 1.;
		for (int i = 1; i <= 4; i++) {
			pi = pi * Math.PI;
			
			System.out.println("Power of Pi is: " + pi); 
		}
	}
}
