class Animal2 {
	// ��� ����.
	int age;
	String name;
	String gender;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	// �޼���.
	public void move(String name) {
		System.out.println(name + "���� �Ƚ��ϴ�.");
	}
}
class Lion extends Animal2{
	@Override
	public void move(String name) {
		System.out.println(name + "�� ������ �Ƚ��ϴ�.");
	}
}
class Dolphin extends Animal2{
	@Override
	public void move(String name) {
		System.out.println(name + "�� ������ ���մϴ�.");
	}
}
class Swan extends Animal2{
	@Override
	public void move(String name) {
		System.out.println(name + "�� �ϴ��� ���ϴ�.");
	}
}
