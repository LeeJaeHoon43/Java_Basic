public class Book{ // 북 클래스.

	// 멤버 필드
	String name;
	String writer;
	int price;
	int nowPage;
	String isbn;
	
	// 생성자 : 기본 생성자, 생략해도 JVM이 자동으로 만들어준다.
	public Book(){} 

	// 메서드
	public void nextPage(){
		nowPage++;
	}

	public void previousPage(){
		nowPage--;
	}

	// 메인 메서드 : main 메서드의 역할은 프로그램의 시작점을 알려준다.
	public static void main(String[] ar){	
		// 객체의 선언.
		Book myBook;

		// 객체 생성.
		myBook = new Book();
	}
}