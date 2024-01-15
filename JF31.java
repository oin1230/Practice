package 자바;

import java.util.Scanner;

public class JF31 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int in = sc.nextInt();
		
		int fac = 0;
		int n = 1;
		for(int i = 1; i <= in; i++) {
			
			
			n *= i;
			
			fac = n;
			
			
			
		}
		
		System.out.println("출력 : " + fac);

	}

}
