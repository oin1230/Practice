package 자바;

import java.util.Scanner;

public class JFB1 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		for(int i = 1; i>0; i++) {
			System.out.print("A 입력 >>");
			int A = sc.nextInt();
			System.out.print("B 입력 >>");
			int B = sc.nextInt();
			
			if(A == 0 && B == 0) {
				break;
			}
			System.out.println("결과 >>" + (A-B));
					
		}
		
	}

}
