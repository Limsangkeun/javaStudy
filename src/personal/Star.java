package personal;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int mid = num/2;
		for(int i=1; i<=num; i++) {
			for(int j=0; j<num-mid; j++) {
			//	System.out.print(j>=m?"*":" ");
			}
		}
	}

}
