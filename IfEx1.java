public class IfEx1{
	public static void main(String[] ar){
		int a = 80; // a의 값을 입력받는 형태로 변환해보기.
		String grade = "";
		if(a >= 90){
			grade = "A학점";
		} else if(a >= 80){
			grade = "B학점";
		} else if(a >= 70){
			grade = "C학점";
		} else if(a >= 60){
			grade = "D학점";
		} else {
			grade = "F학점";
		}
		System.out.println("당신의 학점은 : " + grade);
	}
}