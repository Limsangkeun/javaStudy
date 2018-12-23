package api;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("��¥[yyyyMMdd �Ǵ� yyyy-MM-dd] ? ");
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
		cal.set(y, m-1, d);
		
		int n;
		//���� ����
		Calendar calS = (Calendar)cal.clone();  //���� ��ü�� �츮�鼭 �����Ϸ��� clone �ؾ��Ѵ�.
		n = calS.get(Calendar.DAY_OF_WEEK)-1;  //Calendar.Day_OF_MONTH == Calendar.Date,
		calS.add(Calendar.DATE, -n);
		
		//���� ��
		Calendar calE = (Calendar)cal.clone();
		n = 7-calE.get(Calendar.DAY_OF_WEEK);
		calE.add(Calendar.DATE, n);
		
		System.out.printf("��¥ : %tF %tT\n",cal,cal);
		System.out.printf("�ֽ��� ��¥ : %tF %tT\n",calS,calS);
		System.out.printf("�ֳ� ��¥ : %tF %tT\n",calE,calE);
		
		System.out.println("\n����...");
		for(int i=0; i<7; i++) {
			if(i!=0)
				calS.add(Calendar.DATE, 1);
			System.out.printf("%tF ",calS);
			
		}

		sc.close();
	}

}
