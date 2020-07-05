public class ForEx3{
	public static void main(String[] ar){
		String[] arr = {"AA", "BB", "CC", "DD", "EE"};

		// 향상된 for문.
		for (String s : arr){
			System.out.println("arr 배열의 값 : " + s);
		}

		// 일반적인 for문.
		for (int i = 0; i < arr.length ; i++){
			System.out.println("arr 배열의 값 : " + arr[i]);
		}
	}
}	