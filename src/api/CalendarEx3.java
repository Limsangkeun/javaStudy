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
		//Calendar cal = Calendar.getInstance();//실행시간에 차이때문에 값이 달라질수 있다. ->clone으로 정확한 복사 요.
		Calendar cal2 = cal; //주소를 넘김
		
		Calendar cal3 = (Calendar)cal.clone(); //참조값을 복사하는게 아니고 메모리 실제 값을 복사한다.//return 타입이 Object 형이므로 형변환해야한다.
		//다운캐스팅을 해야한다.
		
		System.out.println(cal == cal2);  //true
		System.out.println(cal == cal3);  //false 주소가 다름
		System.out.println();
		System.out.printf("%tF %tT\n",cal,cal);
		System.out.printf("%tF %tT\n",cal3,cal3);
		
	
	}

}
