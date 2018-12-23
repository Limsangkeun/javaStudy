package method;

import java.util.Scanner;

class Person2{
	String name;
	int score[] = new int[3];
	int total, avg, rank=1;
}

class ScoreB{
	private Scanner sc = new Scanner(System.in);
	private int inwon=0;
	private Person2[] list = new Person2[50];
	
	public void input() {
		if(inwon>=50) { //�ο��� �ʰ� ���� (�迭 �ε��� 49����)
			System.out.println("\n�Է� �ʰ�...");
			return;
		}
		//Person ��ü �Է�
		System.out.println("������ �Է�");
		list[inwon] = new Person2(); //�ش� ��ü�� �޸� �Ҵ� //only �����ڸ� �޸� �Ҵ� ����
		//�̸� �Է� �ޱ�
		System.out.print("�̸� ? ");
		list[inwon].name= sc.next();

		//���� �Է� �ޱ�
		String tt[] = {"����?","����?","����?"};
		for(int i=0; i<list[inwon].score.length; i++) { //Person ��ü�� ���� �迭 ������ ��ŭ
			System.out.print(tt[i]);
			list[inwon].score[i] = sc.nextInt(); 
			list[inwon].total += list[inwon].score[i]; //���� ���
		}
		list[inwon].avg = list[inwon].total/3; //��� ���
		inwon++; //�ο��� ����
	}
	
	public void write() {
		calRank();
		double t;
		System.out.println("�̸�\t����\t����\t����\t����\t���\t����");
		for(int i=0; i<inwon; i++) {
			System.out.print(list[i].name+"\t");
			for(int j=0; j<list[i].score.length; j++) {
				System.out.print(list[i].score[j]+"\t");
			}
			
			System.out.print(list[i].total+"\t");
			System.out.print(list[i].avg+"\t");
			System.out.println(list[i].rank+"\t");
			System.out.print("\t");
			t=0;
			for(int j=0; j<list[i].score.length; j++) {
				t += grade(list[i].score[j]);
				System.out.print(grade(list[i].score[j])+"\t");
			}
			System.out.print(t+"\t");
			System.out.print((t/3)+"\n");
		}		
	}
	public void calRank() {
		for(int i=0; i<inwon-1; i++) {
			for(int j=i+1; j<inwon; j++) {
				if(list[i].total < list[j].total) {
					list[i].rank++;
				}
			}
		}
	}
	public double grade(int s) {
		if(s>=95) {
			return 4.5;
		}else if(s>=90) {
			return 4;
		}else if(s>=85) {
			return 3.5; 
		}else if(s>=80) {
			return 3; 
		}else if(s>=75) {
			return 2.5; 
		}else if(s>=70) {
			return 2; 
		}else if(s>=65) {
			return 1.5; 
		}else if(s>=60) {
			return 1; 
		}else {
			return 0; 
		}
	}
	

	
}
public class Score {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ScoreB ss = new ScoreB();
		int n;
		
		while(true) {
			do {
				System.out.println("1.�Է� 2.��� 3.���� =>");
				n = sc.nextInt();
			}while(n<1||n>3);
			
			switch(n) {
			case 1:ss.input();break;
			case 2:ss.write();break;
			default:sc.close();return;
			}
		}	
	}

}
