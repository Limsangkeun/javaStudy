package constructor;

class Test1{
	private int n; //메모리 할당 받는다. 0으로 초기화. 생성자의 몸체가 실행
	public Test1() { // 생성자. 리턴타입이 존재하지 않는다.
		//생성자 몸체 //객체 생성시에만 호출가능 //초기화 작업 수행
		//생성자가 없으면 인자가 없는 컴파일러는 디폴트 생성자를 만들어주지않으면 생성자가 있으면 디폴트 생성자를 만들지 않는다.
		System.out.println("생성자.................................................................");
		n = 10;
	}
	
	public void write() {
		System.out.println(n);
	}
}
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t = new Test1(); //생성자는 new 다음에 기술하며, 객체를 생성할때 사용한다.
		t.write();
//		Test1(); //오류. //***생성자는 new 다음에만 기술 가능
	}

}
