package 자바;

import java.util.Scanner;

public class JF22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {

			for (int j = 5; j > i; j--) {
				System.out.print(" ");
			}

			for (int k = 0; i+1 > k; k++) {
				System.out.print("*");
			}

			System.out.println();

		}
	}

}
