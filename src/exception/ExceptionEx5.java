package exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionEx5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c;
		try {
			System.out.print("ù��° �� ? ");
			String s = br.readLine();
			a = Integer.parseInt(s);
			System.out.print("�ι�° �� ? ");
			b = Integer.parseInt(br.readLine());
			c = a + b;
			System.out.println("��� : " + c);
		} catch (Exception e3) { // ��� ���ܸ� �� catch �Ҽ� �ִ�.
									// ��� ������ �ֻ����̹Ƿ� ���� ���ܸ� catch �Ұ�� ���� �Ʒ��� ���Ŷ�
									// �ֳĸ� ��� ������ ����� ������ � ��Ȳ���� �����ϱⰡ �����.
			System.out.println(e3.getMessage());
		}
		System.out.println("����....");

	}

}