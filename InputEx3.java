import java.io.*;
public class InputEx3{
	public static void main(String[] ar)throws IOException{
		String name;
		String age;
		String addr;
		String tel;
		// 문자열 입력받기
		// InputStreamReader is = new InputStreamReader(System.in);
		// BufferedReader br = new BufferedReader(is);
		// String name = br.readLine();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름 : ");
		name = br.readLine();
		System.out.print("나이 : ");
		age = br.readLine();
		System.out.print("주소 : ");
		addr = br.readLine();
		System.out.print("전화번호 : ");
		tel = br.readLine();
		System.out.println(); // 결과 출력.
		System.out.println(name + "씨");
		System.out.println(age + "세 이군요.");
		System.out.println(addr + "에 사시는 군요.");
		System.out.println(tel + "로 전화드리겠습니다.");

	}
}
