package generic;

//한정된 타입 파라미터
//extends를 사용하여 한정된 타입만 가능하도록 한다.
class Test3<T extends Number> { //Number의 자식들만 가능하다. 즉 숫자만 가능하도록
	private T t;

	public void set(T t) {
		this.t = t;
	}
	public T get() {
		System.out.println(t.getClass().getName()); //현재 t가 어느 형태인지 파악.
		return t;
	}
}

public class Generic03 {
	
	
	public static void main(String[] args) {
		Test3<Integer> test = new Test3<>();
		//Test3<String> test2 = new Test3<>(); //컴파일 에러 Number의 자식이 아니므로 컴파일 에러가 발생한다.
		//test.set("String");컴파일 에러
	}

}
