package personal;

import java.io.File;
import java.util.Scanner;

public class hancom {
	public static void main(String[] args) {
		File fp = new File("input.txt");
		
		Scanner sc = new Scanner(System.in);
		String line[] = new String[3];
		line[0] = "수업 너무 재밌다.";
		line[1] = "수업 너무 졸리다.";
		line[2] = "수업 너무 힘들다.";
		String text = " ";
		int score=100;
		for(String s : line) {
			System.out.println(s);
			while(!text.equals(s))
			{
				text = sc.nextLine();
				if(score <5) {
					score -= 5;
					System.out.println("5점 감점");
				}
			}
			System.out.println("통과");
		}
		System.out.println(score);
	}
}
