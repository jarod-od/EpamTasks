package od.jarod.epam.lecture_code;

public class DecompositionReturn {
	public static void main(String[] args) {
		int a;
		int b;
		int z;
		
		a = 5;
		b = 3;
		
		z = multiplicate(a, b);
		System.out.println(a + " * " + b + " = " + z); 

		z = multiplicate(b - 1, 33);
		System.out.println(a + " * " + b + " = " + z); 
		
	}
	public static int multiplicate(int x, int y) {
		int multi;
		multi = x * y;
		return multi;
	}	
}
