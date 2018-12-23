package inheritance;

class Test5{
	static int c;
	static {
		System.out.println("suepr static �ʱ�ȭ ��");
		c = 200;
		System.out.println(c);
	}
	
	int x;
	{
		System.out.println("super �ʱ�ȭ ��");
		x=10;
	}
	
	public Test5() {
		System.out.println("super ������...");
	}
	
	public void print() {
		System.out.println(x);
	}
}

class Sample5 extends Test5{
	static int y; 
	static {
		System.out.println("sub static �ʱ�ȭ ��");
		y=100;
		System.out.println(y);
	}
	public Sample5() {
		super(); //�ƹ����� ���� �޸� �Ҵ��� �Ϸ�� �Ŀ��� �ڽ��� ������ �� �����Ƿ� super�� sub�� �ʱ�ȭ�� ���� �켱������ ���´�. //������ static ����� ���� ����ȴ�.
		System.out.println("sub ������...");
	}
	
	public void write() {
		System.out.println(x+":"+y);
	}
	
}
public class Ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample5 sam = new Sample5();
		sam.write();
	}

}
