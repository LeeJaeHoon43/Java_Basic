public class ForEx3{
	public static void main(String[] ar){
		String[] arr = {"AA", "BB", "CC", "DD", "EE"};

		// ���� for��.
		for (String s : arr){
			System.out.println("arr �迭�� �� : " + s);
		}

		// �Ϲ����� for��.
		for (int i = 0; i < arr.length ; i++){
			System.out.println("arr �迭�� �� : " + arr[i]);
		}
	}
}	