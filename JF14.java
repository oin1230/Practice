package 자바;

import java.util.Scanner;

public class JF14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");
		int input = sc.nextInt();

		int[][] arr = new int[input][input];
		int num = 1;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				arr[i][j] = num;
				num++;
			}

		}

		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0) {
				for (int j = 0; j < arr.length; j++) {

					System.out.print(arr[i][j] + " ");

				}
			} else {
				for (int j = arr.length-1; j >=0; j--) {
					System.out.print(arr[i][j] + " ");
				}
			}
			System.out.println();
		}

	}

}
