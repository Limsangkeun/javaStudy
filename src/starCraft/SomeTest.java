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
		
		//�������̽��� �����ϰ� ��ӹ��� Ŭ������ �������̽� ����ȯ -> �θ� Ŭ������ �ٽ� ����ȯ ����
	}

}
