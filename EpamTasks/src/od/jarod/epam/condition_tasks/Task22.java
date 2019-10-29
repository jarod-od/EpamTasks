package od.jarod.epam.condition_tasks;

/*Перераспределить значения переменных x и y так, 
что бы в x оказалось большее из этих значений, а в y - меньшее*/

public class Task22 {

	public static void main(String[] args) {

		int x = 100;
		int y = 200;

		if (y > x) {
			
			int temp = x;
			x = y;
			y = temp;
		}

		System.out.println(x);
		System.out.println(y);
	}
}
