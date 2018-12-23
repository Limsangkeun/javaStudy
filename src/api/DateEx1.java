package api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date);
		//년, 월, 일(권장하지 않음);
		int y = date.getYear()+1900;
		int m = date.getMonth()+1;
		int d = date.getDate();
		
		System.out.println(y+","+m+","+d);
		
		//1970.1.1 0시 0분 0초를 기준으로 밀리초 단위로 환산
		long lo = date.getTime();
		date = new Date(lo);
		Date date2 = new Date(1545011249677L);
		System.out.println(date.after(date2)); //date가 date2 보다 이후의 날짜이냐
		Date date3 = new Date(); //무조건 롱형으로 
		System.out.println(date3);
		System.out.println();
		
		
		//Date => String으로 변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss");
		String time = sdf.format(date);
		System.out.println(time);
		
		//String -> Date;
		
		System.out.println("===========================================");
		String temp = "2000-10-10";
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		//String temp = "2000-a1-10"; //Date로 못바꾸는 형태의 String의 경우 예외 처리해줘야한다.
		
		try{
			//프로그램 실행중 예외가 발생할 수 있는 소스를 작성
			//Date date4 = sdf2.parse(temp);
			//System.out.println(date4);
			
			//2018년 12월 17 ~ 2019년 5월 16 까지 얼마 남았는지 계산하고 싶을때 Date 사용
			Date begin = sdf2.parse("2018-12-17");
			Date end =sdf2.parse("2019-05-16");
			long dif = (end.getTime() - begin.getTime())/(1000*60*60*24);
			System.out.println(dif); //D-day
		}catch(ParseException e) {
			// 프로그램 실행중 예외가 발생할때 실행할 소스를 작성
			e.printStackTrace();	
		}
		System.out.println();
		
		
		
	
	}

}
