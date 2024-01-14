package 자바;

import java.util.Scanner;

public class JF15 {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		System.out.print("n 입력 : ");
		
		int n = sc.nextInt();
		
		int num =1;
		int sum =1;
	
		for(int i = 0; i < n; i++) {
			
			System.out.print(sum + " ");
			sum += num;
			num++;
			
			
		}
		
		
	}

}
