package constructor;

class Test1{
	private int n; //�޸� �Ҵ� �޴´�. 0���� �ʱ�ȭ. �������� ��ü�� ����
	public Test1() { // ������. ����Ÿ���� �������� �ʴ´�.
		//������ ��ü //��ü �����ÿ��� ȣ�Ⱑ�� //�ʱ�ȭ �۾� ����
		//�����ڰ� ������ ���ڰ� ���� �����Ϸ��� ����Ʈ �����ڸ� ��������������� �����ڰ� ������ ����Ʈ �����ڸ� ������ �ʴ´�.
		System.out.println("������.................................................................");
		n = 10;
	}
	
	public void write() {
		System.out.println(n);
	}
}
public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t = new Test1(); //�����ڴ� new ������ ����ϸ�, ��ü�� �����Ҷ� ����Ѵ�.
		t.write();
//		Test1(); //����. //***�����ڴ� new �������� ��� ����
	}

}
