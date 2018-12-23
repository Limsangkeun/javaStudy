package api;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormat_Ex2 {

	public static void main(String[] args) {
		try {
			NumberFormat nf = NumberFormat.getInstance();
			String s1 = "1000";
			String s2 = "1000.12";
			String s3 = "1,000";
			
			// Number : father class of Wrapper class(ex. Integer, Double, Long)
			Number n1 = nf.parse(s1);
			Number n2 = nf.parse(s2);
			Number n3 = nf.parse(s3);
			
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
			
			double d = (Double)n2;
			System.out.println(d);
			
			s1="1,234";
			s2="2,112";
			Integer i0 = (Integer)nf.parse(s1);
			System.out.println("this is i0 : "+i0);
			Long i1 = (Long)nf.parse(s1);
			Long i2 = (Long)nf.parse(s2);
			System.out.println(i1+i2);
			
			NumberFormat nf2 = NumberFormat.getCurrencyInstance(); //현재 컴퓨터 시스템에 설정된 국가 설정을 사용한다. 한국으로 설정되어 있어 원화 기호가 나옴
			s1 = nf2.format(12345);
			System.out.println(s1);
			NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.US);
			s1 = nf3.format(12345);
			System.out.println(s1);
			
			//
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.toString());
		}
	}

}
