package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//throws로 예외처리를 하는것은 좋은 예외처리 방법이 아니다.
class Ex6 {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public String inputString(String title) throws IOException{ //inputString을 호출한 놈이 예외처리를 해야한다.
		String s = null;
		System.out.print(title+" ? ");
		s=br.readLine();
		return s;
	}
	
	public int inputNum(String title) throws IOException{
		int n;
		System.out.print(title+" ? ");
		n = Integer.parseInt(br.readLine());
		return n;
	}
}

public class ExceptionEx10 {

	public static void main(String[] args) throws IOException { //이런식으로 계속 예외처리하면 문제가 생겼을때 프로그램 돌아가심. 굿바이
		Ex6 ee = new Ex6();
		String s = ee.inputString("이름");
		int n = ee.inputNum("나이");
		
		System.out.println(s+","+n);
		
	}	
}


