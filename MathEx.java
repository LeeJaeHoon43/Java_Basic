public class MathEx{
	public static void main(String[] args) {
		// Math 클래스 : 수학관련 클래스.
		// 수학계산을 위한 상수 값과 수학관련 메서드.
		// Math 클래스는 인스턴스(객체)를 생성하지 않고 사용한다.
		double da;
		da = Math.pow(2, 3);
		System.out.println("2의 3승 = Math.pow(2, 3) = " + da);
		da = Math.max(300f, 301.0);
		System.out.println("Math.max(300f, 301.0) = " + da);
		da = Math.min(300f, 301.0);
		System.out.println("Math.min(300f, 301.0) = " + da);
		da = Math.abs(-1234.1);
		System.out.println("Math.abs(-1234.1) = " + da);
		da = Math.abs(+1234.1);
		System.out.println("Math.abs(+1234.1) = " + da);
		da = Math.random();
		System.out.println("Math.random() = " + da);
		da = Math.random();
		System.out.println("Math.random() = " + da);
		da = Math.sqrt(90000);
		System.out.println("Math.sqrt(90000) = " + da);
		long dda = Math.round(123.56);
		System.out.println("Math.round(123.56) = " + dda);
		dda = Math.round(123.46);
		System.out.println("Math.round(123.46) = " + da);
		da = Math.ceil(123.56);
		System.out.println("Math.ceil(123.56) = " + da);
		da = Math.ceil(123.46);
		System.out.println("Math.ceil(123.46) = " + da);
		da = Math.floor(123.56);
		System.out.println("Math.floor(123.56) = " + da);
		da = Math.floor(123.46);
		System.out.println("Math.floor(123.46) = " + da);
		da = Math.rint(123.56);
		System.out.println("Math.rint(123.56) = " + da);
		da = Math.rint(123.46);
		System.out.println("Math.rint(123.46) = " + da);
		da = Math.sin(45);
		System.out.println("Math.sin(45) = " + da);
		int degrees = 60;
		da = Math.toRadians(degrees);
		System.out.println("Math.toRadians(60) = " + da);
		double radians = ((double)degrees/180.0) * Math.PI;
		System.out.println("radians(60) = " + radians);
		da = Math.toDegrees(radians);
		System.out.println("Math.toDegrees(radians) = " + da);
		da = Math.PI;
		System.out.println("Math.PI = " + da); // 원주율
		da = Math.E;
		System.out.println("Math.E = " + da); // e라는 자연 로그 상수.
	}
}