package inheritance;

class Test2{
	private int a=10; //�ڽ� Ŭ�������� private ������ �����Ϸ��� GET �޼��带 �������ִ� ��� �ۿ� ����.
	int b=20;
	public int c =3;
	
	public void write() {
		System.out.println(a+":"+b+":"+c);
	}
	
	public static void sub() {
		System.out.println("Static �޼ҵ�...");
	}
	
}
//Test2 : Sample2�� super class
//Sample2 : Test2�� sub class
class Sample2 extends Test2{
	int c=40;
	int d=50;
	
	public void print() {
		//System.out.println(a);//������ ���� //private�̹Ƿ�
		System.out.println(b); //super�� b�� ���
		System.out.println(this.b); //�ƹ����� �����̹Ƿ� this�� �ٿ��� ȣ�⵵ �����ϴ�.
		System.out.println(c); //�ڽ��� ������ �θ��� �������� �켱������ ����.
		System.out.println(super.c); //����Ŭ������ �ʵ� ���� 
		write();
	}
	
}
public class Ex1 {

	public static void main(String[] args) {
		Object ob = new Sample2();
		Test2 t = (Test2)ob;
		System.out.println();
	}

}
