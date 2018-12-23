package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
		
		try {
			System.out.print("나이 ? ");
			a=sc.nextInt();
			System.out.println(a>=19?"성인":"미성년자");
		}catch(InputMismatchException e) {
			System.out.println(e.toString());
		} finally {
			if(sc!=null) {
				sc.close();
			}
		}
	}
}


