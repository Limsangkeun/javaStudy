package mine;

import java.util.Scanner;

public class NearNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("5개의 숫자를 입력하세요...");
		int min=0;
		int num;
		int result=0;
		int diff =0;
		for(int i=0; i<5; i++) {
			
			num = sc.nextInt();
			if(num==7) {
				i--;
				continue;
			}
			if(num>7) {
				diff = num-7;
			}else {
				diff = 7-num;
			}
			if(i==0) {
				min = diff;
				result = num;
			}else if(min > diff) {
				min = num;
				result = num;
			}
			System.out.print(num);
		}
		System.out.println(result);
		sc.close();
	}

}
