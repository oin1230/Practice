package 자바;

import java.util.Random;

public class JF18 {

	public static void main(String[] args) {

		Random rd = new Random();
		
		int[] arr = new int[6];
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = rd.nextInt(6)+1;
			
			for(int j = 0; j<i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				} 
			}
			
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.println("행운의숫자 : " + arr[i]);
		}
	}

}
