package classStudy;
//Local class�� ���� �� �Ⱦ�
class Ex10{
	static int a=10;
	int b=20;
	public void write() { //TestŬ������ �ܺο��� ���� �׾ ��ü ������ �Ұ����ϴ�. ���� �޼��� �ȿ����� ����
		int c = 30, e=100; //����Ŭ�������� ���������� ���� �ش� ������ final�� �ȴ�.
		final int d =40;
		
		class Test{
			public void print() {
				System.out.println(a+":"+b+":"+d);
				System.out.println(c); //7.0�� ���� 8.0�� ����
			}
		}
		
		e=50;
		//c=100; //�ϸ� ���� ����. final�� ����ǹǷ� �� ������ ���� ����.
		Test t = new Test();
		t.print();
	}
}

public class LocalClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex10 e = new Ex10();
		e.write(); //�� �̻� ������ �� �ִ� ����� ����.
	}

}
