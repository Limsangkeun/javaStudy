package api;

import java.util.Random;

public class Random_Quiz {
	public static String toNumber5() {
		Random rand = new Random();
		StringBuffer sb = new StringBuffer();
		int num;
		gogo:
		for(int i=0; i<5; i++) {
			num = rand.nextInt(10);
			for(int j=0; j<i; j++) {
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
		s=toNumber5();
		System.out.println("다섯자리 난수 : "+s);
	}
}
