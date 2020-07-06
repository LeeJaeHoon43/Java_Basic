import static java.lang.System.out;
public class AssertEx{
	public void gugu(int dan){
		assert dan > 1 && dan < 10 : "2~9단 중 하나를 입력하세요";
		out.println(dan + "단");
		out.println("==========");
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 9; i++){
			sb.delete(0, sb.length());
			sb.append(dan);
			sb.append(" X ");
			sb.append(i+1);
			sb.append(" = ");
			sb.append(dan*(i+1));
			out.println(sb.toString());
		}
	}
	public static void main(String[] ar){
		AssertEx at = new AssertEx();
		try{	
			int dan = Integer.parseInt(ar[0]);
			at.gugu(dan);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
} 