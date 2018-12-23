package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//throws�� ����ó���� �ϴ°��� ���� ����ó�� ����� �ƴϴ�.
class Ex6 {
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public String inputString(String title) throws IOException{ //inputString�� ȣ���� ���� ����ó���� �ؾ��Ѵ�.
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

	public static void main(String[] args) throws IOException { //�̷������� ��� ����ó���ϸ� ������ �������� ���α׷� ���ư���. �¹���
		Ex6 ee = new Ex6();
		String s = ee.inputString("�̸�");
		int n = ee.inputNum("����");
		
		System.out.println(s+","+n);
		
	}	
}


