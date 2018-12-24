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
				System.out.println("1.입력 2.출력 3.이름검색 4.학번검색 5.수정 6.삭제 7.종료");
				ch = sc.nextInt();
			}while(ch<1 || ch>7);
			if(ch==7)break;
			switch(ch) {
				case 1:score.input();break;
				case 2:score.print();break;
				case 3:score.searchName();break;
				case 4:score.searchHak();break;
				case 5:score.update();break;
				case 6:score.delete();break;
			}
		}
		sc.close();
	}

}
