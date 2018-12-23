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
		if(inwon>=50) { //인원수 초과 방지 (배열 인덱스 49까지)
			System.out.println("\n입력 초과...");
			return;
		}
		//Person 객체 입력
		System.out.println("데이터 입력");
		list[inwon] = new Person2(); //해당 객체에 메모리 할당 //only 생성자만 메모리 할당 가능
		//이름 입력 받기
		System.out.print("이름 ? ");
		list[inwon].name= sc.next();

		//점수 입력 받기
		String tt[] = {"국어?","영어?","수학?"};
		for(int i=0; i<list[inwon].score.length; i++) { //Person 객체의 점수 배열 사이즈 만큼
			System.out.print(tt[i]);
			list[inwon].score[i] = sc.nextInt(); 
			list[inwon].total += list[inwon].score[i]; //총점 계산
		}
		list[inwon].avg = list[inwon].total/3; //평균 계산
		inwon++; //인원수 증가
	}
	
	public void write() {
		calRank();
		double t;
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t순위");
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
				System.out.println("1.입력 2.출력 3.종료 =>");
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
