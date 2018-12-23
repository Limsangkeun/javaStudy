package generic;
//this is Generic method;
//OverLoading을 편하게 하는 느낌
class Test7<T>{
	private T t;
	
	public void set(T t) {
		this.t= t;
	}
	public T get() {
		System.out.println(t.getClass().getName().substring(10));
		return this.t;
	}
	
	public void print() {
		System.out.println(t.getClass().getName().substring(10));
	}
}

public class Generic07 {

	public static void main(String[] args) {
		Test7<Integer> t = new Test7<>();
		
		t.set(100);
		//Test7<Number> n = t; //엄격한 형변환 컴파일 오류!
		
		Test7<?> t2 = t; //?는 아직 형이 결정되지 않은 것 //컴퓨터 저장 내용을 지울때 이게 문자형인지 숫자형인지 구분없이 삭제하고 싶을 때와 비슷한 경우에서 사용한다.
		//자료형과 상관없이 배열 속에 갯수가 몇개인지만 알고 싶은때 일단 담아서 List의 size(), clear() 등에서 구체적인 자료형이 필요없는 경우 사용
		//자료형이 정해져있지 않기 때문에 연산이 불가능하다. //나중에 환원할 목적이 아니다.
		
		//t2.set(20); //컴파일 오류 //<?>은 자료형이 결정되지 않았기때문에 값을 넣을 수 없다.
		((Test7<Integer>)t2).set(20); //정말 꼭 사용해야한다면, 기왕이면 안쓰는게 제일 좋지만
		t2.print(); //가능. T에 의존적이지 않으므로 가능 
		System.out.println(t2.get());
	}
}
