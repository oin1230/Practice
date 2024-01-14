package 자바;

import java.util.Scanner;

public class JFB4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "번째 별의 수 : ");
			arr[i] = sc.nextInt();
		}
		
		for(int i =0; i < arr.length; i++) {
			
			System.out.print(arr[i]+ ":");
			for(int j = 0; j<arr[i]; j++) {
				
				System.out.print("*");
		
			}
			System.out.println();
		}
	}

}
