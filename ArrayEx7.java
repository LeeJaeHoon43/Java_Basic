public class ArrayEx7{
	public static void main(String[] ar){
		/*
		# 배열 복사
		1. 배열은 한 번 생성된 후 배열의 크기를 변경할 수 없음.
		2. 크기를 더 늘리고 싶을 경우 같은 자료형의 배열을 원하는 크기로 준비하고 기존의 배열을 복사하면 작업을 완료할 수 있음.
		* System.arratcopy()메서드를 이용.
		(Object src, int srcPos, Object dest, int destPos, int length)
		src = 소스 배열.
		srcPos = 소스 배열의 복사 시작 위치.
		dest = 복사가 될 배열
		destPos = 복사 시작 위치.
		length = 복사되는 배열 요소의 수.
		*/

		String[] src = {"JAVA", "Database","JSP","XML"};
		String[] des = new String[6];
		des[0] = "OS";
		des[1] = "Network";
		System.arraycopy(src, 0, des, 2, 4);
		for(String s : des)
			System.out.println("des value : " + s);
	}
}