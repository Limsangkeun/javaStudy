package exception;

public class ExceptionEx6 {

	public static void main(String[] args) {
		int a=10, b=0,c;
		
		try {
			c=a/b; //���α׷� ���������� ���ᰡ �ǿ� "����..."�� ��µ��� �ʴ´�. catch�� �����Ƿ�
			System.out.println("��� : "+c);
		}catch(ArithmeticException e) {
			System.out.println("0���� ������");
		}finally { 
			System.out.println("���ܰ� �߻��ص�, ���ܰ� ��� ����ȴ�.");
		}
		//�� ���ᰡ �������°�? 
		System.out.println("����....");
	}
}


