package api;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("날짜[yyyyMMdd 또는 yyyy-MM-dd] ? ");
		String str = sc.next();
		str = str.replaceAll("\\-|\\.|/", ""); // \\의 의미. 정규식에서 사용되는 특수문자들을 실제로 사용하기 위해서 역슬래쉬를 붙여줘야한다. 
		
		if(str.length()!=8) {
			System.out.println("날짜 형식 오류");
			System.exit(0); //프로그램 죽이는 코드;
		}
		int y = Integer.parseInt(str.substring(0,4));
		int m = Integer.parseInt(str.substring(4,6));
		int d = Integer.parseInt(str.substring(6));
		
		Calendar cal = Calendar.getInstance();
		cal.set(y, m-1, d);
		
		int n;
		//주의 시작
		Calendar calS = (Calendar)cal.clone();  //원본 객체를 살리면서 연산하려면 clone 해야한다.
		n = calS.get(Calendar.DAY_OF_WEEK)-1;  //Calendar.Day_OF_MONTH == Calendar.Date,
		calS.add(Calendar.DATE, -n);
		
		//주의 끝
		Calendar calE = (Calendar)cal.clone();
		n = 7-calE.get(Calendar.DAY_OF_WEEK);
		calE.add(Calendar.DATE, n);
		
		System.out.printf("날짜 : %tF %tT\n",cal,cal);
		System.out.printf("주시작 날짜 : %tF %tT\n",calS,calS);
		System.out.printf("주끝 날짜 : %tF %tT\n",calE,calE);
		
		System.out.println("\n한주...");
		for(int i=0; i<7; i++) {
			if(i!=0)
				calS.add(Calendar.DATE, 1);
			System.out.printf("%tF ",calS);
			
		}

		sc.close();
	}

}
