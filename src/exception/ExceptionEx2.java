package exception;

public class ExceptionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=0;
		int c;
		
		c=a/b; //ArithmeticExcepton ���� �߻� : unchecked ����
		//����ó���� ���� �ʾƼ� ���⼭ ���α׷��� �����
		System.out.println("��� : "+c);
		
		System.out.println("���� .... ");
	}

}
