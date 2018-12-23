package api;

import java.util.Scanner;

import java.util.Scanner;

public class StringReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String line = sc.next();
		//-2*5+3\
		String arr[] = new String[line.length()];
		StringBuffer sb = new StringBuffer();
		for(String s : new String[] {"+","-","*","/"}) {
			String c = line.substring(0, line.indexOf("+"));
			System.out.println(c);
		}
		
		for(String a : arr) {
			System.out.println(a);
		}
		
		
		
		
	}

}
