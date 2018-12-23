package exception;

public class ExceptionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=0;
		int c = 0;
		
		try {
			c=a/b;
		} //ArithmeticExcepton 예외 발생 : unchecked 예외
		catch(ArithmeticException e) { //예외는 정확한 타입으로 하는 것이 좋음
			System.out.println("0으로 나눌수 없습니다.");
		}finally {
			System.out.println("결과 : "+c);
		}
		//예외처리를 하지 않아서 여기서 프로그램은 종료됨
		
		
		System.out.println("종료 .... ");
	}

}
