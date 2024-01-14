package 자바;

public class JFB2 {

	public static void main(String[] args) {

		System.out.println(getMiddle("test"));
		System.out.println(getMiddle("power"));
		
		
	}

	public static String getMiddle(String str) {
		if(str.length()%2==0) {
			return str.substring(str.length()/2-1, str.length()/2 + 1);
		}else {
			return str.substring(str.length()/2, str.length()/2 + 1);
		}
		
		

	}
}
