package classStudy;

class Ex9 {
	static int a = 10;
	int b = 20;

	// ���� Ŭ����(member class)
	// �ܺο��� static ��øŬ����ó�� �ܵ����� ��ü ������ �Ұ����ϴ�.
	// �ܺ�Ŭ������ ��ü�� ���� �����ϰ� ������ ��ü�� �̿��Ͽ� ��ü ������ �����ϴ�.
	// �ۿ��� ����ϱ� ���� ������ �ƴ� //�ܺο��� �������� ���ϹǷ� ���ȿ� ����(private)�� ���
	// ���� Ŭ������ ��� ���������ڰ� �����ϴ�. �ܺδ� �Ⱥ��̰ų� public�� ����
	public class Test { // Ŭ������ �ʿ��ѵ� �ۿ� �ִ� ��� private ������ �����ϱ� �����Ƿ� ���ο� �ۼ��Ͽ� ���
		int c = 30;
		public void write() {
			System.out.println(a + ":" + b + ":" + c);
			// �� b�� ����� �� �ִ°�? Test ��ü ������ ���ؼ� Ex9 ��ü�� �����ؾ��ϱ� ������
		}
	}

	private class Test2 { // Ŭ������ �ʿ��ѵ� �ۿ� �ִ� ��� private ������ �����ϱ� �����Ƿ� ���ο� �ۼ��Ͽ� ���
		int c = 30;
		public void write() {
			System.out.println(a + ":" + b + ":" + c);
			// �� b�� ����� �� �ִ°�? Test ��ü ������ ���ؼ� Ex9 ��ü�� �����ؾ��ϱ� ������
		}
	}

	public void method() {
		Test ob = new Test();
		System.out.println(ob.c);
	}
}

public class InnerClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex9 ee = new Ex9();
		ee.new Test().write();

		// ee.new Test2().write();//private�̹Ƿ� �ܺο��� ������ �Ұ����ϴ� ������ ����

		// Ex9.Test ee = new Ex9.Test(); //�Ŀ��� �ܺΰ�ü�� �켱 �����Ǿ�� ���� ������ ������ �����ϴ�.
		// �Ŀ��� �ܵ� ��ü �� �� �� ����
		// Test t = new Ex9().new Test(); //�̷������� �����Ҽ� ����.
		Ex9.Test t = new Ex9().new Test(); // �̰͵� �߾Ⱦ��� ��� TestŬ���� ��ü�� �ܺο��� �� �Ⱦ���.
		t.write();
	}

}
