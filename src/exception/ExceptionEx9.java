package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx9 {

	public static void main(String[] args) {
		int a;	
		try(
				Scanner sc = new Scanner(System.in);
				Scanner sc2 = new Scanner(System.in);
		) { //try()안에 객체를 생성하면 jdk7.0이상 부턴 자동으로 닫아준다. 굳이 close() 함수 호출할 필요가 없다
			System.out.print("나이 ? ");
			a=sc.nextInt();
			System.out.println(a>=19?"성인":"미성년자");
		}catch(InputMismatchException e) {
			System.out.println(e.toString());
		}	
	}	
}


