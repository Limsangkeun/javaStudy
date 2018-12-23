package mine;

import java.util.Scanner;

public class Rank_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name[] = new String[5];
		int score[] ={1,1,1,1,1};
		int rank[] = new int[5];
		
		for(int i=0; i<name.length; i++) {
			System.out.println(i+1+"번째 이름 ? ");
			name[i] = sc.next();

			do {
				System.out.println(i+1+"번째 성적 ? ");
				score[i]= sc.nextInt();
			}while(score[i]<0 || score[i]>100);
		}
		for(int i=0; i<name.length-1; i++) {
			for(int j=i+1; j<name.length; j++) {
				if(score[i] > score[j]) {
					rank[j]++;
				}else if(score[i] < score[j]) {
					rank[i]++;
				}
			}
		}	
		for(int i=0; i<name.length; i++) {
			System.out.println(name[i]+"\t"+score[i]+"\t"+rank[i]);
		}
	}
}
