package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

class ScoreVO {
	private String name;
	private int score;
	private String birth;

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}

class Score {
	private ScoreVO[] list = new ScoreVO[5];
	private int count;
	private Scanner sc = new Scanner(System.in);

	public void input() {
		if (count >= 5) {
			System.out.println("입력 초과....");
			return;
		}
		System.out.println("자료 입력....");
		
		try {
			ScoreVO vo = new ScoreVO();
			System.out.print("이름 ?");
			vo.setName(sc.nextLine());
			if(vo.getName().length() <2)
				throw new Exception("이름은 두글자 이상입니다.");
			
			vo.setScore(inputScore("점수"));
			
			System.out.print("생년월일 ? ");
			sc.nextLine(); //이런 작업을 통해서 입력되지 않은 엔터를 버려줘야한다.
			vo.setBirth(sc.nextLine());
			if(vo.getBirth().length()!=10)
				throw new Exception("생년월일 형식이 일치 하지 않습니다.");
			
			list[count++] = vo;
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void print() {
		System.out.println("자료 출력....");
		for (int i = 0; i < count; i++) {
			System.out.print(list[i].getName() + "\t");
			System.out.print(list[i].getScore() + "\t");
			System.out.println(list[i].getBirth() + "\t");
		}
	}
	
	public int inputScore(String title) throws Exception{
		int s=0;
		try {			
			System.out.print(title+" ?");
			s=sc.nextInt(); //nextInt나 next는 엔터나 공백이 구분자 nextLine은 이전 next나 nextint에서 쳤던 엔터가 넘어가 들어가게된다.
			if(s<0||s>100)
				throw new Exception("점수는 0~100 사이만 입력 가능합니다.");
		}catch(InputMismatchException e) {
			throw new Exception("숫자만 입력 가능합니다.");
		}
		
		return s;
	}
}

public class ExceptionEx11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score ss = new Score();
		Scanner sc = new Scanner(System.in);
		int ch;

		while (true) {
			do {
				System.out.print("1.입력 2.출력 3.종료 =>");
				ch = sc.nextInt();
			} while (ch < 1 || ch > 3);
			
			if (ch == 3)
				break;
			
			switch(ch) {
				case 1:ss.input();break;
				case 2:ss.print();break;
			}
		}
		sc.close();
	}

}
