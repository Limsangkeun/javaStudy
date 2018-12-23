package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/*class MyException extends Exception{
	private static final long serialVersionUID = 1L;
	public MyException(String s) {
		super(s);
	}
	
}*/

public class ExceptionRealStart2 {
	// private BufferedReader br = new BufferedReader(new
	// InputStreamReader(System.in));
	private Scanner sc = new Scanner(System.in);

	public char inputOper() throws Exception {
		char c;
		System.out.print("������ ? ");
		c = sc.next().charAt(0);
		// ���� ������(���ܸ� ������ �߻� ��Ŵ)
		if (c != '+' && c != '-' && c != '/' && c != '*')
			throw new Exception("������ �Է� ���� �Դϴ�. �����ڸ� ��Ȯ�� �Է� �ϼ���.");
		return c;
	}

	public int inputNum() throws Exception {
		int n = 0;
		System.out.println("���� ? ");
		try {
			n = sc.nextInt();
			if (n < 0)
				throw new Exception("0 �̻��� �Է��ϼ���");
		} catch (InputMismatchException e) {
			throw new Exception("���ڸ� �Է� �ض� ....");
		}
		return n;
	}

	public String calculate() {
		String s = "���� ������ ����� �������� ���Ͽ����ϴ�.";
		int a, b;
		char op;

		try {
			a = inputNum();
			op = inputOper();
			b = inputNum();

			if (op == '+')
				s = String.format("%d + %d = %d", a, b, a + b);
			else if (op == '-')
				s = String.format("%d - %d = %d", a, b, a - b);
			else if (op == '*')
				s = String.format("%d * %d = %d", a, b, a * b);
			else if (op == '/')
				s = String.format("%d / %d = %d", a, b, a / b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		return "��� : "+s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionRealStart2 rs = new ExceptionRealStart2();
		System.out.println(rs.calculate());
	}
}
