import java.io.*;
public class MemberManager {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		MyMember member = new MyMember();

		boolean On = true;

		while(On) {
			System.out.println("1. 회원가입");
			System.out.println("2. 회원검색");
			System.out.println("3. 정보수정");
			System.out.println("4. 회원탈퇴");
			System.out.println("5. 전체목록");
			System.out.println("0. 프로그램 종료");
			System.out.print("메뉴 선택 : ");
			int menu = Integer.parseInt(br.readLine());

			switch(menu) {
			case 0:
				System.out.print("정말로 종료하시겠습니까? (y/n) : ");
				String answer = br.readLine();
				if(answer.equals("y") || answer.equals("Y")) {
					System.out.println("프로그램을 종료합니다.");
					On = false;
				}else if(answer.equals("n") || answer.equals("N")){
					continue;
				}else {
					System.out.println("잘못 입력하셨습니다.");
					System.out.println();
				}
				break;
			case 1:
				member.Join();
				break;
			case 2:
				if (member.JoinOk()) {
					member.Search();
				}else {
					System.out.println("회원가입한 회원이 없습니다.");
					System.out.println();
					continue;
				}
				break;
			case 3:
				if (member.JoinOk()) {
					if(member.search == true) {
						member.Update();	
					}else {
						System.out.println("검색을 먼저 수행하셔야 합니다.");
						System.out.println();
						break;
					}
				}else {
					System.out.println("회원가입한 회원이 없습니다.");
					System.out.println();
					continue;
				}
				break;
			case 4:
				if (member.JoinOk()) {
					if (member.search == true){
						member.Delete();
					}else {
						System.out.println("검색을 먼저 수행하셔야 합니다.");
						System.out.println();
						break;
					}
				}else {
					System.out.println("회원가입한 회원이 없습니다.");
					System.out.println();
					continue;
				}
				break;
			case 5:
				if (member.JoinOk()) {
					member.MemberList();
				}else {
					System.out.println("회원가입한 회원이 없습니다.");
					System.out.println();
					continue;
				}
				break;
			default:
				System.out.println("메뉴 선택 번호를 잘못 입력하셨습니다.");
				System.out.println();
				break;
			}
		}
	}
}