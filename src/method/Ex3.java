package method;

class Method3{
	//�ν��Ͻ� ����
	int x=10; //������ ��Ű�������� ���� ����
	private int y=20; //Ŭ���� �ܺο��� ���� �Ұ�
	public static int z=30; //Ŭ���� ����
	public void sub1() { //�ν��Ͻ� �޼��� => �ٸ� �޼��� ȣ�⿡ ������ ����.
		sub2();
		sub3();
		System.out.println(x+":"+y+":"+z);
	}
	private void sub2() {
		System.out.println("private �޼ҵ�.....");
	}
	
	public static void sub3() { //Ŭ���� �޼ҵ�
		//System.out.println(x); //������ ����. �ν��Ͻ� ���� ���� �Ұ�(�޸� �Ҵ��ؾ��ϹǷ�)
		System.out.println("static �޼ҵ� : "+z);
		
		//�ν��Ͻ� ������ �����ϰ� ������ ��ü�� �����ϰ� �����ؾ��Ѵ�.
		Method3 o = new Method3();//�޸� �Ҵ�
		System.out.println(o.x);
	}
}
public class Ex3 {
	int a=10;
	public void write() { //���� �޼��忡 ���� �Լ��� ���� ���� �ʴ´�.
		System.out.println("a : "+a);
	}
	public static void main(String[] args) { //���α׷� ����� Ŭ���� �Լ� main�� ã�´�. static�� ���� �ν��Ͻ� �Լ�ȭ�ϸ� ���� �Ұ�
		// TODO Auto-generated method stub
		//System.out.println(a);//�ν��Ͻ� ������ Ŭ���� �Լ��� ��� �� �� ����.//�Ŀ���.
		Ex3 obj = new Ex3();
		obj.write();
		
		Method3 ee = new Method3();
		System.out.println(Method3.z); //Ŭ���� ���� ȣ��
		Method3.sub3(); //Ŭ���� �Լ� ȣ��
		ee.sub1();
		//ee.sub2(); //private�� Ŭ���� �ܺ��� ������ �����Ƿ� ȣ�� �Ұ�	
	}
}
