package api;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Big_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger b1 = new BigInteger("123456789123456789123456789123456789"); 
		BigInteger b2 = new BigInteger("123456789123456789123456789123456789");
		
		BigInteger b3 = b1.add(b2); //두 변수 덧셈
		b3 = b1.multiply(b1.multiply(b1.multiply(b1.multiply(b2))));
		System.out.println(b3);
		
		BigDecimal d1 = new BigDecimal("123456789.123456789");
		BigDecimal d2 = d1.movePointLeft(3); //소수점을 왼쪽으로 3칸 이동
		BigDecimal d3 = d1.movePointRight(3); //소수점을 오른쪽으로 3칸 이동
		System.out.println(d2);
		System.out.println(d3);
		BigDecimal d4 = d1.divide(d2, BigDecimal.ROUND_DOWN); //반올림 안함
		BigDecimal d5 = d1.divide(d2,5, BigDecimal.ROUND_DOWN); //유효자리수 5자리
		System.out.println(d4);
		System.out.println(d5);
	}

}
