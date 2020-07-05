class Animal2 {
	// ¸â¹ö º¯¼ö.
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

	// ¸Þ¼­µå.
	public void move(String name) {
		System.out.println(name + "¶¥À» °È½À´Ï´Ù.");
	}
}
class Lion extends Animal2{
	@Override
	public void move(String name) {
		System.out.println(name + "°¡ ¾î½½··¾î½½·· °È½À´Ï´Ù.");
	}
}
class Dolphin extends Animal2{
	@Override
	public void move(String name) {
		System.out.println(name + "°¡ ¼ö¿µÀ» ÀßÇÕ´Ï´Ù.");
	}
}
class Swan extends Animal2{
	@Override
	public void move(String name) {
		System.out.println(name + "°¡ ÇÏ´ÃÀ» ³³´Ï´Ù.");
	}
}
