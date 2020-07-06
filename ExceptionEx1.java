public class ExceptionEx1{
	public static void main(String[] ar){
		int number = 50;
		int result = 0;
		for(int i = 0; i < 10; i++ ){
			result = number / (int)(Math.random() * 5);
			System.out.println(result);
		}
	}
}