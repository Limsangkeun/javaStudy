package api;

import java.util.Calendar;

//추상클래스 : 미완 클래스(객체 생성 불가) => 객체 생성 방법 :자식클래스가 있어야함 
//캘린더 클래스 = 추상클래스 => GregorianCalendar 클래스를 통해서 생성
public class CalendarEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calendar now2 = new Calendar(); //컴오류. 추상클래스라 객체 생성 불가 //new 키워드로 생성할 수 없다. 
		Calendar now = Calendar.getInstance();//컴퓨터 시스템의 시간을 가지고 있음 //년월일시분초
		now.set(2018, 11,1);
		String s = String.format("%1$tF %1$tA %1$tT", now); //SYstem.out.printf()는 콘솔에 출력//String.format은 String으로 반환
		//tF 년 //tA 요일 /tT는 시간
		System.out.println(s);
		
		//년도 알아내기
		int y = now.get(Calendar.YEAR);
		int m = now.get(Calendar.MONTH)+1; //월(0~11을 리턴하므로 +1 해야함)
		int d = now.get(Calendar.DATE);
		int dd = now.get(Calendar.DAY_OF_MONTH);//d와 동일한 값 가져오는 방법만 다름
		int w = now.get(Calendar.DAY_OF_WEEK); //요일. (1:일~7:토)
	
		int end=now.getActualMaximum(Calendar.DATE);
		
		System.out.println(y+":"+m+":"+d+":"+w+":"+dd+":"+end);
		

		for(int i=1; i<end+w; i++) {
			if(i<w) {
				System.out.print("   ");
			}else {
				System.out.printf("%3d",i-w+1);
			}
			if(i%7==0) {
				System.out.println();
			}
		}
		
	}

}
