package api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		//��, ��, ��(�������� ����);
		int y = date.getYear()+1900;
		int m = date.getMonth()+1;
		int d = date.getDate();
		
		System.out.println(y+","+m+","+d);
		
		//1970.1.1 0�� 0�� 0�ʸ� �������� �и��� ������ ȯ��
		long lo = date.getTime();
		date = new Date(lo);
		Date date2 = new Date(1545011249677L);
		System.out.println(date.after(date2)); //date�� date2 ���� ������ ��¥�̳�
		Date date3 = new Date(); //������ �������� 
		System.out.println(date3);
		System.out.println();
		
		
		//Date => String���� ��ȯ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh:mm:ss");
		String time = sdf.format(date);
		System.out.println(time);
		
		//String -> Date;
		
		System.out.println("===========================================");
		String temp = "2000-10-10";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		//String temp = "2000-a1-10"; //Date�� ���ٲٴ� ������ String�� ��� ���� ó��������Ѵ�.
		
		try{
			//���α׷� ������ ���ܰ� �߻��� �� �ִ� �ҽ��� �ۼ�
			//Date date4 = sdf2.parse(temp);
			//System.out.println(date4);
			
			//2018�� 12�� 17 ~ 2019�� 5�� 16 ���� �� ���Ҵ��� ����ϰ� ������ Date ���
			Date begin = sdf2.parse("2018-12-17");
			Date end =sdf2.parse("2019-05-16");
			long dif = (end.getTime() - begin.getTime())/(1000*60*60*24);
			System.out.println(dif); //D-day
		}catch(ParseException e) {
			// ���α׷� ������ ���ܰ� �߻��Ҷ� ������ �ҽ��� �ۼ�
			e.printStackTrace();	
		}
		System.out.println();
		
		
		
	
	}

}
