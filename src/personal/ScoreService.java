package personal;


import java.util.Scanner;

public class ScoreService extends Score{
	private Scanner sc = new Scanner(System.in);
	private int count;
	
	public void input() {
		ScoreVO vo = new ScoreVO();
		if(count>=super.getSize()) super.allocation(super.getSize()+10);
		System.out.print("학번?");
		vo.setHak(sc.next());
		System.out.print("이름?");
		vo.setName(sc.next());
		System.out.print("국어?");
		vo.setKor(sc.nextInt());
		System.out.print("영어?");
		vo.setEng(sc.nextInt());
		System.out.print("수학?");
		vo.setMath(sc.nextInt());
		super.getList()[count++] = vo;
		System.out.println("데이터를 추가했습니다.");
	}
	
	public void print() {
		for(int i=0; i<count; i++) {
			System.out.println(super.getList()[i]);
		}
	}
	public void searchHak() {
		System.out.println("\t학번 검색....");
		System.out.print("검색할 학번?");
		String hak = sc.next();
		ScoreVO vo = readScore(hak);
		if(vo==null) {
			System.out.println("등록된 자료가 없습니다.");
			return;
		}
		System.out.println(vo+"\n");
	}
	
	public void searchName() {
		System.out.print("이름 입력?");
		String name = sc.next();
		for(int i=0; i<count; i++) {
			//if(super.getList()[i].getName().indexOf(name)>=0) { //이렇게하면 중간이나 끝에 들어가도 검색해서 출력
			if(super.getList()[i].getName().startsWith(name)) {
				System.out.println(super.getList()[i]);
			}	
		}
	}
	
	public void update() {
		System.out.println("\t데이터 수정...");
		System.out.print("수정할 학번?");
		String hak = sc.next();
		ScoreVO vo = readScore(hak);
		if(vo==null) {
			System.out.println("등록된 자료가 없습니다.");
			return;
		}
		for(int i=0; i<count; i++) {
			if(super.getList()[i] == vo) {
				System.out.print("이름?");
				vo.setName(sc.next());
				System.out.print("국어?");
				vo.setKor(sc.nextInt());
				System.out.print("영어?");
				vo.setEng(sc.nextInt());
				System.out.print("수학?");
				vo.setMath(sc.nextInt());
			}
		}
		System.out.println("데이터를 수정했습니다.");
	}
	public void delete() {
		System.out.println("\t데이터 삭제...");
		System.out.print("삭제할 학번?");
		String hak = sc.next();
		int idx = index(hak);
		if(idx==-1) {
			System.out.println("데이터가 존재하지 않습니다.");
			return;
		}
		System.out.println("삭제하시겠습니까?[Y/N]");
		char ch = sc.next().charAt(0);
		if(ch=='Y' || ch=='y') {
					for(int j=idx+1; j<count; j++) {
						super.getList()[j-1] = super.getList()[j];
					}
					super.getList()[count-1] = null;
					count--;
					System.out.println("데이터를 삭제했습니다.");
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
