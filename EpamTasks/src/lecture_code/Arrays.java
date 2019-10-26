package lecture_code;

import java.util.Random;

public class Arrays {

		public static void main(String[] args) {
// test
			int[] arr = new int[4];
			//arr[0] = 2;
			//arr[2] = 99;
			
//  		 Блок кода инициализации массива .. Логика обработки данных
			
			Random rand = new Random();
			
			for(int i = 0; i < arr.length; i++) {
				
				arr[i] = rand.nextInt(100);
				
			}
			
//			Блок кода работы с массивом .. Логика представления данных
			
			for (int i = 0; i < arr.length; i++) {
				
				System.out.print(arr[i] + " ");
			}
			
			//System.out.println(arr[2]);
			//System.out.println(arr[0]);
			
			//boolean[] bool = new boolean[2];
			//System.out.println(bool[1]);

			int[] arr2 = {1, 4, -3, 0};
		}
	}


