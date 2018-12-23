package api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String str = "2010-10-10";
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date = sdf.parse(str);
			
			//Date => Calendar
			Calendar cal = Calendar.getInstance();
			cal.setTime(date);
			
			System.out.printf("%tF %tT\n",cal,cal);
			
			//Calendar => Date
			Date date2 = cal.getTime();
			System.out.println(date2);
			
			long a = date.getTime();
			long b = cal.getTimeInMillis();
			System.out.println(a+":"+b);
			
		}catch(Exception e) {//Excepiton : 모든 예외를 처리 //사용하면 모든 예외를 다잡아서 어떤 에러인지 모른다.
			
			
		}
	}

}
