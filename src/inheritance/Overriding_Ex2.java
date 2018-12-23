package inheritance;

class Test7{
	int a=10;
	int b=20;
	
	public void write() {
		System.out.println(a+":"+b);
	}
	
	public void disp() {
		System.out.println("��� : "+a+","+b);
	}
}

class Sample7 extends Test7{
	int b=100;
	int c=200;
	@Override
	public void write() {
		System.out.println(a+":"+b+":"+c);
	}
	
	public void method() {
		super.write();
		System.out.println(super.b);
	}
}
public class Overriding_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample7 ob = new Sample7();
		Test7 tt = new Test7();
		System.out.println(ob.a); //10
		
		Test7 ts =ob; //up casting. ������ ����. casting ���� �ʾƵ� �� //�ڽ��� ��������� �ƹ����� �ڵ����� ���������. �׷��� ���� 
		System.out.println();
		tt.write();
		
		//Sample7 st = tt;//������ ����. down casting.  �ٿ� ĳ������ ��ĳ���� �Ѱ͸� ���� //�ٿ�ĳ������ ��������� ĳ������ �ؾ��� 
		//�ƹ��� ��ü�� �����԰� ���ÿ� �ڽ� ��ü�� �Ҵ��� �� ����.
		
		System.out.println(ts.b); //20 �θ�(Test7�� b) //�ʵ�� �ڱ� �ڽ��� �켱������ ����. ��� ts�� ob�� ��Ÿ���� ������ ts �ڽ��� �ʵ尡 �� �켱������ ������.
		//System.out.println(ts.c); //������ ���� //Test7�� c ������ �����Ƿ� �Ҽ� ����.
		ts.write(); //�ڽ�(Sample7)�� write �Լ� ȣ��
					//�޼ҵ尡 �����ǵǸ� ����Ŭ������ �޼ҵ�� ���������.
					//�����̵Ǹ� ���� �����ǵ� super class�� �Լ��� ����� �� ����.
		
		tt.write(); // �ڽ��� �޼ҵ� tt�� Test7�� ��ü ts�� Test7�� ������ ���� �ִ� Sample7 ��ü
		
		Sample7 s = (Sample7)ts; //Roll back to Sample7 //Down Casting. ��ĳ���� �Ѱ͸� �ٿ� ĳ���� ����
		System.out.println(s.c);
		//Sample7 s2 = (Sample7)tt; //�Ǵ� ��ó�� �������� ��Ÿ�� ���� �߻�
		//s2.write();// ��ĳ������ ���� ���� ���� �ٿ� ĳ�����Ͽ����Ƿ� ���� �߻�
		
		
		/*
		 * --Ŭ������ ����ȯ�� ���� ����
		 * Ŭ�������� ����ȯ�� ���ϰ��迡���� �����ϴ�.
		 * �� ĳ����(���� Ŭ������ ��ü�� ���� Ŭ������ ��ü�� ����Ű�� ��)�� ������ �����ϴ�.
		 * �ٿ� ĳ����(���� Ŭ������ ��ü�� ���� Ŭ������ ��ü�� ��ȯ�ϴ� ��)�� �� ĳ������ �͸� �����ϰ� �ݵ�� ��������� ĳ������ �ؾ� �Ѵ�.
		 */
		
	}

}
