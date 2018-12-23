package mine;

import java.util.Calendar;
import java.util.Scanner;

/*
 * 생년월일을 입력받아 나이를 계산하기
 * 생일이 지났는가
 */
public class GetAge {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("생년월일[yyyyMMdd 또는 yyyy-MM-dd] ? ");
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
		
		int age = cal.get(Calendar.YEAR) - y;
		
		if(cal.get(Calendar.MONTH)+1<m || (m==cal.get(Calendar.MONTH)+1 && d>cal.get(Calendar.DAY_OF_MONTH))) {
			age --;
		}
		System.out.println(age);
		sc.close();
	}

}
