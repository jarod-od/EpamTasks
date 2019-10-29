package od.jarod.epam.loop_tasks;

// Вычислить (1+2) * (1+2+3) * ... * (1+2+...+10)

public class Task16 {

	public static void main(String[] args) {
		
		int multi = 1;
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			
			sum = sum + i;
			multi = multi * sum;
			
			System.out.println(multi);
		}
		
		System.out.println(multi);
	}
}
