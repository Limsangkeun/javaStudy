package method;

import java.util.Scanner;

public class Gbb {
	static Scanner sc;
	public static void menu() {
		System.out.println("========����========");
		System.out.println("1.���� 2.���� 3.�� 4.����");
		System.out.println("===================");
		System.out.print("����[1~4] ? ");
	}
	
	public static String convertText(int n) {
		return n==1?"����":n==2?"����":"��";
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
			
			System.out.println("���� : "+u+","+convertText(u));
			System.out.println("���� : "+c+","+convertText(c));
			
			if(u==c){
				System.out.println("�����ϴ�.");
			}else if((u==1&&c==3)||(u==2&&c==1) ||(u==3&&c==2)) {
				System.out.println("���� �� ");
			}else {
				System.out.println("��ǻ�� �� ");
			}
			System.out.println();
		}
		sc.close();
	}

}
