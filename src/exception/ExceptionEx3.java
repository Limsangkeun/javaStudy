package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b,c=0;
		
		
		do {
			System.out.println("�� �� ? ");
			try {
				a= sc.nextInt();
				b = sc.nextInt();
				c = a+b;
			}catch(InputMismatchException e) {
				System.out.println("������ �Է��ϼ���.");
			}finally { //�ַ� ���ҽ��� �����ϴ� ���ҿ� ���ȴ�.
				//System.out.println("���� �߻� ���ο� ���� ���� ����");
			}
		}while(c==0);
		
		
		System.out.println("����");
		System.out.println("��� : "+ c);
		System.out.println("����...");
		sc.close();
	}

}
