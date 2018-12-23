package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*class MyException extends Exception{
	private static final long serialVersionUID = 1L;
	public MyException(String s) {
		super(s);
	}
	
}*/

class Ex9{
	private int num;
	
	public void setNum(int num) throws Exception{ //checked Exception
		if(num<0)
			throw new Exception("0���� ũ�ų� ���ƾ� �մϴ�."); //������ ��� ���ܸ� ���� //���ܸ� ������ �Լ��� ������ �������� �ʰ� �Ѿ
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	public void set(int n) throws Exception{ //�׳� throw �ص� ��� ������ �̷� ������� �ϸ� �߰� ������ �����ϴ�.
		try {
			setNum(n);			
		}catch(Exception e) {
			//System.out.println(e.getMessage());
			throw e;
		}
	}
}

public class ExceptionRealStart3 {
	public static void main(String[] args) {
		//���ܰ� �߻��ϸ� ���� ����ϰ� ���� ������
		Ex9 ee = new Ex9();
		try {
			ee.set(-10);
			System.out.println(ee.getNum());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
