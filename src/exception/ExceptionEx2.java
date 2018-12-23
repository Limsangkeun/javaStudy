package exception;

public class ExceptionEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=0;
		int c;
		
		c=a/b; //ArithmeticExcepton 예외 발생 : unchecked 예외
		//예외처리를 하지 않아서 여기서 프로그램은 종료됨
		System.out.println("결과 : "+c);
		
		System.out.println("종료 .... ");
	}

}
