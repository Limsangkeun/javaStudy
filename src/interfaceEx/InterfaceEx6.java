package interfaceEx;
//여기서부턴 jdk 8이상 에서만 가능한 코드

interface Ex6{
	public void print();
	public default void write() {
		System.out.println("write...");
	}
	public static void method() {
		System.out.println("static...");
	}
}
class ExImpl6 implements Ex6{
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("ExImpl6 print....");
	}
	//default method도 오버로딩 가능하다.
	@Override
	public void write() {
		System.out.println("sub write....");
	}
}
class ExImpl7 implements Ex6{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("ExImpl7 print....");
	}
}

class Test23 extends ExImpl7{
	
}

public class InterfaceEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex6.method();
		//Ex6.write(); //컴파일 오류
		
		new ExImpl6().print();
		new ExImpl6().write();
		Ex6 test2 = new ExImpl7();
		test2.write();
		Ex6 test = new ExImpl6();
		test.write();
		Test23 testq = new Test23();

		
	}

}
