public class MySingleton{
	// 싱글톤 패턴
	// 멤버
	private static MySingleton instance = null;
	// 생성자
	private MySingleton(){ // 외부에서 사용할 수 없음.
	}
	// 메서드
	public static MySingleton getInstance(){
		if(instance == null){
			synchronized(MySingleton.class){
				instance = new MySingleton();
			}
		}
		return instance;
	}
}	
