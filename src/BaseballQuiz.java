

import java.util.Random;
import java.util.Scanner;

public class BaseballQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);  // 사람 입력받는다.
		
		String s_ic;  	// 입력변수 스트링으로 받는다.
		// 입력받는다.
		a:while(true) {
			System.out.println("숫자를 6개 입력해라>>");
			s_ic = sc.next();
			// 입력이 중복이면 거른다.
			for(int i=0;i<5;i++) {
				for(int j=i+1;j<6;j++) {
					if( s_ic.charAt(i) == s_ic.charAt(j) ) { continue a;}
					}
			}
			break;
		}
		
		Number6 n1 = new Number6();
		
		// 편의상 변수에 넣어서
		String s_com;
		s_com = n1.strike();
		
		// 문자열 2개를 비교 (0~5)
		int cnt = 0;  // 일치하는 숫자 카운터
		for(int i=0;i<s_ic.length();i++) {
			for(int j=0;j<s_com.length();j++) {
				if(s_ic.charAt(i) == s_com.charAt(j)) {
					cnt++;
					continue;
				}
			}
		}
		
		System.out.println(s_ic);
		System.out.println(s_com);
		
		switch(cnt) {
		case 6: System.out.println("홈런");break;
		case 5: System.out.println("3루타");break;
		case 4: System.out.println("2루타");break;
		case 3: System.out.println("1루타");break;
		default: System.out.println("아웃");
		}
	}
}

// 랜덤숫자 6개 클래스
class Number6{	
	public String strike() {
		Random rnd = new Random();
		StringBuffer sb = new StringBuffer();
		
		int r;
		gogo: 
			for(int i=0;i<6;i++) {  // 숫자6개만들꺼니까 6반복
				r = rnd.nextInt(10);
				for( int k=0; k<sb.length();k++) {
					if(r==Integer.parseInt(sb.substring(k,k+1))) {  // 중복되면
						i--;									    //  다시				
						continue gogo;
				}
			}
			sb.append(r);
		}
		return sb.toString();
	}
}

