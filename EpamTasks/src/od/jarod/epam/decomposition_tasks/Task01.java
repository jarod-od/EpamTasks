package od.jarod.epam.decomposition_tasks;

import java.util.Random;

// Треугольник задан координатами своих вершин. Написать метод для вычисления его площади

public class Task01 {
	public static void main(String[] args) {
		
		int n = 6;
		double[] dots = new double[n];
		
		initWithRandom(dots);
		print(dots);
		
		System.out.println();
		
		double square = squareCalculate(dots);
		System.out.println(square);
	}
	
	public static double squareCalculate(double[] dots) {
//		square = 1/2 * ((x1-x3) * (y2-y3) - (y1-y3) * (x2-x3))

		double square = 0.5 * ((dots[0] - dots[2]) * (dots[4] - dots[5]) - (dots[3] -dots[5] * (dots[1] - dots[2])));

		return square;
	}
	
	public static void initWithRandom(double[] dots) {
		Random rand = new Random(); // объект генерирующий числа

		for (int i = 0; i < dots.length; i++) {
			dots[i] = rand.nextInt(100);
		}
	}
	
	public static void print(double[] dots) {
		for(int i = 0; i < dots.length; i++) {
			System.out.print(dots[i] + ", ");
		} 
	}
	
}

