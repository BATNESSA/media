package media;

import java.lang.reflect.Array;
import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] intArray = new int[]{1,2,3,4,5,6,7,8,9,10}; 
		int[] arrayInte = {5,5,5,5,5};
		
		System.out.println("MEDIA POR TECLADO: " + mediaTeclado());
		System.out.println("MEDIA CON ARRAY: " + mediaArray ());
		System.out.println("MEDIA CON ARRAY: " + mediaArray (arrayInte));
		
	}
	
	static double mediaTeclado () {
		Scanner sc = new Scanner(System.in);
		int sumatorio = 0;
		
		for (int i=0; i<5; i++) {
			System.out.println("Introduce un número: ");
			sumatorio += sc.nextInt();
		}
				
		return ((double)(sumatorio/5));
	}
	
	static double mediaArray () {
		int media = 0;
		//
		//int[] arrayInt2 = new int[5];
		int[] arrayInt = {1,2,3,4,5};
		
		for (int i=0; i<5; i++) {
			media += arrayInt[i];
		}
		return ((double)media/arrayInt.length);
	}
	
	static double mediaArray (int[] arrayInt) {
		int media = 0;
		//
		//int[] arrayInt2 = new int[5];
		//int[] arrayInt = {1,2,3,4,5};
		
		for (int i=0; i<arrayInt.length; i++) {
			media += arrayInt[i];
		}
		return ((double)media/arrayInt.length);
	}

}
