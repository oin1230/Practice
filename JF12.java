package 자바;

import java.util.Scanner;

public class JF12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		int num = 1;
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j=0; j < arr.length; j++) {
				arr[i][j] = num;
				num += n;
				System.out.print(arr[i][j] + " ");
			}
			num = num-(n*n)+1;
			System.out.println();
		}
		
		
		
	}

}
