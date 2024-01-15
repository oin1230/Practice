package 자바;

import java.util.Random;
import java.util.Scanner;

public class JF29 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Random rd = new Random();
		int count = 0;

		while (true) {

			
			int num1 = rd.nextInt(10);
			int num2 = rd.nextInt(10);

			System.out.print(num1 + "+" + num2 + "=");
			int num3 = sc.nextInt();

			if (num1 + num2 == num3) {
				System.out.println("SUCCESS!");
			} else {
				System.out.println("Fail...");
				count++;
			}

			if (count == 5) {
				System.out.println("GAME OVER!");
				break;
			}

		}

	}

}
