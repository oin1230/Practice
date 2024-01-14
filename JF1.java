package 자바;

import java.util.Scanner;

public class JF1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게 : ");
		int now = sc.nextInt();
		System.out.print("목표 몸무게 : ");
		int goal = sc.nextInt();
		
		for(int i = 0; now > goal; i++) {
			
			System.out.print((i+1)+"주차 감량 몸무게 : ");
			int mi = sc.nextInt();
			
			now -= mi;
			
		}
		System.out.println(now+"kg 달성!! 축하합니다!");
	}

}
