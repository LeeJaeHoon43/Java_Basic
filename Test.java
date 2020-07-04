import java.io.*;
public class Test{
	public static void main(String[] args)throws IOException{
		/*
		int i=1; // i = 1
		int j=i++; // i = 2, j = 1
		if((i>++j)&(i++==j)) { // i = 2, j = 2, i = 3,
			i+=j;
		}
		System.out.println("i=" + i + ", j=" + j); // i = 3, j = 2

		int i=1; 
		int j=i++; // i = 2, j = 1
		if((i>++j)&&(i++==j)) { // i = 3, j = 2
			i+=j;
		}
		System.out.println("i=" + i + ", j=" + j); // i = 3, j = 2

		int i = 1; 
		int j=i++;
		if((i>j++)|(i++==j)){
			i+=j; 
		}
		System.out.println("i=" + i + ", j=" + j);

		int i=1; 
		int j=i++; // I = 2, j = 1
		if((i>j++)||(i++==j)){ // I = 2, j = 2, 
			i+=j; // I = 4, j = 2
		}
		System.out.println("i=" + i + ", j=" + j);

		int i=0, j=5;
		tp:for(;;i++) { // i : 1 2 3 
			for(;;--j) { // j : 4 3 2
				if(i>j) break tp;
			}
		}
		System.out.println("i = "+i+"j = "+j); 
		// i = 3, j = 2

		int i = 0; int j = 5;
		tp : for( ; ; ){
			i++; // 1 2 3
			for( ; ; ){
				if(i>--j) // 4 3 2 
					break tp;
			}
		}
		System.out.println("i :" + i + "j :" + j);
		
		int i = 1; int j = 0;
		switch(i){
			case 2 : j+=6;
			case 4 : j+=1;
			default : j+=2;
			case 0 : j+=4;
		}
		System.out.println("i :" + i + "j :" + j );
	
		int i = 1; int j = 10;
		do{
			if( i>j )
				break;
			j--; // 9 8 7 6 
		}while( ++i < 5 ); // 2 3 4 5 
		System.out.println("i = " + i + ", j = " + j + ", i&j = " + (i&j)); // i = 5, j = 6, i & j = 4
		*/

		System.out.print("숫자 1 : ");
		int num1 = System.in.read() - 48;
		System.in.read();System.in.read();
		System.out.print("연산자 : ");
		char cal = (char)System.in.read();
		System.in.read();System.in.read();
		System.out.print("숫자 2 : ");
		int num2 = System.in.read() - 48;
		System.in.read();System.in.read();

		switch(cal){
			case '+':
				System.out.println("연산 결과 : " + (num1 + num2));
				break;
			case '-':
				System.out.println("연산 결과 : " + (num1 - num2));
				break;
			case '*':
				System.out.println("연산 결과 : " + (num1 * num2));
				break;
			case '/':
				System.out.println("연산 결과 : " + (num1 / num2));
				break;
			case '%':
				System.out.println("연산 결과 : " + (num1 % num2));
				break;
			default:
				System.out.println("사칙 연산 부호를 입력하세요.");
				System.exit(0);
		}
	}
}
