import java.io.*;
import java.util.Vector;

public class MyMember {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
	static Vector vc = new Vector();
	
	boolean joinOk = false;
	boolean On = true;
	String SearchName = "";
	boolean search = false;
	int count = 0;
	
	private String name;
	private int age;
	private String number;
	private String address;
	
	public MyMember() {}
	
	public MyMember(String name, int age, String number, String address) {
		super();
		this.name = name;
		this.age = age;
		this.number = number;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}	
	
	// 회원가입이 되어 있는지 확인하는 메서드.
	public boolean JoinOk() {
		if (vc.size() == 0) {
			joinOk = false;
		}else {
			joinOk = true;
		}
		return joinOk;
	}
	
	// 1. 회원가입을 수행하는 메서드.
	public void Join() throws IOException {
		System.out.print("이름 : ");
		String name = br.readLine();
		System.out.print("나이 : ");
		int age = Integer.parseInt(br.readLine());
		System.out.print("전화번호 : ");
		String number = br.readLine();
		System.out.print("주소 : ");
		String address = br.readLine();
		MyMember member = new MyMember(name, age, number, address);
		vc.add(member);
		System.out.println("성공적으로 가입하였습니다.");
		System.out.println();
	}
	
	// 2. 회원 검색을 하는 메서드.
	public boolean Search() throws IOException {
		System.out.print("찾으시는 회원 이름 : ");
		SearchName = br.readLine();
		for (int i=0; i<vc.size(); i++){
			MyMember me = (MyMember)vc.elementAt(i);
			if(me.name.equals(SearchName)){
				search = true;
			} else {
				count++;
			}
		}
		if (search == true){
			System.out.println("검색에 성공하였습니다.");
			System.out.println();
		} else if(count == vc.size()) {
			System.out.println("검색에 실패하였습니다.");
			System.out.println();
			count=0;
		}
		return search;
	}
	
	// 3. 연락처와 주소를 수정하는 메서드.
	public void Update() throws IOException {
		System.out.println("1. 연락처 수정");
		System.out.println("2. 주소 수정");
		System.out.println("0. 수정 취소");
		System.out.print("수정 메뉴 선택 : ");
		int choice = Integer.parseInt(br.readLine());

		switch (choice) {
		case 0:
			System.out.println("수정을 취소하셨습니다.");
			System.out.println();
			break;
		case 1:
			for (int i = 0; i < vc.size(); i++) {
				MyMember mem = (MyMember)vc.elementAt(i);
				if (mem.getName().equals(SearchName)) {
					System.out.println(SearchName + "님의 연락처를 수정합니다.");
					System.out.print("수정할 연락처 : ");
					String fixNumber = br.readLine();
					System.out.println("성공적으로 수정하였습니다.");
					mem.setNumber(fixNumber);
				}
				System.out.println();
			}
			break;
		case 2:
			for (int i = 0; i < vc.size(); i++) {
				MyMember mem = (MyMember)vc.elementAt(i);
				if (mem.getName().equals(SearchName)) {
					System.out.println(SearchName + "님의 주소를 수정합니다.");
					System.out.print("수정할 주소 : ");
					String fixAddress = br.readLine();
					System.out.println("성공적으로 수정하였습니다.");
					mem.setAddress(fixAddress);
				}
				System.out.println();
			}
			break;			
		default:
			System.out.println("메뉴 선택 번호를 잘못 입력하셨습니다.");
			System.out.println();
			break;
		}
	}
	
	// 회원을 삭제하는 메서드.
	public void Delete() throws IOException {
		for (int i = 0; i < vc.size(); i++) {
			MyMember mem = (MyMember)vc.elementAt(i);
			if(mem.getName().equals(SearchName)) {
				System.out.print(SearchName + "님의 정보를 삭제하시겠습니까? (y/n) : ");
				String choice = br.readLine();
				if (choice.equals("Y") || choice.equals("y")) {
					System.out.println(SearchName + "님의 정보가 삭제되었습니다.");
					vc.removeElementAt(i);
					search = false;
				}else if (choice.equals("N") || choice.equals("n")) {
					System.out.println("삭제를 취소합니다.");
					continue;
				}else {
					System.out.println("잘못된 입력입니다. 메인화면으로 이동합니다.");
					continue;
				}
			}
		}
		System.out.println();
	}
	
	// 모든 회원 정보를 출력하는 메서드.
	public void MemberList() {
		for (int i = 0; i < vc.size();i++) {
			MyMember mem = (MyMember)vc.elementAt(i);
			System.out.println("===============================");
			System.out.println((i+1) + "번 회원정보");
			System.out.println("이름 : " + mem.getName());
			System.out.println("나이 : " + mem.getAge());
			System.out.println("전화번호 : " + mem.getNumber());
			System.out.println("주소 : " + mem.getAddress());
			System.out.println("===============================");
		}
		System.out.println();
	}
}