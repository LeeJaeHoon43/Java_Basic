public class ArrayEx1{
	public static void main(String[] ar){
		char[] ch; // �迭 ����.
		ch = new char[4]; // �迭�� �ʱ�ȭ.
		// �迭 ���� �Ҵ�.
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		// �迭 ���� ���. �⺻ for��.
		for(int i = 0; i < ch.length; i++){
			System.out.println("ch["+i+"] : "+ ch[i]);
		}

		// �׻�� for��.
		int index = 0;
		for(char temp : ch){
			System.out.println("temp["+ index + "] : " + temp);
			index++;
		}
	}
}