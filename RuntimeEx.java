public class RuntimeEx{
	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		long fr = rt.freeMemory();
		System.out.println("freeMemory : " + fr/1024 + "KB");
		long fr2 = rt.totalMemory();
		System.out.println("totalMemory : " + fr2/1024 + "KB");
		try{
			rt.exec("C:\\windows\\system32\\calc.exe");
		}
		catch (Exception e){
			System.out.println(e.toString());
		}
	}
}