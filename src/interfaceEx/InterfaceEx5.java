package interfaceEx;

interface Ex5 {
	int A=10; //public final static int A=10; �� ���� 
			  //final static�̹Ƿ� ���� �ϸ� �ȵǰ� �ʱ�ȭ���� ������Ѵ�.
	public void print();
}
class ExImpl5 implements Ex5 {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("print...");
	}
	
}
public class InterfaceEx5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ExImpl5.A);
		System.out.println(Ex5.A);
	}
}
