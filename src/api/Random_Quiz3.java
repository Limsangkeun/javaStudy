package api;

import java.util.Random;
import java.util.Scanner;
class Run{
	int outCount; //�ƿ� ī��Ʈ
	int totalScore; //�� ����
	
	public Run(){
		outCount=0;
		totalScore = 0;
	}
	
	public String pitch() { //������ ���� ������.
		Random rand = new Random();
		StringBuffer sb = new StringBuffer();
		int num;
		gogo:
		for(int i=0; i<6; i++) {
			num = rand.nextInt(10);
			for(int j=0; j<i; j++) { //i ��� sb.length()�� �־ �������.
				if(num==Integer.parseInt(sb.substring(j,j+1))) { //�ߺ��Ǵ� ���ڸ� �ٽ�
					i--;
					continue gogo;
				}
			}
			sb.append(Integer.toString(num)); //���ڸ� StringBuffer�� �ְ� 
		}
		return sb.toString(); //String���·� ����
	}
	public void count(String input) {
		String result = pitch();
		System.out.println("���ƿ� �� : "+result);
		System.out.println("�Է��� �� : "+input);
		int count=0;
		for(int i=0; i<input.length(); i++) {	
			if(result.indexOf(input.substring(i, i+1))!=-1) {
				System.out.println("��~");
				count++;
			}
		}
		print(count);
	}
	public void print(int count) {
		switch(count) {
		case 3:
			System.out.println("1��Ÿ");
			totalScore++;
			break;
		case 4:
			System.out.println("2��Ÿ");
			totalScore += 2;
			break;
		case 5:
			System.out.println("3��Ÿ");
			totalScore += 3;
			break;
		case 6:
			System.out.println("Ȩ��");
			totalScore += 6;
			break;
		default :
			System.out.println("�ƿ�");
			outCount++;
			break;
		}
	}
	public void start() {
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(); 
		int num;
		gogo:
		for(int i=0; i<6; i++) { 
				System.out.println(i+1+"���ڸ� �ϳ��� �Է��ϼ���: ");
				num = sc.nextInt();
				if(num/10 !=0) {
					System.out.println("(0~9)�� ���ڸ� �Է��ؾ��մϴ�.");
					i--;
					continue gogo;
				}
				if(sb.indexOf(Integer.toString(num))!=-1) {
					System.out.println(num+" �ߺ� ! �ٽ� �Է��ϼ��� : ");
					i--;
					continue gogo;
				}
				sb.append(Integer.toString(num));
		}
		count(sb.toString()); //�Է� ���� ���� � �¾Ҵ��� ī��Ʈ �ϴ� �Լ� ȣ��
	}
}

public class Random_Quiz3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Run run = new Run();
		while(run.outCount !=3) { //out ī��Ʈ�� 3���� �Ǹ� ���� ����
			run.start();
		}
		System.out.println("����� ���� ������ : "+run.totalScore); //���� ���� ���
	}
}
