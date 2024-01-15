package 자바;

import java.util.Scanner;

public class JF26 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 입력 >>> ");
		int in1 = sc.nextInt();
		
		System.out.print("두 번째 숫자 입력 >>> ");
		int in2 = sc.nextInt();
		
		System.out.println(in1 * (in2%10));
		System.out.println(in1 * (in2%100/10));
		System.out.println(in1 * (in2/100));
		System.out.println(in1*in2);

	}

}
