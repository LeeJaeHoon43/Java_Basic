public class MySingleton{
	// �̱��� ����
	// ���
	private static MySingleton instance = null;
	// ������
	private MySingleton(){ // �ܺο��� ����� �� ����.
	}
	// �޼���
	public static MySingleton getInstance(){
		if(instance == null){
			synchronized(MySingleton.class){
				instance = new MySingleton();
			}
		}
		return instance;
	}
}	
