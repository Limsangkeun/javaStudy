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
		System.out.print("연산자 ? ");
		c = sc.next().charAt(0);
		// 예외 던지기(예외를 강제로 발생 시킴)
		if (c != '+' && c != '-' && c != '/' && c != '*')
			throw new Exception("연산자 입력 오류 입니다. 연산자를 정확히 입력 하세요.");
		return c;
	}

	public int inputNum() throws Exception {
		int n = 0;
		System.out.println("숫자 ? ");
		try {
			n = sc.nextInt();
			if (n < 0)
				throw new Exception("0 이상을 입력하세요");
		} catch (InputMismatchException e) {
			throw new Exception("숫자만 입력 해라 ....");
		}
		return n;
	}

	public String calculate() {
		String s = "예외 때문에 계산을 수행하지 못하였습니다.";
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
		return "결과 : "+s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExceptionRealStart2 rs = new ExceptionRealStart2();
		System.out.println(rs.calculate());
	}
}
