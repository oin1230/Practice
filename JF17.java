package 자바;

import java.util.Scanner;

public class JF17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print((i+1) + "번 째 정수 입력 >>" );
			arr[i] = sc.nextInt();
			
		}
		
		System.out.print("3의 배수 : ");
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i]%3 == 0) {
				System.out.print(arr[i]+" ");
			}
			
		}
	}

}
