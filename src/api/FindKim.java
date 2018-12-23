package api;

import java.util.Scanner;

public class FindKim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;

		Scanner sc = new Scanner(System.in);
		String str;
		
		while(true) {
			System.out.print("¿Ã∏ß?");
			str=sc.next();
			if(str.equals("end"))break;
			if(str.equals("count")) {
				System.out.println(count);
			}
			if(str.startsWith("±Ë"))count++;
			//if(str.indexof("±Ë")==0) count++;
			//if(str.charAt(0)=='±Ë') count++;
		}
		
	}

}
