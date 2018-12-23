package method;
                               
import java.util.Scanner;      
class Per{                     
	String name;               
	int score[] = new int[3];  
	int total;                 
	int avg;                   
	int rank=1;                
}                              
class Sco{
	Scanner sc = new Scanner(System.in);
	int count=0;
	Per p[] = new Per[50];
	public void input() {
		if(count>=50) {
			System.out.println("FULL");
			return;
		}
		p[count] = new Per();
		System.out.println("이름?");
		p[count].name = sc.next();
		String q[] = {"국어?","영어?","수학?"};
		for(int i=0; i<p[count].score.length; i++) {
			System.out.print(q[i]);
			p[count].score[i]=sc.nextInt();
			p[count].total += p[count].score[i];
		}
		p[count].avg = p[count].total/3;
		count++;
	}
	public void write() {
		calRank();
		double t;
		System.out.println("이름\t국어\t영어\t수학\t총합\t평균\t랭크");
		for(int i=0; i<count; i++) {
			System.out.print(p[i].name+"\t");
			for(int j=0; j<3; j++) {
				System.out.print(p[i].score[j]+"\t");
			}
			System.out.print(p[i].total+"\t");
			System.out.print(p[i].avg+"\t");
			System.out.print(p[i].rank+"\t");
			p[i].rank=1;
			System.out.println();
			System.out.print("\t");
			t=0;
			for(int j=0; j<3; j++) {
				t += grade(p[i].score[j]);
				System.out.print(grade(p[i].score[j])+"\t");
			}
			System.out.print(t+"\t");
			System.out.printf("%.1f\t",t/3);
			System.out.println();
		}
	}
	public void calRank() {
		for(int i=0; i<count-1; i++) {
			for(int j=i+1; j<count; j++) {
				if(p[i].total<p[j].total) {
					p[i].rank++;
				}else if(p[i].total>p[j].total){
					p[j].rank++;
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

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		Sco s = new Sco();
		
		while(true) {
			System.out.println("1.입력 2.출력 3.종료");
			num = sc.nextInt();
			switch(num) {
				case 1:
					s.input();
					break;
				case 2:
					s.write();
					break;
				case 3:
					return;
			}
		}
	}
}
