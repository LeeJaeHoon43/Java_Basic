public class StringExTwo {
	public static void main(String[] args) {
		String str = new String();
		str += "Hello";
		str += " Java";
		System.out.println("str의 값은 : " + str);
		System.gc(); // 가비지 컬렉션을 수행한다. 메모리 정리.
		/*
		* String 객체의 불변성
		- String 객체는 편집되지 않는다.
		- 기존의 String 객체에 새로운 String값을 더하면 기존의 객체가 수정되는 것은 아니고, 새로운 객체를 참조하게 된다.
		- 위 코드에서 String 객체 str은 하나의 객체로 보이지만, 실제로는 5개의 String 객체가 생성된 것이다.
		
		* String 관련 메서드.
		- String str = "java";
		- char ch = str.charAt(int); // int가 2라면, ch = 'v';라는 의미.
		- int I = str.length(); // i = 4
		- String so = str.toLowerCase(); // 소문자 변환.
		- String SO = str.toUpperCase(); // 대문자 변환.
		- String imsi = String.valueOf(수치); // 숫자를 문자열로 변환.
		- String imsi = str.trim(); // 공백이나 화이트 코드를 제거. 단 문자열 사이에 있는 공백은 제거 불가.
		- String imsi = str.substring(1, 3); // 문자열에서 1부터 3전까지 해당되는 문자열 제거.
		- indexOf(), lastIndexOf()...등등.
		
		*/
	}
}
