package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 원래 한번에 1바이트씩만 받아 올수 있다. ex)대==2byte 이므로 2차례 걸쳐 전송된다.
		// InputStream(입력의 기본) : System.in
		// 1바이트씩 받아서 문자로 바꿔야한다. 그 역할을 해주는 것이 inputstreamreader : byte 스트림(inputStream)을
		// 문자 스트림을 변환
		// BufferedReader : 필터 스트림. (문자열 입력 기능을 제공해주는 클래스)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c;

		try {
			System.out.print("첫번째 수 ? ");
			// br.readLine()은 한줄씩 읽어들임 엔터칠 때까지 문자열 입력만 가능
			String s = br.readLine();// 예외처리 하지 않으면 컴파일 오류 발생 checked 예외가 발생
			a = Integer.parseInt(s);
			System.out.print("두번째 수 ? ");
			b = Integer.parseInt(br.readLine());
			c = a + b;
			System.out.println("결과 : " + c);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e2) {
			System.out.println("정수를 입력하세요.");
		}
		System.out.println("종료....");

	}

}
