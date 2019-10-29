package od.jarod.epam.loop_tasks;

// Вычислить: 1 + 2 + 4 + 8 + ...+ 2 в 10 степени.

public class Task15 {

	public static void main(String[] args) {
		
		int sum = 1;
		int power = 1;
		
		for (int i = 1; i <= 10; i++) {
			
			sum = sum + power;

			power = power * 2;
			
			System.out.println(sum);
			
		}
			System.out.println(sum);
	}
}
