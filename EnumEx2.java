public class EnumEx2{
	public	enum Item{
		Add, Del, Search, Cancel
	}
	public static void main(String[] args){
		Item a1 = Item.Search;
		if(a1 instanceof Object){ // 열거형이 객체인지 아닌지 비교.
			System.out.println(a1.toString()+"^^");
			System.out.println("ok, instanceof Object");
			System.out.println("저장된 실제 정수값 : " + a1.ordinal()); // a1 == Search가 가지고 있는 정수값.			
		}
		Item[] items = Item.values(); // 요소를 배열로 전달한다.
		System.out.println("items.length : " + items.length);
		for(Item n : Item.values()){
			System.out.println(n + " : " + n.ordinal());
		}
	}
}