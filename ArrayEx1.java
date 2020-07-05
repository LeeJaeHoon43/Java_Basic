public class ArrayEx1{
	public static void main(String[] ar){
		char[] ch; // 배열 선언.
		ch = new char[4]; // 배열의 초기화.
		// 배열 값의 할당.
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		// 배열 내용 출력. 기본 for문.
		for(int i = 0; i < ch.length; i++){
			System.out.println("ch["+i+"] : "+ ch[i]);
		}

		// 항상된 for문.
		int index = 0;
		for(char temp : ch){
			System.out.println("temp["+ index + "] : " + temp);
			index++;
		}
	}
}