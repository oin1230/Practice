package 자바;

public class JF23 {

	public static void main(String[] args) {
		
		System.out.println("원본");
		
		int num = 1;
		int[][] arr = new int[5][5];
		
		
		for(int i = 0; i < arr.length; i++) {
			
			for(int j =0; j < arr.length; j++) {
				arr[i][j] = num;
				num++;
				System.out.printf("%4d",arr[i][j]);
			}
			System.out.println();
			
		}
		System.out.println();
		System.out.println("90도 회전");
		for(int i = arr.length-1; i>=0; i--) {
			
			for(int j = 0; j<arr.length; j++) {
				
				System.out.printf("%4d",arr[j][i]);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		

	}

}
