package exception;

public class ExceptionEx6 {

	public static void main(String[] args) {
		int a=10, b=0,c;
		
		try {
			c=a/b; //프로그램 비정상적인 종료가 되여 "종료..."는 출력되지 않는다. catch가 없으므로
			System.out.println("결과 : "+c);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눴어");
		}finally { 
			System.out.println("예외가 발생해도, 예외가 없어도 실행된다.");
		}
		//왜 종료가 안찍히는가? 
		System.out.println("종료....");
	}
}


