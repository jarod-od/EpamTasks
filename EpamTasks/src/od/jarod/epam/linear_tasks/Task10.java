package od.jarod.epam.linear_tasks;

//  Вычислить значение выражения по формуле (все переменные принимают действительные значения):  
//   (sin x + cos x) / (cos x - sin y) * tg xy

import java.util.Scanner;

public class Task10 {
    
	public static void main(String[] args) {
		
        System.out.println("Function: (sin x + cos y) / (cos x - sin y) * tg xy");

		double x;
		double y;
		
		while (true)
			try {
			System.out.println("Pls input x, y: ");
			
			Scanner s = new Scanner(System.in);
			x = s.nextDouble();
			y = s.nextDouble();
			
			break;
			
		} catch (Exception e) {
			System.out.println("Input invalid, pls try again!");
		}
		
		double z = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		
		System.out.println("Value function is: " + z);
	}
}
