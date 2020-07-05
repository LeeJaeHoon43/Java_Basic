public class OuterEx{
	public static class InnerEx{
		static int x = 10;
		public static void main(String[] args){
			OuterEx.InnerEx ei = new OuterEx.InnerEx();
			System.out.println("ei.x : " + ei.x);
			System.out.println("ei.x : " + OuterEx.InnerEx.x);
			// 에디트플러스에서 실행 에러 발생. 이클립스나 cmd창에서 실행 가능.
		}
	}
} // 실행하려면 java OuterEx$InnerEx