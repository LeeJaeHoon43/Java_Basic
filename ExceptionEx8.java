public class ExceptionEx8{
	private static void test() throws Exception{
		System.out.println(6/0); // ���� �߻�. ���� ����.
	}
	public static void main(String[] ar){
		try{
			test(); // try catch������ ���� ó�� ����� ��.
		}catch (Exception e){
			System.out.println("���� �߻�");
		}
	}
} 