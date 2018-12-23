package method;

import java.util.Scanner;

public class Gbb {
	static Scanner sc;
	public static void menu() {
		System.out.println("========선택========");
		System.out.println("1.가위 2.바위 3.보 4.종료");
		System.out.println("===================");
		System.out.print("선택[1~4] ? ");
	}
	
	public static String convertText(int n) {
		return n==1?"가위":n==2?"바위":"보";
	}
	
	public static int computer() {
		return (int)(Math.random()*3)+1;
	}
	public static int user() {
		
		int a;
		
		do {
			menu();
			a=sc.nextInt();
		}while(a<1||a>4);
		
		return a;
	}
	
	public static void main(String[] args) {
		int u,c;
		sc = new Scanner(System.in);
		while(true) {
			u = user();
			if(u==4)break;
			c = computer();
			
			System.out.println("유저 : "+u+","+convertText(u));
			System.out.println("컴터 : "+c+","+convertText(c));
			
			if(u==c){
				System.out.println("비겼습니다.");
			}else if((u==1&&c==3)||(u==2&&c==1) ||(u==3&&c==2)) {
				System.out.println("유저 승 ");
			}else {
				System.out.println("컴퓨터 승 ");
			}
			System.out.println();
		}
		sc.close();
	}

}
