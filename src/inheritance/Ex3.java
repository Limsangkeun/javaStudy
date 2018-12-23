package inheritance;

class Test4{
	int x;
	public Test4(int x) {
		super();
		this.x = x;
	}
	public void print() {
		System.out.println(x);
	}
}
//��� ��쿡�� Super Ŭ������ �����ڰ� �ѹ� �ҷ������Ѵ�.
class Sample4 extends Test4{ //�����ڸ� ������ ������ �⺻�����ڸ� �����ϴµ� �θ�Ŭ������ �����ڰ� ���ڰ� �ִ� �������̹Ƿ� ������ �߻��Ѵ�.
	public Sample4() {
		super(10); // �������� �ֻ����� �����ؾ���...
		//this(10); // �ֻ� ���� �����ؾ��Ѵ�. �� super�� this �Ѱ��� ��� �����Ѵ�. //������ ���� �߻�
	}
	public Sample4(int x) {
		super(x); // �������� �ֻ����� �����ؾ���...
	}
}

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample4 sam = new Sample4();
		System.out.println(sam.x);

	}

}
