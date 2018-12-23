package api;

import java.util.Random;

public class DifferentRandomNumber {
	public static String toNumber3() {
		Random rand = new Random();
		StringBuffer sb = new StringBuffer();
		int num;
		gogo:
		for(int i=0; i<3; i++) {
			num = rand.nextInt(10);
			for(int j=0; j<i; j++) { //i 대신 sb.length()를 넣어도 상관없음.
				if(num==Integer.parseInt(sb.substring(j,j+1))) {
					i--;
					continue gogo;
				}
			}
			sb.append(Integer.toString(num));
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		s = toNumber3();
		System.out.println(s);
	}

}
