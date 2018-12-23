package mine;

import java.util.Scanner;

public class DrawingDiamond {
	//drawing diamond
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size;
		int m;
		do {
			System.out.print("Å©±â ? ");
			size = sc.nextInt();
		}while(size<1 || size>100 || size%2==0);
		
		m = size/2;
		System.out.println(m);
		for(int i=0; i<size; i++) {
			for(int j=0; j<size-m; j++) {
				System.out.print(j>=m?"*" : " ");
			}
			m=i<(size/2)?m-1:m+1;
			System.out.println();
		}
		sc.close();
	}

}
