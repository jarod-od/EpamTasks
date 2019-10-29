package od.jarod.epam.loop_tasks;

// Составить программу нахождения произведения квадратов первых двухсот чисел

public class Task10 {

	public static void main(String[] args) {

		int i;
		int multi = 1;

		for (i = 1; i <= 200; i++) {
			
			multi = multi * (i * i);
		}
		
		System.out.println(multi);
	}
}
