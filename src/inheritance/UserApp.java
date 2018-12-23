package inheritance;

import java.util.Scanner;

class UserVO{ //�ν��Ͻ� ������ �ظ��ϸ� public�̳� ����Ʈ�� ������ ���� private���� ������
	private String name;
	private int score;
	//set�� �ܺο��� �� ������ �����ϹǷ� �ʿ��� ��쿡�� �����.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}

class User {
	private Scanner sc = new Scanner(System.in);
	private UserVO list[] = new UserVO[5]; //ValueObject DTO(Data transfer Object) ������ ���� ��ü������ ���Ǵ� Ŭ����
	private int count = 0;
	
	public void input() {
		if(count >=5) {
			System.out.println("�Է� �ʰ�....");
			return;
		}
		list[count] = new UserVO();
		System.out.print("�̸�?");
		list[count].setName(sc.next());
		System.out.print("����?");
		list[count].setScore(sc.nextInt());
		count++;
	}
	public int getCount() {
		return count;
	}
	public UserVO[] getList() {
		return list;
	}
}
//�������踦 �δ¹� 1.������ 2.setter
class UserService { //UserService��  UserŬ������ �������迡 �ִ�.
	private User user;
	public UserService(User user) {
		this.user = user;
	}
	public void print() {
		System.out.println("\n���� ����Ʈ...");
		for(int i=0; i<user.getCount(); i++) {
			UserVO vo = user.getList()[i];
			System.out.println(vo.getName()+","+vo.getScore());
		}
	}
}
public class UserApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User uu = new User();
		UserService us = new UserService(uu);
		Scanner sc = new Scanner(System.in);
		int ch;
		
		while(true) {
			do {
				System.out.print("1.�Է� 2.��� 3.���� = > ");
				ch = sc.nextInt();
			}while(ch<1 || ch>3);
			if(ch==3)break;
			
			switch(ch) {
			case 1:uu.input();break;
			case 2:us.print();break;
			}
		}
		sc.close();
	}

}

