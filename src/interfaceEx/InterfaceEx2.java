package interfaceEx;

interface Ex2{
	public void print();
}

interface Test2{
	public void write();
	//여기서도 print 선언해서 사용할 수 있음
}

class ExImpl2 implements Ex2, Test2{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("ExImpl2 write()");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("ExImpl2 print()");
	}
	
}
public class InterfaceEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExImpl2 ex = new ExImpl2();
		ex.print();
		ex.write();
		
		Ex2 e1 = ex; //업캐스팅
		Test2 e2 = ex; //업캐스팅
		e1.print();
		//e1.write(); //에러 발생
		((ExImpl2)e1).write(); //다운 캐스팅
		e2.write();
		//e2.print(); //에러 발생
		((ExImpl2)e2).print(); //다운캐스팅
	}

}
