package exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionEx5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c;
		try {
			System.out.print("첫번째 수 ? ");
			String s = br.readLine();
			a = Integer.parseInt(s);
			System.out.print("두번째 수 ? ");
			b = Integer.parseInt(br.readLine());
			c = a + b;
			System.out.println("결과 : " + c);
		} catch (Exception e3) { // 모든 예외를 다 catch 할수 있다.
									// 모든 예외의 최상위이므로 여러 예외를 catch 할경우 가장 아래에 놓거라
									// 왜냐면 모든 에러를 다잡기 때문에 어떤 상황인지 구분하기가 힘들다.
			System.out.println(e3.getMessage());
		}
		System.out.println("종료....");

	}

}