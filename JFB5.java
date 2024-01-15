package 자바;

import java.util.Scanner;
import java.util.Arrays;

public class JFB5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print((i+1) + "번째 수 입력 : ");
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		System.out.println("정렬 후");
		for(int i = 0; i<arr.length; i++) {

			for(int j = 0; j<arr.length-1; j++) {

				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
		

	}

}
