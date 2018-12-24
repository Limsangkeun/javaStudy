package join;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class JoinApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch=-1;
		JoinService service = new JoinService();
		while(true) {
			do {
				try {
					if(service.loginInfo() && service.getUserID()!=null) {
						System.out.println("1.회원가입 2.로그인 3.로그아웃 4.수정 5.회원탈퇴 6.전체리스트 7.내정보 8.종료 ? (현재 ID : "+service.getUserID()+")");
					}else {
						System.out.println("1.회원가입 2.로그인 3.로그아웃 4.수정 5.회원탈퇴 6.전체리스트 7.내정보 8.종료 ? (로그아웃 상태 입니다.)");
					}
					
					ch = sc.nextInt();
				}catch(InputMismatchException e) {
					System.out.println("입력 형태가 틀립니다.");
				}catch(NoSuchElementException e) {
					System.out.println("비정상 입력입니다. 프로그램이 종료됩니다.");
					System.exit(0);
				}
				
			}while(ch<1|| ch>8);
			if(ch==8) {
				System.out.println("종료합니다.");
				break;
			}
			switch(ch) {
			case 1:service.join();break;
			case 2:service.login();break;
			case 3:service.logout();break;
			case 4:service.update();break;
			case 5:service.delete();break;
			case 6:service.printAll();break;
			case 7:service.printMyInfo();break;
			}
		}
		sc.close();
	}

}
