package classStudy;

class Test6{
	private int a,b;
	public Test6() {
		//�����ڿ����� �ٸ� �������� �ڵ带 ȣ���ؼ� ����� �� �ִ�.
		this(1,2);//�ٸ� ������ ȣ��. ��ü�� �� �����Ǵ� ���� �ƴ϶� ���� �ٸ� �������� �ڵ带 ���� this([�μ�]);�� �������� �� ��ܿ��� �ѹ��� ȣ�� ����
		System.out.println("���� ���� ������...");
		//Test6(1,2); //�Ŀ���
		
	}
	public Test6(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("���� �ִ� ������....");
	}
	
	public void write() {
		System.out.println(this.a+":"+this.b);
		//System.out.println(a+":"+b);//same
	}
}






public class This_Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test6 t = new Test6();
		t.write();
	}
}
