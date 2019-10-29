package od.jarod.epam.linear_tasks;

// Заданы координаты трех вершин треугольника (x1 y1),(x2 y2),(x3 y3). Найти его периметр и площадь

import java.util.Scanner;

public class Task13 {
	
	public static void main(String[] args) {
		
		System.out.println("Perimetr is: AB + BC + AC");
		System.out.println("Square is: 1/2 (((x1-x3) * (y2-y3)) - ((y1-y3) * (x2-x3)))");

		double[] dot = new double[6];

		while (true) {
			
			try {
				System.out.println("Pls input: x1, x2, x3, y1, y2, y3");

				Scanner s = new Scanner(System.in);
				
				for (int i = 0; i < 6; i++) {
					dot[i] = s.nextDouble();
				}
				
				System.out.println("x1 = " + dot[0] + ", x2 = " + dot[1] + ", x3 = " + dot[2] + ", y1 = " + dot[3] + ", y2 = " + dot[4] + ", y3 = " + dot[5]); 

 				break;
				
			} catch (Exception e) {
				System.out.println("Invalid input, pls try again!");
			}
		}
//		АВ (с) = √((Х2-Х1)²+(У2-У1)²) + BC (а)= √((Х3-Х2)²+(У3-У2)²) + AC (в) = √((Х3-Х1)²+(У3-У1)²)
		
		double perimetr = Math.sqrt(Math.pow(dot[1] - dot[0], 2.) + Math.pow(dot[4] - dot[3], 2.)) + Math.sqrt(Math.pow(dot[2] - dot[1], 2.) + Math.pow(dot[5] - dot[4], 2.)) + Math.sqrt(Math.pow(dot[2] - dot[0], 2.) + Math.pow(dot[5] - dot[3], 2.));
		
		System.out.println("Perimetr of triangle is: " + perimetr);
		
//		square = 1/2 * ((x1-x3) * (y2-y3) - (y1-y3) * (x2-x3))
		
		double square = 0.5 * ((dot[0] - dot[2]) * (dot[4] - dot[5]) - (dot[3] -dot[5] * (dot[1] - dot[2])));
		
		System.out.println("Square of triangle is: " + square);
	}
}
