package mine;

import java.util.Scanner;

public class CloseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int num,min=0;
		for(int i=0; i<5; i++) {
			num = sc.nextInt();
			while(num==7) {
				System.out.println("다시 입력하세요");
				num = sc.nextInt();
			}
			if(i==0) {
				min = num;
			}
			if(Math.abs(7-num) < Math.abs(7-min)) {
				min = num;
			}
			System.out.print(num+",");
		}
		System.out.println(min);
		sc.close();
	}

}
