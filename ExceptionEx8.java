public class ExceptionEx8{
	private static void test() throws Exception{
		System.out.println(6/0); // 에러 발생. 에러 전가.
	}
	public static void main(String[] ar){
		try{
			test(); // try catch문으로 예외 처리 해줘야 함.
		}catch (Exception e){
			System.out.println("예외 발생");
		}
	}
} 