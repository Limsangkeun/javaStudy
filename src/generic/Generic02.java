package generic;

//this is Generic; <T> 데이터 형이 다르면 형에 따른 변수를 선언해야하지만 이를 해결하기 위해 하나의 변수나 메서드로 모든 형태를 처리하기 위해 만들어진 것
//일반적으로 해당하는 대문자 하나 사용
//동적 바인딩이므로 아무래도 정적 바인딩 보다 속도가 느리다.
class Test2<T>{
	private T t;
	
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		System.out.println(t.getClass()); //현재 t가 어느 형태인지 파악.
		return t;
	}
}

public class Generic02 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList가 이렇게 구성되어있구나

		Test2<String> t1 = new Test2<>();
		t1.set("korea");
		System.out.println(t1.get().length());
		Test2<Integer> t2 = new Test2<>();
		t2.set(100);
		System.out.println(t2.get());
		
		Test2 t3 = new Test2(); //실행은 되나 제네릭을 사용하도록 권장되고 있다.
		t3.set("aaa");
		System.out.println(((String)t3.get()).length());
		//컴파일 할 때 변수의 형을 검사하므로 형이 틀리면 컴파일 에러를 발생시켜 사전에 확인이 가능하다.
	}

}
