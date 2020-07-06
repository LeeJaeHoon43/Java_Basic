public class Animal1 {
	/*
	 *   - 클래스 이름은 Animal로 한다.
		 - 클래스 내부에는 생존여부를 가리키는 속성을 가진다.
		 - 나이와 이름 정보를 기억하는 속성을 가진다.
		 - 이름 정보를 바꾸는 기능이 있어야 한다.
		 - 이름 정보를 반환하는 기능이 있어야 한다.
		 - 생존 여부를 반환하는 기능이 있어야 한다.
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
