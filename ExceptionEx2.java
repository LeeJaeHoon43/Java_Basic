public class ExceptionEx2{
	public static void main(String[] ar){
		int number = 50;
		int result  = 0;
		for(int i = 0; i < 10 ; i++){
			try{
				result = number / (int)(Math.random() * 5);
				System.out.println(result);
			}catch(ArithmeticException e){
				// ArithmeticException이 발생하면 수행된다.
				System.out.println("Exception 발생!");
			} // try-catch의 마지막
		} // for의 마지막.
	}
}