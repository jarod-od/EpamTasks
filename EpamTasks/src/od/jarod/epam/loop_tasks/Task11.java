package od.jarod.epam.loop_tasks;

// Составить программу нахождения разности кубов первых двухсот чисел

public class Task11 {

	public static void main(String[] args) {

		int diffirence = 0;

		for (int i = 1; i <= 200; i++) {

			diffirence = diffirence - (i * i * i);

		}
		
		System.out.println(diffirence);
	}
}
