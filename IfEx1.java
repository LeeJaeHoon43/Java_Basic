public class IfEx1{
	public static void main(String[] ar){
		int a = 80; // a�� ���� �Է¹޴� ���·� ��ȯ�غ���.
		String grade = "";
		if(a >= 90){
			grade = "A����";
		} else if(a >= 80){
			grade = "B����";
		} else if(a >= 70){
			grade = "C����";
		} else if(a >= 60){
			grade = "D����";
		} else {
			grade = "F����";
		}
		System.out.println("����� ������ : " + grade);
	}
}