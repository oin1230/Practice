package 자바;

import java.util.Scanner;

public class JF16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		
		int n = sc.nextInt();
		
		int sum = 0;
		int a = 10;
		int b = 1;
		for(int i = 0; i <= 8; i++) {
			
		
			int num = n%a/b;
			sum += num;
			a*=10;
			b*=10;
			
			
		}
		System.out.println("합은" + sum + "입니다.");
	}

	
}
