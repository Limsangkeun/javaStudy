package api;

import java.util.Random;
import java.util.Scanner;

class Game{
	int count;
	int number;
	public Game() {
		Random rand = new Random();
		number = rand.nextInt(100)+1;
		count = 20;
	}
	public boolean isHigh(int input) {
		if(input > number) return true;
		return false;
	}
	public void start() {
		Scanner sc = new Scanner(System.in);
		int input;
		System.out.println("세상에서 제일 재밌는 스무고개 시이이이작");
		while(count>0) {
			input = sc.nextInt();
			if(input==number) {
				System.out.println("빰빰빰빰~~~ 정답");
				System.exit(0);
			}
			System.out.println(isHigh(input)?"낮다":"높다");
			count--;
		}
		System.out.println("그것도 못맞추니...");
		sc.close();
	}
}
public class Smu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Game().start();
	}

}
