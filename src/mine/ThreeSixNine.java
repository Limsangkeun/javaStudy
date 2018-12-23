package mine;

import java.util.Scanner;

public class ThreeSixNine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		
		for(int i=1; i<=100; i++) {
			s = Integer.toString(i).replaceAll("3|6|9", "*");
			if(s.indexOf("*") != -1) {
				s = s.replaceAll("\\d","");
			}
			System.out.print(s+"\t");
			if(i%10==0) {
				System.out.println();
			}
		}
	}

}
