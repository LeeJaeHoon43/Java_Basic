import java.io.*;
public class MabangjinEx{
	public static void main(String[] ar)throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("### 마방진 ###");
		System.out.print("숫자 = ");
		int num = Integer.parseInt(br.readLine());
		if(num % 2 == 0 || num == 1 || num == 0){
			System.out.println("3 이상의 홀수만 입력하세요.");
			System.exit(0);
		}else{
			int arr[][] = new int[num][num];
			int i=0;  // 배열의 행 위치를 지정하는 변수.
			int j = num/2; // 첫 번째 줄 가운데 열에서 시작. 배열의 열 위치를 지정하는 변수.
			int count = 1; // 숫자는 1부터 시작한다.
			while(count <= (num*num)) {
				arr[i][j] = count;
				int oldI = i; // 행의 현재 위치를 기억하기 위해 값을 복사해둔다.
				int oldJ = j; // 열의 현재 위치를 기억하기 위해 값을 복사해둔다.
				i--; 
				j++; // 오른쪽 대각선 위로 이동.
				if(i<0)
					i = num-1; // 행이 음수가 되면 그 열의 끝 행으로 이동.
				if(j>num-1)
					j=0; // 열이 배열의 값을 벗어나면 0열로 이동한다.
				if(arr[i][j] != 0) { // 이동할 곳에 데이터가 존재하면 
					i = oldI;  // 행도 원래 위치로 이동하고,
					j = oldJ;  // 열도 원래 위치로 이동하고,
					i++;	   // 행울 하나 증가시킨다.
				}
				count++; // 숫자 1 증가.
			}
			for (i = 0; i < num; i++) {
				for (j = 0; j < num; j++) {
					System.out.print(arr[i][j] + "\t");	
				}
				System.out.println();
			}
		}
	}
}