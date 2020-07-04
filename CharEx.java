public class CharEx{
	public static void main(String[] ar){
		char ch1 = 'A';
		char ch2 = '\u0041'; 
		/*
		- 프로그램은 왼쪽에서 오른쪽으로, 위에서 아래로 진행한다.
		- 문자(char)를 사용할 경우 계산이 가능한 경우는 진짜 계산을 수행한다.
		- 도스창은 기본적으로 아스키코드를 사용하므로 127이 넘어가면 ?가 나온다.
		*/
		System.out.println("ch1 + ch2 = " + ch1 + ch2);
		System.out.println("ch1 + ch2 = " + (ch1 + ch2)); 
		System.out.println("ch1 + ch2 = " + (char)(ch1 + ch2));
	}	
}