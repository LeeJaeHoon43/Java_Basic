public class ExceptionEx2{
	public static void main(String[] ar){
		int number = 50;
		int result  = 0;
		for(int i = 0; i < 10 ; i++){
			try{
				result = number / (int)(Math.random() * 5);
				System.out.println(result);
			}catch(ArithmeticException e){
				// ArithmeticException�� �߻��ϸ� ����ȴ�.
				System.out.println("Exception �߻�!");
			} // try-catch�� ������
		} // for�� ������.
	}
}