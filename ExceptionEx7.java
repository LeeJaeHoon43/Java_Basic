public class ExceptionEx7{
	int[] ss;
	public ExceptionEx7(){
		ss = new int[3]; // �Ӽ�(��� �ʵ�) �ʱ�ȭ.
	}
	public void program(){
		for(int i = 0; i <= ss.length; i++){
			System.out.println("for���� ���� : " + i + "��°");
			try{
				System.out.println(ss[i]);	
			}catch (Exception e){
				System.out.println("Exception �߻� " + e); // e.toString()�� ����.
				System.out.println("e.getMessage : " + e.getMessage()); 
				e.printStackTrace();
				return;
			}finally{
				System.out.println("finally ����");
			}
			System.out.println("for���� �� " + i + "��°");
		}
	}
	public static void main(String[] ar){
		ExceptionEx7 ref = new ExceptionEx7();
		ref.program();
		System.out.println("���α׷� ����");
	}
} 