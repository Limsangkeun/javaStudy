package inheritance;
class Test3{
	int a=10;
	int b=20;
	
	public Test3() {//�����ڸ� ������ ���� ��쿡�� public Test3(){} ó�� �����Ϸ��� ����Ʈ �����ڸ� �������
		System.out.println("super Ŭ������ ������...");
	}
	
	public void write() {
		System.out.println(a+":"+b);
	}
	
}
class Sample3 extends Test3{
	int b=100;
	int c =200;
	public Sample3() {
		super(); //�����ڸ� ������ �ʰų� �Է����� ���� ��쿡�� �ڵ����� ���Եȴ�. �θ��� ������ ȣ��
		System.out.println("sub class ������....");
	}
	public void print() {
		System.out.println();
		System.out.println(a+":"+super.b+":"+b+":"+c);
	}
}
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample3 ob = new Sample3();
		
	}

}
