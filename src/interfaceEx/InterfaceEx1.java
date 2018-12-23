package interfaceEx;
//����� ����
//�������̽� ? �߻� Ŭ������ ����, �Լ� ������ ���� //
interface Ex1 {
	//�ڹ� 8���Ͽ����� ���� public
	int sum(int n); //=>public abstract int sum(int n);���� ��ħ 
	public void print(String s);
}

class ExImpl1 implements Ex1 { //����. �߻�Ŭ������ �ƴ� ��쿡�� �������̽��� ��� �޼��带 ������ �ؾ� �Ѵ�.
	@Override
	public int sum(int n) {
		int s=0;
		for(int i=0; i<n; i++) {
			s+=i;
		}
		return s;
	}
	@Override
	public void print(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
	}
	public void write() {
		System.out.println("write...");
	}
}

public class InterfaceEx1 {
	public static void main(String[] args) {
		ExImpl1 ob = new ExImpl1();
		ob.print("test");
		
		Ex1 ex = ob; //��ĳ������ ��� �������̽��� ����� ���� �Լ��� ��밡���ϰ� 
					 //�Լ� ���� �����ǵ� �ڽ� Ŭ������ �Լ��� ����Ѵ�.
		ex.print("�׽�Ʈ");
		//ex.write(); //super class�� �ش� �޼��尡 �������� �����Ƿ� ����� �����ϴ� �����Ϸ��� �˻翡�� �ɸ�.
		
		((ExImpl1)ex).write(); //�ٿ� ĳ�����ϸ� ��� ����
	}
}
