class AClass{
}
interface CInter{
}
class BClass extends AClass implements CInter{
}
public class ABCEx{
	public static void main(String[] args){
		AClass ai = new AClass();
		BClass bp = new BClass();
		CInter ci = new BClass(); 
		System.out.println (ai instanceof Object);
		System.out.println (ci instanceof Object);
		System.out.println (bp instanceof Object);
		System.out.println (bp instanceof AClass);
		System.out.println (bp instanceof BClass);
		System.out.println (bp instanceof CInter);
	}
}