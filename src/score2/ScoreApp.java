package score2;

import java.util.Scanner;

public class ScoreApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch=0;
		Score score = new ScoreImpl();
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		while(true) {
			do {
				System.out.println("1.�Է� 2.��� 3.�̸��˻� 4.�й��˻� 5.���� 6.���� 7.�̸������� ���� 8.�й������� ���� 9.���������� ���� 10.����");
				ch = sc.nextInt();
			}while(ch<1 || ch>10);
			if(ch==10)break;
			switch(ch) {
				case 1:score.input();break;
				case 2:score.print();break;
				case 3:score.searchName();break;
				case 4:score.searchHak();break;
				case 5:score.update();break;
				case 6:score.delete();break;
				case 7:score.sortByName();break;
				case 8:score.sortByHak();break;
				case 9:score.sortByScore();break;
			}
		}
		sc.close();
	}

}
