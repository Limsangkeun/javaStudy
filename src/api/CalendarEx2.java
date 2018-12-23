package api;
import java.util.Calendar;

public class CalendarEx2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal = Calendar.getInstance(); //시스템의 현재 날짜
		
		//1994년 3월 19일
		cal.set(1994,3-1,19);
		System.out.printf("%tF %tA\n",cal,cal);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		//재민씨가 2018년 10월 10일에 여자친구를 태어나서 처음으로 사귀었다. 100은?
		cal.set(2018, 10-1, 10); 
		cal.add(Calendar.DATE, 100); //내일이 1일이다. 오늘부터 세려면 하루 빼면 된다.
		System.out.printf("%tF %tA\n",cal,cal);
			
		//1994년 3월 19일
		cal.set(2000,10-1,35); //2000.11.4
		System.out.printf("%tF %tA\n",cal,cal);
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		
		//날짜만 10일로 변경
		cal.set(Calendar.DATE, -10);
		System.out.printf("%tF %tA\n",cal,cal);	
	}
}
