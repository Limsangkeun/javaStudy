package api;

import java.text.NumberFormat;

public class NumberFormat_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 3.141592;
		String a,b;
		
		NumberFormat nf = NumberFormat.getInstance();
		a = nf.format(d); //지가 알아서 소수점 자리 조정
		System.out.println(a);
		nf.setMaximumFractionDigits(4); //소수점 이하 자리수를 최대 4자리
		nf.setMinimumFractionDigits(2); //소수점 이하 자리숫를 최소 2자리
		a=nf.format(d);
		b=nf.format(123);
		System.out.println(a);
		System.out.println(b);
		
		NumberFormat nf2 = NumberFormat.getInstance();
		a = nf2.format(1234567.8956); //알아서 세자리마다 콤마 찍어줌
		System.out.println(a);
	}

}
