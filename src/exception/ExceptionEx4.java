package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� �ѹ��� 1����Ʈ���� �޾� �ü� �ִ�. ex)��==2byte �̹Ƿ� 2���� ���� ���۵ȴ�.
		// InputStream(�Է��� �⺻) : System.in
		// 1����Ʈ�� �޾Ƽ� ���ڷ� �ٲ���Ѵ�. �� ������ ���ִ� ���� inputstreamreader : byte ��Ʈ��(inputStream)��
		// ���� ��Ʈ���� ��ȯ
		// BufferedReader : ���� ��Ʈ��. (���ڿ� �Է� ����� �������ִ� Ŭ����)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a, b, c;

		try {
			System.out.print("ù��° �� ? ");
			// br.readLine()�� ���پ� �о���� ����ĥ ������ ���ڿ� �Է¸� ����
			String s = br.readLine();// ����ó�� ���� ������ ������ ���� �߻� checked ���ܰ� �߻�
			a = Integer.parseInt(s);
			System.out.print("�ι�° �� ? ");
			b = Integer.parseInt(br.readLine());
			c = a + b;
			System.out.println("��� : " + c);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e2) {
			System.out.println("������ �Է��ϼ���.");
		}
		System.out.println("����....");

	}

}
