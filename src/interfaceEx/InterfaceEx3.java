package interfaceEx;

//alt + shift + r =>�Ȱ��� �̸� ��ü Rename;
//alt + shift + s + r => getter,setter ����
interface Aex3 {
	public void print();
}

interface Bex3 {
	public void write();
}

interface Ex3 extends Aex3, Bex3 { // �������̽��� ���߻���� ���� //������ ���� ���
	public void sub();
}

class ExImpl3 implements Ex3 {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print....");
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("write....");
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("sub....");
	}

}

public class InterfaceEx3 {
	public static void main(String[] args) {
		Ex3 ex = new ExImpl3();
		Aex3 ex2 = new ExImpl3();
		Bex3 ex3 = new ExImpl3();
		
		ex.sub();
		ex.print(); //�� �����Ѱ�? super interface �κ��� ��� �޾ұ� ����
		ex.write(); //�� �����Ѱ�? super interface �κ��� ��� �޾ұ� ����
		
		ex2.print();
		ex3.write();
		
	}
}
