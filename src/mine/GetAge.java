package mine;

import java.util.Calendar;
import java.util.Scanner;

/*
 * ��������� �Է¹޾� ���̸� ����ϱ�
 * ������ �����°�
 */
public class GetAge {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������[yyyyMMdd �Ǵ� yyyy-MM-dd] ? ");
		String str = sc.next();
		str = str.replaceAll("\\-|\\.|/", ""); // \\�� �ǹ�. ���ԽĿ��� ���Ǵ� Ư�����ڵ��� ������ ����ϱ� ���ؼ� ���������� �ٿ�����Ѵ�. 
		
		if(str.length()!=8) {
			System.out.println("��¥ ���� ����");
			System.exit(0); //���α׷� ���̴� �ڵ�;
		}
		int y = Integer.parseInt(str.substring(0,4));
		int m = Integer.parseInt(str.substring(4,6));
		int d = Integer.parseInt(str.substring(6));
		
		Calendar cal = Calendar.getInstance();
		
		int age = cal.get(Calendar.YEAR) - y;
		
		if(cal.get(Calendar.MONTH)+1<m || (m==cal.get(Calendar.MONTH)+1 && d>cal.get(Calendar.DAY_OF_MONTH))) {
			age --;
		}
		System.out.println(age);
		sc.close();
	}

}
