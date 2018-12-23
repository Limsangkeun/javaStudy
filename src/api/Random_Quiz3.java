package api;

import java.util.Random;
import java.util.Scanner;
class Run{
	int outCount; //아웃 카운트
	int totalScore; //총 점수
	
	public Run(){
		outCount=0;
		totalScore = 0;
	}
	
	public String pitch() { //랜덤한 수를 던진다.
		Random rand = new Random();
		StringBuffer sb = new StringBuffer();
		int num;
		gogo:
		for(int i=0; i<6; i++) {
			num = rand.nextInt(10);
			for(int j=0; j<i; j++) { //i 대신 sb.length()를 넣어도 상관없음.
				if(num==Integer.parseInt(sb.substring(j,j+1))) { //중복되는 숫자면 다시
					i--;
					continue gogo;
				}
			}
			sb.append(Integer.toString(num)); //숫자를 StringBuffer에 넣고 
		}
		return sb.toString(); //String형태로 리턴
	}
	public void count(String input) {
		String result = pitch();
		System.out.println("날아온 값 : "+result);
		System.out.println("입력한 값 : "+input);
		int count=0;
		for(int i=0; i<input.length(); i++) {	
			if(result.indexOf(input.substring(i, i+1))!=-1) {
				System.out.println("탕~");
				count++;
			}
		}
		print(count);
	}
	public void print(int count) {
		switch(count) {
		case 3:
			System.out.println("1루타");
			totalScore++;
			break;
		case 4:
			System.out.println("2루타");
			totalScore += 2;
			break;
		case 5:
			System.out.println("3루타");
			totalScore += 3;
			break;
		case 6:
			System.out.println("홈런");
			totalScore += 6;
			break;
		default :
			System.out.println("아웃");
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
				System.out.println(i+1+"숫자를 하나씩 입력하세요: ");
				num = sc.nextInt();
				if(num/10 !=0) {
					System.out.println("(0~9)의 숫자를 입력해야합니다.");
					i--;
					continue gogo;
				}
				if(sb.indexOf(Integer.toString(num))!=-1) {
					System.out.println(num+" 중복 ! 다시 입력하세요 : ");
					i--;
					continue gogo;
				}
				sb.append(Integer.toString(num));
		}
		count(sb.toString()); //입력 받은 값을 몇개 맞았는지 카운트 하는 함수 호출
	}
}

public class Random_Quiz3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Run run = new Run();
		while(run.outCount !=3) { //out 카운트가 3번이 되면 게임 끝남
			run.start();
		}
		System.out.println("당신의 최종 점수는 : "+run.totalScore); //최종 점수 출력
	}
}
