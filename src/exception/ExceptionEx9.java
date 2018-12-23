package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx9 {

	public static void main(String[] args) {
		int a;	
		try(
				Scanner sc = new Scanner(System.in);
				Scanner sc2 = new Scanner(System.in);
		) { //try()�ȿ� ��ü�� �����ϸ� jdk7.0�̻� ���� �ڵ����� �ݾ��ش�. ���� close() �Լ� ȣ���� �ʿ䰡 ����
			System.out.print("���� ? ");
			a=sc.nextInt();
			System.out.println(a>=19?"����":"�̼�����");
		}catch(InputMismatchException e) {
			System.out.println(e.toString());
		}	
	}	
}


