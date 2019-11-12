package od.jarod.epam.lecture_code.decomp.car;

public class Starter {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		myCar.carPrice = 4500;
		myCar.carTiresPrice = 1000;
		
		changeObject(myCar);
		
		System.out.println(myCar.carPrice + ", " + myCar.carTiresPrice);
	}
	
		static void changeObject (Car myCar) {
		myCar.carPrice = myCar.carPrice * 2;
		myCar.carTiresPrice = myCar.carTiresPrice * 2;
	}
}
