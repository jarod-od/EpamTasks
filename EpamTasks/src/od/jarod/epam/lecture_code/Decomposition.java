package od.jarod.epam.lecture_code;

public class Decomposition {
	public static void main(String[] args) {
		int a;
		int b;
		
		a = 4;
		b = 99;
//	Изменение формальных параметров, не ведет к изменению соответствующих им фактических
//	при передаче параметров по значению
		
		sum(a, b); // фактические параметры   // явные параметы
	// 	аргументы метода, это то что используется при вызове метода
	//	фактические значения передаваемые в точке вызова
		
		sum(33, a - 2);
	}
	public static void sum(int x, int y) { // формальные параметры //  неявные параметры
	//  параметры метода, это то что передается при объявлении метода
	//  Экземпляр из которого вызывается метод
	//	Заполнители в сигнатурах методов
	//	Декларация в заголовке метода
		
		int sum;
		sum = x + y;
		
		System.out.println(x + " + " + y + " = " + sum); // фактические параметры
	}
}