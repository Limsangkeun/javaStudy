package interfaceEx;

import java.text.NumberFormat;
import java.text.ParseException;

interface Ex7{
	public void print();
	
}

class Test7 implements Ex7{
	public void method() { //�ӽ÷� �ٸ� Ŭ���� �������̽��� �Լ��� ������ �̿��ϰ� ������ //�� Ŭ������ �ʿ��ѵ� ���� ������ �ʿ�� �������
		//�͸� Ŭ������ ����Ͽ� ��� �ذ��Ѵ�. anonymous class
		//�͸�Ŭ����
		Ex7 ob = new Ex7() { //Ŭ������ : Test7$1.class $�� : �ܺ�Ŭ���� $�� ����Ŭ���� �̸��� �����ʾѱ⶧���� ���ڷ� �����Ѵ�.	
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("���...");
			}
		};
		ob.print();
		
		//��� 2
		/*new Ex7() { 			
			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("���...");
			}
		}.print();;
		*/
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Sangkeun");
	}
}
public class InterfaceEx7 implements Test{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1,23.4/6,57,89";
		NumberFormat nf = NumberFormat.getInstance();
		try {
			Number a = nf.parse(s);
			System.out.println(a);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Test7 t = new Test7();
		t.method();
		t.print();
		Ex7 ex = t;
		ex.print();
	}

}
