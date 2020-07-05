// �θ� Ŭ����.
class Animal{
	public String scream(){
		return "���� �����Ҹ�"; // �ڽ� Ŭ�������� �������̵��ؼ� ����� ���̱� ������ �⺻ Ʋ�� �����д�.
	}

	public String getName(){
		return null; // �ڽ� Ŭ�������� �������̵��ؼ� ����� ���̱� ������ �⺻ Ʋ�� �����д�.
	}
}

// �ڽ� Ŭ����.
class Dog extends Animal{
	private String name;
	public Dog(){
		name = getClass().getSimpleName(); // getClass()�޼���� ���� ���� ���� Ŭ������ �ܼ� Ŭ���� �̸��� ��������.(getSimpleName()�޼���)
	}

	public String scream(){
		return "�۸ۿпб���";
	}
	public String getName(){
		return name;
	}
}

class Cat extends Animal{
	private String name;
	public Cat(){
		name = getClass().getSimpleName(); // getClass()�޼���� ���� ���� ���� Ŭ������ �ܼ� Ŭ���� �̸��� ��������.(getSimpleName()�޼���)
	}

	public String scream(){
		return "�߿˾߿˿ֿ�";
	}
	public String getName(){
		return name;
	}
}

class Tiger extends Animal{
	private String name;
	public Tiger(){
		name = getClass().getSimpleName(); // getClass()�޼���� ���� ���� ���� Ŭ������ �ܼ� Ŭ���� �̸��� ��������.(getSimpleName()�޼���)
	}

	public String scream(){
		return "�׸����������";
	}
	public String getName(){
		return name;
	}
}
class Hospital{
	public void inject(Animal animal){
		System.out.println(animal.getName() + "��(��) ġ���ϱ� ���� �ֻ縦 ���ҽ��ϴ�.");
		System.out.println(animal.scream());
	}
}

public class HospitalMain{
	public static void main(String[] args) {
		Hospital hospital = new Hospital(); // ��ü ����.

		// ������ ��ü ����.
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();

		hospital.inject(dog);
		hospital.inject(cat);
		hospital.inject(tiger);
	}
}
