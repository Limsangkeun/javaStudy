package work;
//�ʱ�ȭ �Ҽ� �ִ� ���
//1. �������� ����� ���ÿ� �ʱ�ȭ
//2. �ʱ�ȭ ������ ���(���� ��� ����. �׳� �����ڿ��� �ʱ�ȭ�ض�)
//2.1 static �ʱ�ȭ ���� ���δ�. 
//3. �����ڿ��� �ʱ�ȭ
class Ex1{
	private int a;
	private int b=10;
	//n=10; //������ ����. ���๮�� �ü� ����.
	
	public static int x=5;
	public static int y;
	
	//�ʱ�ȭ ��
	{
		System.out.println("�ʱ�ȭ ��(�����ں��� ���� ����). ��ü�� �����ɶ����� ����");
		a=10;
	}
	//static �ʱ�ȭ ��
	static {
		System.out.println("static �ʱ�ȭ ��. Ŭ������ �ε��ɶ� �ѹ��� ����");
		y=6;
	}
	
	public Ex1() {
		System.out.println("������...");
	}
	public void print() {
		System.out.println(a+":"+b);
	}
	
	public static void write() {
		System.out.println(x+":"+y);
	}
}

public class Initialized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ex1 e; //static �ʱ�ȭ ���� ������� �ʴ´�. Ŭ������ �ε��Ǵ� ������ Ŭ������ ���ɶ��̴�.
		//
		//Ex1.write(); //Ŭ������ ���Ǵ� �����̹Ƿ� static ���� ����ȴ�.
		
		Ex1 e1 = new Ex1(); //Ŭ������ ���� ���� static �ʱ�ȭ ���� ����ȴ�.
		//1. static �ʱ�ȭ �� ����
		//2. �ʱ�ȭ �� ����
		//3. ������ ��ü�� ����
		Ex1 e2 = new Ex1();
		//1. �ʱ�ȭ �� ����(static �ʱ�ȭ ���� �̹� ����Ǿ���.)
		//2. ������ ��ü�� ����
		e1.print();
		e2.print();
		int x=0, y=10;
		System.out.println();
	}

}
