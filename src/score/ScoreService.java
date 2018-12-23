package score;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScoreService extends Score {
	private int count;
	private Scanner sc = new Scanner(System.in);
	
	public void input() {
		System.out.println("입력을 선택하셨습니다. 계속하시겠습니까?(Y/N)");
		char ch = sc.next().charAt(0);
		if(ch!='Y'&& ch!='y') {
			return;
		}
		if(count>=super.getSize()) {
			super.allocation(super.getSize()+10);
		}
		ScoreVo vo = new ScoreVo();
		System.out.print("학번을 입력하세요(숫자) : ");
		try {
			int num = sc.nextInt();
			vo.setId(Integer.toString(num));
		}catch(InputMismatchException e) {
			System.out.println("경고 !! : 숫자만 입력하세요.");
			System.out.print("학번을 입력하세요(숫자) : ");
			int num = sc.nextInt();
			vo.setId(Integer.toString(num));
		}
		System.out.print("이름을 입력하세요 : ");
		vo.setName(sc.next());
		System.out.print("국어 점수를 입력하세요 : ");
		vo.setKor(sc.nextInt());
		System.out.print("영어 점수를 입력하세요 : ");
		vo.setEng(sc.nextInt());
		System.out.print("수학 점수를 입력하세요 : ");
		vo.setMath(sc.nextInt());
		System.out.print("과학 점수를 입력하세요 : ");
		vo.setSci(sc.nextInt());
		
		super.getList()[count++] = vo;
	}
	public void delete() {
		
	}
	public void update() {
		
	}
	public void sort() {
		
	}
	public void searchById() {
		
	}
	public void searchByName() {
		
	}
	public void print() {
		for(int i=0; i<count; i++) {
			System.out.println(super.getList()[i]);
		}
	}
}
