public class ArrayEx7{
	public static void main(String[] ar){
		/*
		# �迭 ����
		1. �迭�� �� �� ������ �� �迭�� ũ�⸦ ������ �� ����.
		2. ũ�⸦ �� �ø��� ���� ��� ���� �ڷ����� �迭�� ���ϴ� ũ��� �غ��ϰ� ������ �迭�� �����ϸ� �۾��� �Ϸ��� �� ����.
		* System.arratcopy()�޼��带 �̿�.
		(Object src, int srcPos, Object dest, int destPos, int length)
		src = �ҽ� �迭.
		srcPos = �ҽ� �迭�� ���� ���� ��ġ.
		dest = ���簡 �� �迭
		destPos = ���� ���� ��ġ.
		length = ����Ǵ� �迭 ����� ��.
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