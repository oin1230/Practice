package 자바;

import java.util.Scanner;

public class JF2 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		int reward = 5000;
		int sum = 0;
		System.out.print("일한시간을 입력하세요 : ");
		int wt = sc.nextInt();
		
		if(wt > 8) {
			sum = (8 * reward) + (int)(reward*1.5) * (wt-8);
		}else {
				sum = wt * 5000;
			}
		System.out.println("총 임금은 "+sum+"원 입니다.");
		
	}
		

}


