public class Book{ // �� Ŭ����.

	// ��� �ʵ�
	String name;
	String writer;
	int price;
	int nowPage;
	String isbn;
	
	// ������ : �⺻ ������, �����ص� JVM�� �ڵ����� ������ش�.
	public Book(){} 

	// �޼���
	public void nextPage(){
		nowPage++;
	}

	public void previousPage(){
		nowPage--;
	}

	// ���� �޼��� : main �޼����� ������ ���α׷��� �������� �˷��ش�.
	public static void main(String[] ar){	
		// ��ü�� ����.
		Book myBook;

		// ��ü ����.
		myBook = new Book();
	}
}