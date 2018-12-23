package starCraft;
interface A{
	void printA();
}
class B{
	void printB() {
		
	}
}
class C extends B{
	void printC() {
		
	}
}
class D extends C implements A{
	void printD() {
		
	}

	@Override
	public void printA() {
		// TODO Auto-generated method stub
		
	}
}
public class SomeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new D();
		A a = (A)b;
		
		//인터페이스를 구현하고 상속받은 클래스를 인터페이스 형변환 -> 부모 클래스로 다시 형변환 가능
	}

}
