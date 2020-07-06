import java.util.StringTokenizer;
public class StringTokenEx1{
	
	// ���
	StringTokenizer st;
	
	// ������
	public StringTokenEx1(String str){
		System.out.println("str : " + str);
		st = new StringTokenizer(str);
	}
	public StringTokenEx1(String str, String delim){
		System.out.println("str : " + str);
		st = new StringTokenizer(str, delim);
	}
	
	// �޼���.
	public void print(){
		System.out.println("Token count : " + st.countTokens());
		while(st.hasMoreTokens()){
			String token = st.nextToken();
			System.out.println(token);
		}
		System.out.println("-----------------------------------------------");
	}
	public static void main(String[] args) {
		/*
		* StringTokenizer Ŭ����.
	 	- java.util��Ű��
	 	- ���ڿ��� ������ ���ڿ��� �и��� �� ���.
	 	- ������ ���ڿ��� ��ū�̶�� �Ѵ�.
	 	
	 	* �޼���
	 	- countTokens() : ��ū�� �� �ڿ��� ���� ��ȯ�Ѵ�.
	 	- hasMoreTokens() : token�� �� �ִ� �ڿ��� ���� ��� true, ������ false�� ��ȯ�Ѵ�.
	 	- nextToken() : token�� �ڿ��� ��ȯ�Ѵ�.
		*/	
		StringTokenEx1 st1 = new StringTokenEx1("Happy day");
		st1.print();
		StringTokenEx1 st2 = new StringTokenEx1("2020/04/10","/");
		st2.print();
	}
}