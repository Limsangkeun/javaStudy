package method;

class Method9{
	public void sub(int i) { //int, Integer
		System.out.println("int ...");
	}
	public void sub(Short i) { //short, Short //���� �Ǵ� Ŭ����
		System.out.println("Short ...");
	}
	public void sub(Long i) { //long, Long
		System.out.println("Long ...");
	}

}
public class Overloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method9 m = new Method9();
		byte b =10;
		long c =10;
		short d = 10;

		m.sub(b);  // int. �ڷ����� ũ�ų� ���� �⺻�ڷ��� �� ���� ����� �ڷ��� ȣ��
		m.sub(c);  // Long. ũ�ų� ���� �⺻�ڷ����� ���� ��� �⺻�ڷ����� �����Ǵ� Ŭ����
		m.sub(d);
		//1.�ڱ� �ڷ���
		//2.�⺻ �ڷ��� �߿��� ���� ����� �ڷ���
		//3.
	}

}
