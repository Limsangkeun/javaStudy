package interfaceEx;

interface Ex2{
	public void print();
}

interface Test2{
	public void write();
	//���⼭�� print �����ؼ� ����� �� ����
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
		
		Ex2 e1 = ex; //��ĳ����
		Test2 e2 = ex; //��ĳ����
		e1.print();
		//e1.write(); //���� �߻�
		((ExImpl2)e1).write(); //�ٿ� ĳ����
		e2.write();
		//e2.print(); //���� �߻�
		((ExImpl2)e2).print(); //�ٿ�ĳ����
	}

}
