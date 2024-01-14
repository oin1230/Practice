package 자바;

import java.util.Arrays;
import java.util.Random;

public class JF10 {

	public static void main(String[] args) {

		int[] array = new int[8];
		Random rd = new Random();
	
		
		for(int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(50)+1;
			
			for(int j = 0; j < i; j++) {
				if(array[j] == array[i]) {
					i--;
					break;
				}
				
			}
			
		}
		System.out.print("배열에 있는 모든값 : " + Arrays.toString(array));
		
		int max = 0;
		int min = array[0];
		
		for(int i = 0; i<array.length; i++) {
			
			if(array[i]>max) {
				max = array[i];
			}
			
			if(array[i] < min) {
				min = array[i];
			}
			
		}
		System.out.println();
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min );
		
		
	}

}
