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
			System.out.println("�Է� �ʰ�....");
			return;
		}
		System.out.println("�ڷ� �Է�....");
		
		try {
			ScoreVO vo = new ScoreVO();
			System.out.print("�̸� ?");
			vo.setName(sc.nextLine());
			if(vo.getName().length() <2)
				throw new Exception("�̸��� �α��� �̻��Դϴ�.");
			
			vo.setScore(inputScore("����"));
			
			System.out.print("������� ? ");
			sc.nextLine(); //�̷� �۾��� ���ؼ� �Էµ��� ���� ���͸� ��������Ѵ�.
			vo.setBirth(sc.nextLine());
			if(vo.getBirth().length()!=10)
				throw new Exception("������� ������ ��ġ ���� �ʽ��ϴ�.");
			
			list[count++] = vo;
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void print() {
		System.out.println("�ڷ� ���....");
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
			s=sc.nextInt(); //nextInt�� next�� ���ͳ� ������ ������ nextLine�� ���� next�� nextint���� �ƴ� ���Ͱ� �Ѿ ���Եȴ�.
			if(s<0||s>100)
				throw new Exception("������ 0~100 ���̸� �Է� �����մϴ�.");
		}catch(InputMismatchException e) {
			throw new Exception("���ڸ� �Է� �����մϴ�.");
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
				System.out.print("1.�Է� 2.��� 3.���� =>");
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
