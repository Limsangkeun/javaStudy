package classStudy;

import java.util.Arrays;

class Test2{
	//�ʵ� : �ν��Ͻ����� + Ŭ���� ����
	//�ν��Ͻ� ���� //�ش� �Ǵ� ��ü�� ���� �������� ������ ������ ȸ���� �Ǵ� ��ü�� NULL�� �ɶ�
	int a; //�ʵ�� �ʱ�ȭ ���� ������ ������ ������ 0���� �ʱ�ȭ
	private int b=10; //�����ϸ鼭 �ʱ�ȭ ���� //private ���� ���д�
	
	static int c=10; // Ŭ���� ���� //Ŭ������ �ε��Ǵ� ���� �޸� �Ҵ��� �ѹ��� �޴´�.
	
	//�޼���� �޸� �Ҵ�� ��� ����.
	public void sub1() { //�ν��Ͻ� �޼��� , ��ü�� �����Ǿ�� ��밡��\ 
		int b=0;
		System.out.println(a+":"+b+":"+c);
	}
	public static void sub2() { //Ŭ���� �޼���
		//System.out.println(a); //������ ���� //�ν��Ͻ� ������ ��� �Ұ� //���α׷��� �������� ���� //�����ð� ������� �ʾƵ� ���� ���� //�ϳ� �ۿ� �޸� �Ҵ� ���� �ʴ´�.
		System.out.println("Ŭ���� �޼��� : "+c); //Ŭ���� ������ ȣ�� ����
	}

}
public class SortOfVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 test = new Test2();
		//System.out.println(ob.a); // ������ ����/ ��ü�� �޸𸮸� �Ҵ��ؾ� ��� ����
		System.out.println(Test2.c); // Ŭ���� ������ Ŭ���� �޼ҵ�� �޸� �Ҵ�� ������� Ŭ���� �̸��� �̿��Ͽ� �ٷ� ���� ����
		Test2.sub2();
		//Test2.sub1();������ ���� . �ν��Ͻ� �޼���� ��ü�� ���ؼ��� ���� ���� //�޸� �Ҵ����� ���� ��� ��� �Ұ� ������ test.sub1();
		
		//��ü�� �޸� �Ҵ�
		test = new Test2();
		
		//��ü ����� ���ÿ� �޸� �Ҵ�
		Test2 ob2 = new Test2();
		ob2.a = 10;
		System.out.println("ob.a: "+test.a);
		System.out.println("ob2.a : "+ob2.a);
		//System.out.println(test.b); private �����̹Ƿ� �ܺο��� ��� �Ұ����ϴ�.
		System.out.println(test+":"+ob2);
		//System.out.println(test); //classStudy.Test2@15db9742 //��Ű����.Ŭ������@�ؽ��ڵ� ->�ּҷ� ��ȯ�ؼ� ó��
		Test2.c = 50;
		System.out.println(Test2.c);
		Test2 obj[] = new Test2[3]; //Ŭ���� �迭�� ��� ���� �� �����̰� ���� �߰��� �޸� �Ҵ� �۾��� �ʿ��ϴ�. //== Test2 1, Test2 2, Test2 3 ó�� ������ ����
		for(int i=0; i<obj.length; i++) {
			obj[i] = new Test2();
		}
		System.out.println(obj[0].a); //��Ÿ�� ����. �޸� �Ҵ��� �ȵȻ��� ������Ʈ ���� �߻�
		System.out.println();
	}

}
