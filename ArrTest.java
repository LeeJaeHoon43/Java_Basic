public class ArrTest {
	public static void main(String[] args) {
		int[][] arr = new int[4][4];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i == j){
					arr[i][j] = 1;
				}else {
					arr[i][j] = 0;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
				if (j == 3) {
					System.out.println();
				}
			}
		}
	}
}
