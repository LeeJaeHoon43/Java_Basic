public class TestFor2 {
	public static void main(String[] args) {
		
		// ���� ���ﰢ��.
		int a = 11;
		for(int i=1;i<=a;i++){
			for(int j=1;j<=i;j++){
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();

		// ������ ���ﰢ��.
		for(int i=1;i<=a;i++){
			for(int j=a-1;j>=i;j--){
				System.out.print(' ');         
			}
			for(int j=1;j<=i;j++){
				System.out.print('*');
			}
			System.out.println();
		}
		System.out.println();

		// ���� ���ﰢ�� + ���� + ������ ���ﰢ��
		for(int i=1;i<=a;i++){
			for(int j=1;j<=i;j++){
				System.out.print('*');
			}
			for(int j=a-1;j>=i;j--){
				System.out.print(' ');         
			}
			for(int j=a-1;j>=i;j--){
				System.out.print(' ');         
			}
			for(int j=1;j<=i;j++){
				System.out.print('*');
			}
			System.out.println();   
		}
		
		System.out.println();
		
		for(int i = 11; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i <= 11;i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 11-i; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();

		// �Ƕ�̵�
		for(int i=1;i<=a*2;i+=2){
			for(int j=a-1;j>i/2;j--){
				System.out.print(' ');   
			}
			for(int j=1;j<=i;j++){
				System.out.print('*');
			}
			System.out.println();
		}
		
		System.out.println();
		
		// �� �Ƕ�̵�.
		int num = 11;
		for(int i = num; i > 0; i--) {
			for(int j = num - i; j > 0 ; j--){
				System.out.print(" ");
			}
			for(int k = i * 2 - 1; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// ���̾Ƹ��.
		for(int i=1;i<=a*2;i+=2){
			if(i<=a){
				for(int j=(int)(a/2)-1;j>=i/2;j--){
					System.out.print(' ');
				}
				for(int j=1;j<=i;j++){
					System.out.print('*');
				}
				System.out.println();
			}else{
				for(int j=a;j<i;j+=2){
					System.out.print(' ');   
				}
				for(int j=a*2-1;j>=i;j--){
					System.out.print('*');
				}
				System.out.println();
			}
		}
		System.out.println();

		// H ���.
		for (int line = 1;line <11 ;line++) {
			if (line<6) {
				for (int value = 1;line+1 > value ;value++ ) {
					System.out.print("*");
				}
				for (int value = 5;value > line ; value--) {
					System.out.print(" ");
				}
				for (int value = 5;value > line ; value--) {
					System.out.print(" ");
				}
				for (int value = 1;line+1 > value ;value++ ) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for (int value = 10;value+1 > line ;value-- ) {
					System.out.print("*");
				}
				for (int value = 6; line > value;value++ ) {
					System.out.print(" ");
				}
				for (int value = 6; line > value;value++ ) {
					System.out.print(" ");
				}
				for (int value = 10;value+1 > line ;value-- ) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
}