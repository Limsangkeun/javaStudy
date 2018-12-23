package inheritance;

import java.util.Scanner;

class UserVO{ //인스턴스 변수는 왠만하면 public이나 디폴트로 만들지 말구 private으로 만들어라
	private String name;
	private int score;
	//set은 외부에서 값 변경이 가능하므로 필요한 경우에만 만든다.
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
	private UserVO list[] = new UserVO[5]; //ValueObject DTO(Data transfer Object) 데이터 저장 객체용으로 사용되는 클래스
	private int count = 0;
	
	public void input() {
		if(count >=5) {
			System.out.println("입력 초과....");
			return;
		}
		list[count] = new UserVO();
		System.out.print("이름?");
		list[count].setName(sc.next());
		System.out.print("점수?");
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
//의존관계를 맺는법 1.생성자 2.setter
class UserService { //UserService는  User클래스에 의존관계에 있다.
	private User user;
	public UserService(User user) {
		this.user = user;
	}
	public void print() {
		System.out.println("\n성적 리스트...");
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
				System.out.print("1.입력 2.출력 3.종료 = > ");
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

