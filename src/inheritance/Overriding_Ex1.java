package inheritance;
//oop 1.��� 2.������ 3.ĸ��ȭ

class Test6{
	int x=10;
	
	public void print() {
		System.out.println("x:"+x);
	}
}

class Sample6 extends Test6{
	int y=20;
	
	public void print(int a) { //�������̵� �ƴϰ� �����ε� 
		System.out.println("y:"+y);
	}
	//���� ���� �Ǽ��� �Ű������� �־��� ��쿡 ���� Ȯ���� �ʿ��ϴ�. �̷��� ������̼��� �̿��Ͽ� �����Ϸ����� ������ �ش�. //������ ��Ģ�� ���ݵǸ� ������ ������ �߻��Ѵ�.
	@Override
	public void print() { //Override(������) : ���� Ŭ������ �޼ҵ带 ������ 
		System.out.println("y:"+y);
	}
	public void sub() { //�켱 ������ �ڱ� �ڽ��� �޼ҵ尡 �� ����.
		//print(); // �ڱ� �ڽ��� Ŭ������ �޼ҵ� ȣ��
		super.print(); //superŬ������ �޼ҵ� ȣ��
	}
}
public class Overriding_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample6 ob = new Sample6();
		ob.print(); //�ڽ��� print�Լ��� ������ �θ��� print�Լ��� �θ���. �ڽ� print�� �ִ� ��Ȳ���� �θ��� print�� �θ��� ����.
	}
	
	

}
