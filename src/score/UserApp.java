package score;

import java.util.Scanner;

public class UserApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ScoreService ss = new ScoreService();
		int n;
		while(true) {
			do {
				System.out.println("1.�Է�   2.����   3.����   4.�̸����� �˻�    5.�й����� �˻�   6.����   7.��� 8.����");
				n = sc.nextInt();
			}while(n<1||n>7);
			if(n==8)break;
			switch(n) {
			case 1: ss.input();break;
			case 2: ss.update();break;
			case 3: ss.delete();break;
			case 4: ss.searchByName();break;
			case 5: ss.searchById();break;
			case 6: ss.sort();break;
			case 7: ss.print();break;
			}
		}
		
	}

}
