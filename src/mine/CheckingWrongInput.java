package mine;

import java.util.Scanner;

public class CheckingWrongInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double num;
		double sum=0;
		for(int i=0; i<5; i++) {
			num = sc.nextDouble();
			if(num<0) {
				continue;
			}
			sum += num;
		}
		System.out.printf("%.3f",sum);
		sc.close();
	}

}
