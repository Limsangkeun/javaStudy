package api;

import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str; 
		
		//������ �Է� �޾� ���� ����� ����ϴ� ���α׷�
		
		System.out.print("����[10+7] ? ");
		str = sc.nextLine(); //��ȣ�� ���� ��쿡�� �Ұ�
		String arr[] = new String[2];
		arr = str.split("\\+");
		String op = str.replaceAll("\\d", "");
		for(String s : arr) {
			System.out.println(s);
		}
		switch(op){
			
		}
	/*	
		for(String temp : arr) {
			System.out.println(temp);
		}
		int left=0,right=0;
		for(String op : new String[] {"+","-","*","/"}) {
			int pos = str.indexOf(op);
			if(pos>0) {
				System.out.println(pos);
				System.out.println(str.charAt(pos));
				left=Integer.parseInt(str.substring(0,pos));
				right=Integer.parseInt(str.substring(pos+1));
				int result=0;
				switch(op) {
				case "+":
					result = left+right;
					break;
				case "-":
					result = left-right;
					break;
				case "*":
					result = left*right;
					break;
				case "/":
					result = left/right;
					break;
				}
				System.out.println();
			}
		}
		*/
		
		
		
		
		sc.close();
	}

}
