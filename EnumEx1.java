public class EnumEx1{ // EnumEx1.class
	// ���
	
	/*
	 * ������
	 - ����� �ϳ��� ��ü�� �ν��ϰ� ���� ���� ��� ��ü���� �� ���� ��Ƶ� �ϳ��� ����(��ü)�̶� �� �� �ִ�.
	 * ����
	 [���� ����] enum [������_��]{
	 	���1, ���2, ..., ��� n
	 }
	 - �������� �׳� �Ϲ����� ������ ���丸���� ����Ǵ� ���� �ƴϴ�.
	 - java.lang�̶�� ��Ű���� Enum�̶�� �߻�Ŭ������ ��ӹ޴� �̳� Ŭ������ ���ǵǴ� ���̴�.
	*/
	public	enum Lesson{ // EnumEx1$Lesson.class
		JAVA, XML, EJB
	}
	// ������

	// �޼���
	public static void main(String[] args){
		Lesson le = Lesson.JAVA;
		System.out.println("Lesson : " + le); // le.toString() ����.
		System.out.println("Lesson : " + le.ordinal()); // ��ü�� ������ �ִ� ���� ���ڸ� �˷��ش�.
		System.out.println("XML : " + Lesson.XML);
		System.out.println("EJB : " + Lesson.EJB);
		
	}
}