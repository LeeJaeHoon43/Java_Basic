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
	
	// ȸ�������� �Ǿ� �ִ��� Ȯ���ϴ� �޼���.
	public boolean JoinOk() {
		if (vc.size() == 0) {
			joinOk = false;
		}else {
			joinOk = true;
		}
		return joinOk;
	}
	
	// 1. ȸ�������� �����ϴ� �޼���.
	public void Join() throws IOException {
		System.out.print("�̸� : ");
		String name = br.readLine();
		System.out.print("���� : ");
		int age = Integer.parseInt(br.readLine());
		System.out.print("��ȭ��ȣ : ");
		String number = br.readLine();
		System.out.print("�ּ� : ");
		String address = br.readLine();
		MyMember member = new MyMember(name, age, number, address);
		vc.add(member);
		System.out.println("���������� �����Ͽ����ϴ�.");
		System.out.println();
	}
	
	// 2. ȸ�� �˻��� �ϴ� �޼���.
	public boolean Search() throws IOException {
		System.out.print("ã���ô� ȸ�� �̸� : ");
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
			System.out.println("�˻��� �����Ͽ����ϴ�.");
			System.out.println();
		} else if(count == vc.size()) {
			System.out.println("�˻��� �����Ͽ����ϴ�.");
			System.out.println();
			count=0;
		}
		return search;
	}
	
	// 3. ����ó�� �ּҸ� �����ϴ� �޼���.
	public void Update() throws IOException {
		System.out.println("1. ����ó ����");
		System.out.println("2. �ּ� ����");
		System.out.println("0. ���� ���");
		System.out.print("���� �޴� ���� : ");
		int choice = Integer.parseInt(br.readLine());

		switch (choice) {
		case 0:
			System.out.println("������ ����ϼ̽��ϴ�.");
			System.out.println();
			break;
		case 1:
			for (int i = 0; i < vc.size(); i++) {
				MyMember mem = (MyMember)vc.elementAt(i);
				if (mem.getName().equals(SearchName)) {
					System.out.println(SearchName + "���� ����ó�� �����մϴ�.");
					System.out.print("������ ����ó : ");
					String fixNumber = br.readLine();
					System.out.println("���������� �����Ͽ����ϴ�.");
					mem.setNumber(fixNumber);
				}
				System.out.println();
			}
			break;
		case 2:
			for (int i = 0; i < vc.size(); i++) {
				MyMember mem = (MyMember)vc.elementAt(i);
				if (mem.getName().equals(SearchName)) {
					System.out.println(SearchName + "���� �ּҸ� �����մϴ�.");
					System.out.print("������ �ּ� : ");
					String fixAddress = br.readLine();
					System.out.println("���������� �����Ͽ����ϴ�.");
					mem.setAddress(fixAddress);
				}
				System.out.println();
			}
			break;			
		default:
			System.out.println("�޴� ���� ��ȣ�� �߸� �Է��ϼ̽��ϴ�.");
			System.out.println();
			break;
		}
	}
	
	// ȸ���� �����ϴ� �޼���.
	public void Delete() throws IOException {
		for (int i = 0; i < vc.size(); i++) {
			MyMember mem = (MyMember)vc.elementAt(i);
			if(mem.getName().equals(SearchName)) {
				System.out.print(SearchName + "���� ������ �����Ͻðڽ��ϱ�? (y/n) : ");
				String choice = br.readLine();
				if (choice.equals("Y") || choice.equals("y")) {
					System.out.println(SearchName + "���� ������ �����Ǿ����ϴ�.");
					vc.removeElementAt(i);
					search = false;
				}else if (choice.equals("N") || choice.equals("n")) {
					System.out.println("������ ����մϴ�.");
					continue;
				}else {
					System.out.println("�߸��� �Է��Դϴ�. ����ȭ������ �̵��մϴ�.");
					continue;
				}
			}
		}
		System.out.println();
	}
	
	// ��� ȸ�� ������ ����ϴ� �޼���.
	public void MemberList() {
		for (int i = 0; i < vc.size();i++) {
			MyMember mem = (MyMember)vc.elementAt(i);
			System.out.println("===============================");
			System.out.println((i+1) + "�� ȸ������");
			System.out.println("�̸� : " + mem.getName());
			System.out.println("���� : " + mem.getAge());
			System.out.println("��ȭ��ȣ : " + mem.getNumber());
			System.out.println("�ּ� : " + mem.getAddress());
			System.out.println("===============================");
		}
		System.out.println();
	}
}