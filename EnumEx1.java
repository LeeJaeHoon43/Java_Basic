public class EnumEx1{ // EnumEx1.class
	// 멤버
	
	/*
	 * 열거형
	 - 상수를 하나의 객체로 인식하고 여러 개의 상수 객체들을 한 곳에 모아둔 하나의 묶음(객체)이라 할 수 있다.
	 * 형식
	 [접근 제한] enum [열거형_명]{
	 	상수1, 상수2, ..., 상수 n
	 }
	 - 열거형은 그냥 일반적인 상수라는 개념만으로 저장되는 것이 아니다.
	 - java.lang이라는 패키지에 Enum이라는 추상클래스를 상속받는 이너 클래스가 정의되는 것이다.
	*/
	public	enum Lesson{ // EnumEx1$Lesson.class
		JAVA, XML, EJB
	}
	// 생성자

	// 메서드
	public static void main(String[] args){
		Lesson le = Lesson.JAVA;
		System.out.println("Lesson : " + le); // le.toString() 생략.
		System.out.println("Lesson : " + le.ordinal()); // 객체가 가지고 있는 원래 숫자를 알려준다.
		System.out.println("XML : " + Lesson.XML);
		System.out.println("EJB : " + Lesson.EJB);
		
	}
}