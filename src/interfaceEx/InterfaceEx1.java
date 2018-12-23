package interfaceEx;
//선언과 정의
//인터페이스 ? 추상 클래스의 일종, 함수 생성을 강제 //
interface Ex1 {
	//자바 8이하에서는 전부 public
	int sum(int n); //=>public abstract int sum(int n);으로 고침 
	public void print(String s);
}

class ExImpl1 implements Ex1 { //구현. 추상클래스가 아닌 경우에는 인터페이스의 모든 메서드를 재정의 해야 한다.
	@Override
	public int sum(int n) {
		int s=0;
		for(int i=0; i<n; i++) {
			s+=i;
		}
		return s;
	}
	@Override
	public void print(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
	}
	public void write() {
		System.out.println("write...");
	}
}

public class InterfaceEx1 {
	public static void main(String[] args) {
		ExImpl1 ob = new ExImpl1();
		ob.print("test");
		
		Ex1 ex = ob; //업캐스팅의 경우 인터페이스에 선언된 변수 함수만 사용가능하고 
					 //함수 사용시 재정의된 자식 클래스의 함수를 사용한다.
		ex.print("테스트");
		//ex.write(); //super class에 해당 메서드가 존재하지 않으므로 실행시 동작하는 컴파일러의 검사에서 걸림.
		
		((ExImpl1)ex).write(); //다운 캐스팅하면 사용 가능
	}
}
