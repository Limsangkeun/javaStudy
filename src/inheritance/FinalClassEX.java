package inheritance;

final class FinalTest{
	
}
/*class Demo3 extends FinalTest{ //������ ���� ���̳� Ŭ������ ���� Ŭ������ �����Ҽ� ����~
								 //��ǥ final Ŭ���� : String Ŭ����
}*/
class Demo3{
	public final static double PI = 3.141592;
	//final static ������ �ʱ� ���� �ִ� �� 1. ����� ���ÿ� 2. static �ʱ�ȭ ��Ͽ��� 
	public final static int A;
	static {
		A=3;
	}
	//final Field ������ �ʱ� ���� �ִ� �� 1.����� ���ÿ� 2.�ʱ�ȭ ��Ͽ��� 3. �����ڿ���
	public final int a;
	{
		a=3;
	}
	public final int c;
	public Demo3() {
		c=20;
	}
	//final static �� ���α׷����� �ѹ� �޸� �Ҵ� �׳� final ������ ��ü �����ø��� ���ο� ���� ���� �� �ִ�.
	//final ������ �ʱ�ȭ�� �ѹ��� ���� �ѹ��� ���ؾ���
	public void print() {
		final int x;
		x=10;
		System.out.println(x);
	}
	
	public final void write() { //����Ŭ�������� ������ �Ұ�.		
	}
}

class Sample43 extends Demo3{
	//public void write() {} //final �޼���� �����ǰ� �Ұ����ϴ�.//������ ����
}
public class FinalClassEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Demo3.PI = 3.15; //�Ŀ���. final ������ �� ���� ��
		//final ������ static���� ���� ����ϰ� �������� �빮�ڷ� �ش�.
	}

}
