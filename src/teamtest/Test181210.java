package teamtest;

import java.util.Scanner;

public class Test181210 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//1번
		/*System.out.print("년도를 입력하세요 : ");
		int year = sc.nextInt();
		System.out.println("당신 나이 "+(2018-year+1)+"살");*/
		
		
		//2번 문제 
		char min,max;
		min = sc.next().charAt(0);
		max = sc.next().charAt(0);
		
		System.out.println((int)min>(int)max?max:min);
		
		
		//3번 문제
		// TODO Auto-generated method stub
		/*for(int i=1; i<=100; i++) {
			if(i%3==0 || i%5 ==0) {
				System.out.print("*\t");
			}else {
				System.out.print(i+"\t");
			}
			if(i%5==0) {
				System.out.println();
			}
		}*/
		
		//4번 문제
		/*int num;
		int count=0;
		for(int i=0; i<10; i++) {
			num = sc.nextInt();
			if(num>0) {
				count++;
			}
		}
		System.out.println(count);*/
	}
}
