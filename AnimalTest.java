
public class AnimalTest {
	public static void main(String[] args) {
		Animal1 animal = new Animal1("큰뿔소", 3, true);
		System.out.println("이름 : " + animal.getName());
		System.out.println("나이 : " + animal.getAge());
		System.out.println("생존여부 : " + animal.isLive());
		
		animal.setName("펭귄");
		
		System.out.println("이름 : " + animal.getName());
		System.out.println("나이 : " + animal.getAge());
		System.out.println("생존여부 : " + animal.isLive());
	}
}
