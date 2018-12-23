package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c=0;
		
		
		do {
			System.out.println("두 수 ? ");
			try {
				a= sc.nextInt();
				b = sc.nextInt();
				c = a+b;
			}catch(InputMismatchException e) {
				System.out.println("정수만 입력하세요.");
			}finally { //주로 리소스를 해제하는 역할에 사용된다.
				//System.out.println("예외 발생 여부와 관련 없이 실행");
			}
		}while(c==0);
		
		
		System.out.println("종료");
		System.out.println("결과 : "+ c);
		System.out.println("종료...");
		sc.close();
	}

}
