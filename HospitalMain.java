// 부모 클래스.
class Animal{
	public String scream(){
		return "동물 울음소리"; // 자식 클래스에서 오버라이딩해서 사용할 것이기 때문에 기본 틀만 만들어둔다.
	}

	public String getName(){
		return null; // 자식 클래스에서 오버라이딩해서 사용할 것이기 때문에 기본 틀만 만들어둔다.
	}
}

// 자식 클래스.
class Dog extends Animal{
	private String name;
	public Dog(){
		name = getClass().getSimpleName(); // getClass()메서드로 현재 실행 중인 클래스의 단순 클래스 이름만 가져오기.(getSimpleName()메서드)
	}

	public String scream(){
		return "멍멍왈왈깨갱";
	}
	public String getName(){
		return name;
	}
}

class Cat extends Animal{
	private String name;
	public Cat(){
		name = getClass().getSimpleName(); // getClass()메서드로 현재 실행 중인 클래스의 단순 클래스 이름만 가져오기.(getSimpleName()메서드)
	}

	public String scream(){
		return "야옹야옹왜용";
	}
	public String getName(){
		return name;
	}
}

class Tiger extends Animal{
	private String name;
	public Tiger(){
		name = getClass().getSimpleName(); // getClass()메서드로 현재 실행 중인 클래스의 단순 클래스 이름만 가져오기.(getSimpleName()메서드)
	}

	public String scream(){
		return "그르릉어흥어흥";
	}
	public String getName(){
		return name;
	}
}
class Hospital{
	public void inject(Animal animal){
		System.out.println(animal.getName() + "을(를) 치료하기 위해 주사를 놓았습니다.");
		System.out.println(animal.scream());
	}
}

public class HospitalMain{
	public static void main(String[] args) {
		Hospital hospital = new Hospital(); // 객체 생성.

		// 다형성 객체 생성.
		Animal dog = new Dog();
		Animal cat = new Cat();
		Animal tiger = new Tiger();

		hospital.inject(dog);
		hospital.inject(cat);
		hospital.inject(tiger);
	}
}
