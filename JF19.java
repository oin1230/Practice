package 자바;

import java.util.Scanner;

public class JF19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("단수입력 : ");
		int in = sc.nextInt();
		System.out.println("어느 수까지 출력 : ");
		int out = sc.nextInt();
		
		System.out.println(in+"단");
		for(int i = 1; i<= out; i++) {
			System.out.println(in+"*"+i+"="+ (in*i));
		}
		
		
	}

}
