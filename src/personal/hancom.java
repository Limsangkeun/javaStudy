package personal;

import java.io.File;
import java.util.Scanner;

public class hancom {
	public static void main(String[] args) {
		File fp = new File("input.txt");
		
		Scanner sc = new Scanner(System.in);
		String line[] = new String[3];
		line[0] = "���� �ʹ� ��մ�.";
		line[1] = "���� �ʹ� ������.";
		line[2] = "���� �ʹ� �����.";
		String text = " ";
		int score=100;
		for(String s : line) {
			System.out.println(s);
			while(!text.equals(s))
			{
				text = sc.nextLine();
				if(score <5) {
					score -= 5;
					System.out.println("5�� ����");
				}
			}
			System.out.println("���");
		}
		System.out.println(score);
	}
}
