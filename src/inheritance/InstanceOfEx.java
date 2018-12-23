package inheritance;
class Aac{
	int a=10;
	public void print() {
		System.out.println(a);
	}
}

class Demo1 extends Aac{
	int a = 0;
	int b = 20;
	int c = 30;
	static class A{
		
	}
	public void print() {
		System.out.println(a+":"+b+":"+c+":"+super.a);
	}
	public void write() {
		System.out.println(b+":"+c);
	}
}
public class InstanceOfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Aac e1 = new Demo1(); //��ĳ����
		Aac e2 = new Aac();
		e1.print(); //Demo1 �޼ҵ� ȣ�� //�������̵� �����Ƿ�
		System.out.println(e1.a); //Ex1�� a
		
		//e1.write();//�����Ϸ��� e1�� write�޼��尡 �����Ƿ� �θ��� ���Ѵ�. //������ ����
		((Demo1)e1).write(); //���� �ٿ�ĳ���� �ʿ�;
		//((Demo1)e2).write(); //��Ÿ�� ����. ��ĳ���� �Ѱ͸� �ٿ� ĳ���� �����ϹǷ�
		
		System.out.println(e1 instanceof Demo1);
		System.out.println(e2 instanceof Demo1);
		
		//�̷����� �ڵ�� ��Ÿ�ӿ����� ���̴� ȿ���� �ִ�.
		if(e1 instanceof Demo1) {
			Demo1 c1 = (Demo1)e1;
			System.out.println("�ٿ� ĳ����...");
			c1.write();
		}
		if(e2 instanceof Demo1) {
			Demo1 c1 = (Demo1)e2;
			System.out.println("�ٿ� ĳ����2...");
			c1.write();
		}
	}

}
