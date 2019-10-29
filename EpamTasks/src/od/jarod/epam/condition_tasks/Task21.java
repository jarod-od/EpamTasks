package od.jarod.epam.condition_tasks;

/*
*  21.Программа - льстец. На экране высвечивается вопрос "Кто ты: мальчик или девочка? 
*  Введи Д или М".В зависимости от ответа на экране должен появиться текст -
* "Мне нравятся девочки!" или "Мне нравятся мальчики!"
*/

import java.util.Scanner;

public class Task21 {

	public static void main(String[] args) {
		
		System.out.println("Кто ты: мальчик или девочка?");

		char s;
		
		while (true) {
			
			try {
				System.out.println(" Input 'М' or 'Д'");
				System.out.print("> ");

				Scanner sc = new Scanner(System.in);
				s = sc.next().charAt(0);
				
				break;
				
			} catch (Exception e) {
				System.out.println("Invalid input");
			}
		}
		
		if (s == 'М' ) {
			System.out.println("Мне нравятся мальчики!");
			
		} else if (s == 'Д') {
			System.out.println("Мне нравятся девочки!");
			
		} else {
			System.out.println("Try again!");
		}
		
	}
}
