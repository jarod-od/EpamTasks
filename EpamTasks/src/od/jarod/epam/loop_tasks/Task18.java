package od.jarod.epam.loop_tasks;

/*
 *  Даны числовой ряд и некоторое число е. 
	Найти сумму трех членов ряда, модуль которых больше или равен заданному е.
	Общий член ряда имеет вид: a(n) = (-1^n-1 ) / n.
*/
public class Task18 {

	public static void main(String[] args) {
		
		double e = 0;
		
		double aNumber = 1;
		double sum = 0;
		long nPow = 1;
		
		while (aNumber >= e) {
			
			sum = sum + aNumber;
			
			nPow++;
			
			aNumber = (1 * Math.pow(nPow, nPow -1) / nPow);
			
			System.out.println(sum);

		}			
			System.out.println(sum);
		}
}
