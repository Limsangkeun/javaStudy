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
						System.out.println("1.ȸ������ 2.�α��� 3.�α׾ƿ� 4.���� 5.ȸ��Ż�� 6.��ü����Ʈ 7.������ 8.���� ? (���� ID : "+service.getUserID()+")");
					}else {
						System.out.println("1.ȸ������ 2.�α��� 3.�α׾ƿ� 4.���� 5.ȸ��Ż�� 6.��ü����Ʈ 7.������ 8.���� ? (�α׾ƿ� ���� �Դϴ�.)");
					}
					
					ch = sc.nextInt();
				}catch(InputMismatchException e) {
					System.out.println("�Է� ���°� Ʋ���ϴ�.");
				}catch(NoSuchElementException e) {
					System.out.println("������ �Է��Դϴ�. ���α׷��� ����˴ϴ�.");
					System.exit(0);
				}
				
			}while(ch<1|| ch>8);
			if(ch==8) {
				System.out.println("�����մϴ�.");
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
