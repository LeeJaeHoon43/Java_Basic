public class Animal1 {
	/*
	 *   - Ŭ���� �̸��� Animal�� �Ѵ�.
		 - Ŭ���� ���ο��� �������θ� ����Ű�� �Ӽ��� ������.
		 - ���̿� �̸� ������ ����ϴ� �Ӽ��� ������.
		 - �̸� ������ �ٲٴ� ����� �־�� �Ѵ�.
		 - �̸� ������ ��ȯ�ϴ� ����� �־�� �Ѵ�.
		 - ���� ���θ� ��ȯ�ϴ� ����� �־�� �Ѵ�.
	 */
	private String name;
	private int age;
	private boolean live;
	
	public Animal1(String name, int age, boolean live) {
		this.name = name;
		this.age = age;
		this.live = live;
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

	public boolean isLive() {
		return live;
	}

	public void setLive(boolean live) {
		this.live = live;
	}
}
