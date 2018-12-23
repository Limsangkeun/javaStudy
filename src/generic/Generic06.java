package generic;
//this is Generic method;
//OverLoading을 편하게 하는 느낌
class Test6<T>{
	private T t;
	
	public void set(T t) {
		this.t= t;
	}
	public T get() {
		System.out.println(t.getClass().getName().substring(10));
		return this.t;
	}
}

public class Generic06 {

	public static void main(String[] args) {
		Test6<Number> t1 = new Test6<>();
		t1.set(new Integer(10)); //Number이지만 Integer를 넣을 수 있다. 즉 상속 관계에서는 가능하다.
		System.out.println(t1.get());
		
		//캐스팅 관계에 관하여
		Number nn = new Integer(50); //업캐스팅
		System.out.println(nn);
		
		Test6<Number> n1;
		Test6<Integer> n2 = new Test6<>();
		//n1 = n2;//컴파일 오류 //제네릭은 형이 엄격! 자기 자신만 가능하다. //즉 안전하다. //이게 되면 그냥 Object 쓰는거랑 차이가 없다		
		
	}

	

}
