package score;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScoreService extends Score {
	private int count;
	private Scanner sc = new Scanner(System.in);
	
	public void input() {
		System.out.println("�Է��� �����ϼ̽��ϴ�. ����Ͻðڽ��ϱ�?(Y/N)");
		char ch = sc.next().charAt(0);
		if(ch!='Y'&& ch!='y') {
			return;
		}
		if(count>=super.getSize()) {
			super.allocation(super.getSize()+10);
		}
		ScoreVo vo = new ScoreVo();
		System.out.print("�й��� �Է��ϼ���(����) : ");
		try {
			int num = sc.nextInt();
			vo.setId(Integer.toString(num));
		}catch(InputMismatchException e) {
			System.out.println("��� !! : ���ڸ� �Է��ϼ���.");
			System.out.print("�й��� �Է��ϼ���(����) : ");
			int num = sc.nextInt();
			vo.setId(Integer.toString(num));
		}
		System.out.print("�̸��� �Է��ϼ��� : ");
		vo.setName(sc.next());
		System.out.print("���� ������ �Է��ϼ��� : ");
		vo.setKor(sc.nextInt());
		System.out.print("���� ������ �Է��ϼ��� : ");
		vo.setEng(sc.nextInt());
		System.out.print("���� ������ �Է��ϼ��� : ");
		vo.setMath(sc.nextInt());
		System.out.print("���� ������ �Է��ϼ��� : ");
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
