package 자바;

public class JF6 {

	public static void main(String[] args) {
		

		int sum = 0;
		int num = 77;
		
		for(int i = 1; i<78; i++) {
			
			sum += i * num;
			
			num--;
			
		}
		System.out.println(sum);
	}

}
