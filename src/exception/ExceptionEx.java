package exception;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=0;
		int c = 0;
		
		try {
			c=a/b;
		} //ArithmeticExcepton ���� �߻� : unchecked ����
		catch(ArithmeticException e) { //���ܴ� ��Ȯ�� Ÿ������ �ϴ� ���� ����
			System.out.println("0���� ������ �����ϴ�.");
		}finally {
			System.out.println("��� : "+c);
		}
		//����ó���� ���� �ʾƼ� ���⼭ ���α׷��� �����
		
		
		System.out.println("���� .... ");
	}

}
