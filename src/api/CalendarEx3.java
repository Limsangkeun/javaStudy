package api;

import java.util.Calendar;

/*
 * 
 * 
 */

public class CalendarEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance();
		//Calendar cal = Calendar.getInstance();//����ð��� ���̶����� ���� �޶����� �ִ�. ->clone���� ��Ȯ�� ���� ��.
		Calendar cal2 = cal; //�ּҸ� �ѱ�
		
		Calendar cal3 = (Calendar)cal.clone(); //�������� �����ϴ°� �ƴϰ� �޸� ���� ���� �����Ѵ�.//return Ÿ���� Object ���̹Ƿ� ����ȯ�ؾ��Ѵ�.
		//�ٿ�ĳ������ �ؾ��Ѵ�.
		
		System.out.println(cal == cal2);  //true
		System.out.println(cal == cal3);  //false �ּҰ� �ٸ�
		System.out.println();
		System.out.printf("%tF %tT\n",cal,cal);
		System.out.printf("%tF %tT\n",cal3,cal3);
		
	
	}

}
