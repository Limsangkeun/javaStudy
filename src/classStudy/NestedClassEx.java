package classStudy;

class Ex8{
	static int a=10; //Ŭ������ �޸𸮿� �ö���� static�� �ڵ����� �޸� �Ҵ�.
	int b=20; //Test���� ���� �Ұ� //New Ű���带 ������� ������ �޸� �Ҵ��� ���� �ʴ´�.
	
	//Ŭ�������ϸ� : �ܺ�Ŭ������$����Ŭ������.class =>Ex8$Test.class
	public static class Test{ //static ��ø Ŭ���� : �ܺ� Ŭ���� ��ü�� �������� �ʰ� 
							  //�ܺο��� ��ü�� �����Ͽ� ����� �� �ִ�.
		int c = 30;
		public void write() {
			//System.out.println(b); //�ܺ�Ŭ������ �ν��Ͻ� ������ �ν��Ͻ� �޼ҵ� ���� �Ұ� //�޸� �Ҵ��� �Ǿ����� �����Ƿ�
			System.out.println(a+":"+c); //static�� �̹� �޸� �Ҵ��� �Ǿ������Ƿ� ��밡��.
			Ex8 e = new Ex8();
			System.out.println(a+":"+e.b+":"+c);
		}
	}
	
	public void print() {
		//�ܺο��� ���� Ŭ������ �޼��峪 ������ ����Ϸ��� ��ü�� �����ؾ��Ѵ�.
		Test t = new Test();
		System.out.println(t.c);	
	}
}

public class NestedClassEx {
	public static void main(String[] args) {
		Ex8.Test t = new Ex8.Test();
		t.write();
		//Test tt = new Test(); //�Ŀ���
		//static ��ø Ŭ������ �ܺ� Ŭ������ ��ü ������ ������� �ܵ����� ��ü�� �����Ѵ�.
		Ex8 ee = new Ex8();
		ee.print();
		//Ex8.Test tt2 = ee.new Test(); //�Ŀ���.
		
	}
}
