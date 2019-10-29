package od.jarod.epam.loop_tasks;

// Даны действительные (а) и натуральное (n), вычислить a(a+1)...(a+n-1)



public class Task17 {

	public static void main(String[] args) {
		
		int a = 10;
		double b = 5;
		
		double multi = 1;
		
		for (int i = 1; i < b; i++) {
			
			multi = multi * (a + i);
			
			System.out.println(multi);
		}
		
		System.out.println(multi);
	}
}
