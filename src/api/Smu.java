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
		System.out.println("���󿡼� ���� ��մ� ������ ����������");
		while(count>0) {
			input = sc.nextInt();
			if(input==number) {
				System.out.println("��������~~~ ����");
				System.exit(0);
			}
			System.out.println(isHigh(input)?"����":"����");
			count--;
		}
		System.out.println("�װ͵� �����ߴ�...");
		sc.close();
	}
}
public class Smu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Game().start();
	}

}
