
public class AnimalTest {
	public static void main(String[] args) {
		Animal1 animal = new Animal1("ū�Լ�", 3, true);
		System.out.println("�̸� : " + animal.getName());
		System.out.println("���� : " + animal.getAge());
		System.out.println("�������� : " + animal.isLive());
		
		animal.setName("���");
		
		System.out.println("�̸� : " + animal.getName());
		System.out.println("���� : " + animal.getAge());
		System.out.println("�������� : " + animal.isLive());
	}
}
