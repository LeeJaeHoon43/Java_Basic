public class ArrTest2 {
	public static void main(String[] args) {
				
		for (int i = 1; i <= 15; i++) {
			char rn = (char)(int)((Math.random()*26) + 65);
			System.out.print(rn + " ");
			if(i % 5 == 0){
				System.out.println();
			}
		}
	}
}