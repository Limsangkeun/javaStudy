package api;

import java.util.Random;

public class Random_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rnd = new Random();
		int n;
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				n = rnd.nextInt(100)+1; //1~100 사이 난수
				System.out.printf("%4d",n);
			}
			System.out.println();
		}
	}

}
