import java.util.StringTokenizer;
public class StringTokenEx1{
	
	// 멤버
	StringTokenizer st;
	
	// 생성자
	public StringTokenEx1(String str){
		System.out.println("str : " + str);
		st = new StringTokenizer(str);
	}
	public StringTokenEx1(String str, String delim){
		System.out.println("str : " + str);
		st = new StringTokenizer(str, delim);
	}
	
	// 메서드.
	public void print(){
		System.out.println("Token count : " + st.countTokens());
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println("-----------------------------------------------");
	}
	public static void main(String[] args) {
		/*
		* StringTokenizer 클래스.
	 	- java.util패키지
	 	- 문자열을 각각의 문자열로 분리할 때 사용.
	 	- 각각의 문자열을 토큰이라고 한다.
	 	
	 	* 메서드
	 	- countTokens() : 토큰이 된 자원의 수를 반환한다.
	 	- hasMoreTokens() : token할 수 있는 자원이 있을 경우 true, 없으면 false를 반환한다.
	 	- nextToken() : token된 자원을 반환한다.
		*/	
		StringTokenEx1 st1 = new StringTokenEx1("Happy day");
		st1.print();
		StringTokenEx1 st2 = new StringTokenEx1("2020/04/10","/");
		st2.print();
	}
}