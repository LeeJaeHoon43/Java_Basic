import java.util.StringTokenizer;
public class StringTokenEx2{
	public static void main(String[] args) {
		/*
		# String 클래스의 split()메서드와 StringTokenizer의 차이점.
		- split() 메서드의 경우 무의미한 공백(white space)도 자리를 차지함.
		- StringTokenizer의 경우 무의미한 공백을 무시하고 제거한다. 
		*/
		String str = "학교,집,,게임방";
		StringTokenizer tokens = new StringTokenizer(str,",");
		for(int x = 1; tokens.hasMoreTokens(); x++){
			System.out.print("문자" + x + " = " + tokens.nextToken() + "\t");
		}

		System.out.println("");
		System.out.println("========================================================================");
		String[] values = str.split(",");
		for(int x = 0; x < values.length; x++){
			System.out.print("문자" + (x + 1) + " = " + values[x] + "\t");
		}
		System.out.println("");
	}
}