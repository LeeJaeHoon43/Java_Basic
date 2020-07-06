public class ExceptionEx6{
	public static void main(String[] ar){
		System.out.println(1);
		System.out.println(2);
		try	{
			System.out.println(3);
			// ArithmeticException을 발생시킨다.
			System.out.println(0/0);
			System.out.println(4); // 실행되지 않는다.
		}catch (ArithmeticException ae){
			if(ae instanceof ArithmeticException){
				System.out.println("true");
			}
			System.out.println("ArithmeticException");
		}catch(Exception e){
			System.out.println("Exception");
		}
		System.out.println(6);
	} 
}