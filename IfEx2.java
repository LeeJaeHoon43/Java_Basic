import java.io.*;
public class IfEx2{
	public static void main(String[] ar)throws IOException{
		char a = 0;
		char b = 0;
		char c = 0;
		int d = 0;
		System.out.print("암호문 : ");
		a = (char)System.in.read();
		b = (char)System.in.read();
		c = (char)System.in.read();
		System.in.read();System.in.read(); // Enter값 처리.
		System.out.print("키워드(1~3) : ");
		d = System.in.read() - '0'; // 숫자(정수) 입력.
		System.in.read();System.in.read();

		if(d == 1){
			a += 1;
			b += 1;
			c += 1;
		} else if(d == 2){
			a += 2;
			b += 2;
			c += 2;
		} else if(d == 3){
			a += 3;
			b += 3;
			c += 3;
		} else{
			System.out.println("키워드 오류");
			System.exit(0); // 시스템 종료.
		}

		System.out.println("변경된 암호문은 "+a+b+c+"입니다.");
		System.out.println(); // 송신자.
		System.out.print("복호화 키워드 = "); // 수신자.
		d = System.in.read() - 48;
		if(d != 1 && d != 2 && d != 3){
			System.out.println("복호화 범위 추가");
			System.exit(0);
		}
		a -= d;
		b -= d;
		c -= d;
		System.out.println("전송된 암호문은 " +a+b+c+"입니다.");
	}
}
