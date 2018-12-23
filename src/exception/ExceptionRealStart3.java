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
			throw new Exception("0보다 크거나 같아야 합니다."); //음수인 경우 예외를 던짐 //예외를 던지면 함수를 끝까지 실행하지 않고 넘어감
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
	
	public void set(int n) throws Exception{ //그냥 throw 해도 상관 없지만 이런 방식으로 하면 추가 가공이 가능하다.
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
		//예외가 발생하면 값을 출력하고 싶지 않을때
		Ex9 ee = new Ex9();
		try {
			ee.set(-10);
			System.out.println(ee.getNum());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
