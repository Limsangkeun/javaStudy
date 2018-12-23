package personal;


import java.util.Scanner;

public class ScoreService extends Score{
	private Scanner sc = new Scanner(System.in);
	private int count;
	
	public void input() {
		ScoreVO vo = new ScoreVO();
		if(count>=super.getSize()) super.allocation(super.getSize()+10);
		System.out.print("�й�?");
		vo.setHak(sc.next());
		System.out.print("�̸�?");
		vo.setName(sc.next());
		System.out.print("����?");
		vo.setKor(sc.nextInt());
		System.out.print("����?");
		vo.setEng(sc.nextInt());
		System.out.print("����?");
		vo.setMath(sc.nextInt());
		super.getList()[count++] = vo;
		System.out.println("�����͸� �߰��߽��ϴ�.");
	}
	
	public void print() {
		for(int i=0; i<count; i++) {
			System.out.println(super.getList()[i]);
		}
	}
	public void searchHak() {
		System.out.println("\t�й� �˻�....");
		System.out.print("�˻��� �й�?");
		String hak = sc.next();
		ScoreVO vo = readScore(hak);
		if(vo==null) {
			System.out.println("��ϵ� �ڷᰡ �����ϴ�.");
			return;
		}
		System.out.println(vo+"\n");
	}
	
	public void searchName() {
		System.out.print("�̸� �Է�?");
		String name = sc.next();
		for(int i=0; i<count; i++) {
			//if(super.getList()[i].getName().indexOf(name)>=0) { //�̷����ϸ� �߰��̳� ���� ���� �˻��ؼ� ���
			if(super.getList()[i].getName().startsWith(name)) {
				System.out.println(super.getList()[i]);
			}	
		}
	}
	
	public void update() {
		System.out.println("\t������ ����...");
		System.out.print("������ �й�?");
		String hak = sc.next();
		ScoreVO vo = readScore(hak);
		if(vo==null) {
			System.out.println("��ϵ� �ڷᰡ �����ϴ�.");
			return;
		}
		for(int i=0; i<count; i++) {
			if(super.getList()[i] == vo) {
				System.out.print("�̸�?");
				vo.setName(sc.next());
				System.out.print("����?");
				vo.setKor(sc.nextInt());
				System.out.print("����?");
				vo.setEng(sc.nextInt());
				System.out.print("����?");
				vo.setMath(sc.nextInt());
			}
		}
		System.out.println("�����͸� �����߽��ϴ�.");
	}
	public void delete() {
		System.out.println("\t������ ����...");
		System.out.print("������ �й�?");
		String hak = sc.next();
		int idx = index(hak);
		if(idx==-1) {
			System.out.println("�����Ͱ� �������� �ʽ��ϴ�.");
			return;
		}
		System.out.println("�����Ͻðڽ��ϱ�?[Y/N]");
		char ch = sc.next().charAt(0);
		if(ch=='Y' || ch=='y') {
					for(int j=idx+1; j<count; j++) {
						super.getList()[j-1] = super.getList()[j];
					}
					super.getList()[count-1] = null;
					count--;
					System.out.println("�����͸� �����߽��ϴ�.");
		}
	}
	
	private ScoreVO readScore(String Hak) {
		ScoreVO vo = null;
		for(int i=0; i<count; i++) {
			if(super.getList()[i].getHak().equals(Hak)) {
				vo = super.getList()[i];
			}	
		}
		return vo;
	}
	
	private int index(String hak) {
		int idx=-1;
			for(int i=0; i<count; i++) {
				if(super.getList()[i].getHak().equals(hak)) {
					idx = i;
					break;
				}
			}
		return idx;
	}
}
