package api;


class Ex2{ //object Ŭ������ ��� ����
	//private int a=10, b=20; //�ʵ�� ���� ���� ����� �̷������� �ϸ� ȥ��
	private int a=10;//like this
	private int b=20;
	
	public void sub() {
		System.out.println(a+":"+b);
	}
	
	/*@Override
	public String toString() {
	//	return a+b;
	}*/
}
public class ObjectEx { //Object Ŭ������ ��� ����

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex2 ob = new Ex2();
		Ex2 ob2 = new Ex2();
		System.out.println(ob.toString()); //toString�� ObjectŬ������ �޼���.. �⺻������ Ŭ������ Object Ŭ������ ��ӹ޴´�. //Ŭ���� �̸�@�ؽ��ڵ�
		System.out.println(ob2);//ob == ob.toString()
		Object ob3 = new Object();
		//Ex3Ŭ������  ������Ʈ Ŭ������ �޼���� ��밡���ϳ� ������Ʈ Ŭ���� ��ü�� �ڽ� Ŭ������ Ex2�� �޼��带 ����� �� ����.
		
		System.out.println(ob.equals(ob2)); 
		System.out.println(ob==ob2);
		
		System.out.println(ob.hashCode());
		System.out.println(ob2.hashCode());
		System.out.println("===================");
		
		
		//�������̵� : �θ� Ŭ������ �Լ��� ������ �ؼ� ���
	}
}
