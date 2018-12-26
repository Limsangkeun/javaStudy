package join;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;

public class JoinService implements Join{
	private ArrayList<UserVO> list = new ArrayList<>();
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private boolean isLogin = false;
	private String loginUserID;
	private Calendar cal = Calendar.getInstance();
	public JoinService() {
		// TODO Auto-generated constructor stub
		UserVO vo = new UserVO();
		vo.setId("admin");
		vo.setPassword("admin");
		vo.setName("admin");
		vo.setBirth("--------");
		list.add(vo);
	}
	@Override
	public void join() {
		// TODO Auto-generated method stub
		if(isLogin)
		{
			System.out.println("�α��� �����Դϴ�. �α׾ƿ� �� �̿����ּ���!");
			return;
		}
		UserVO temp = new UserVO();
		try {
			System.out.println("-----ȸ������-----");
			System.out.print("���̵� �Է��ϼ��� : ");
			
			temp.setId(br.readLine().toLowerCase());
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getId().equals(temp.getId())) {
					System.out.println("id�� �ߺ��˴ϴ�.");
					return;
				}			
			}
			System.out.print("��й�ȣ�� �Է��ϼ��� : ");
			temp.setPassword(br.readLine());
			System.out.print("�̸��� �Է��ϼ��� : ");
			temp.setName(br.readLine());
			System.out.print("������ �Է��ϼ��� : (yyyyMMDD)");
			String tempString = br.readLine();
			if(tempString.length() != 8) {	
				System.out.println("8���� �ùٸ� �������� ������ �Է��ϼ���.");
				return;
			}
			temp.setBirth(tempString);
			list.add(temp);
			System.out.println("���������� �߰��Ͽ����ϴ�.");
		}catch(IOException e) {
			System.out.println(e.toString());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
			
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		if(isLogin)
		{
			System.out.println("�α��� �����Դϴ�. �α׾ƿ� �� �̿����ּ���!");
			return;
		}
		String id,password;
		try {
			System.out.println("-----�α���-----");
			System.out.print("���̵� �Է��ϼ��� : ");
			id = br.readLine();
			System.out.print("��й�ȣ�� �Է��ϼ��� : ");
			password = br.readLine();
			
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getId().equals(id)) {
					if(list.get(i).getPassword().equals(password)) {
						System.out.println("�α��ο� �����Ͽ����ϴ�.");
						loginUserID = list.get(i).getId();
						isLogin = true;
						return;
					}
				}
			}
			System.out.println("id �Ǵ� password�� �ٸ��ϴ�.");
		}catch(IOException e) {
			System.out.println(e.toString());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void logout() {
		// TODO Auto-generated method stub
		if(isLogin) {
			isLogin = false;
			loginUserID = null;
			System.out.println("�α׾ƿ��Ͽ����ϴ�.");
			return;
		}
		System.out.println("�α��� ���°� �ƴմϴ�.");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		if(!isLogin) {
			System.out.println("�α��� �ؾ߸� ȸ������ ������ �����մϴ�.");
			return;
		}
		try {
			UserVO original = getUser(loginUserID);
			UserVO temp = new UserVO();
			temp.setId(loginUserID);
			System.out.print("���ο� ��й�ȣ�� �Է��ϼ��� : ");
			temp.setPassword(br.readLine());
			System.out.print("�̸��� �Է��ϼ��� : ");
			temp.setName(br.readLine());
			System.out.print("������ �Է��ϼ��� : (yyyyMMDD)");
			String tempString = br.readLine();
			if(tempString.length() != 8) {	
				System.out.println("8���� �ùٸ� �������� ������ �Է��ϼ���.");
				return;
			}
			System.out.println("�������� : "+temp);
			System.out.println("���� �����Ͻðڽ��ϱ�?(Y/N)");
			char ch = br.readLine().charAt(0);
			if(ch!='Y' && ch != 'y') {
				System.out.println("ȸ������ ��ҵǾ����ϴ�.");
				return;
			}
			list.set(list.indexOf(original), temp);
			System.out.println("ȸ�� ���� ������ �Ϸ�Ǿ����ϴ�.");
		}catch(IOException e) {
			System.out.println(e.toString());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		if(!isLogin) {
			System.out.println("�α��� �ؾ߸� ȸ��Ż�� �����մϴ�.");
			return;
		}
		System.out.println("���� Ż���Ͻðڽ��ϱ�?(Y/N)");
		try {
			char ch = br.readLine().charAt(0);
			if(ch!='Y' && ch != 'y') {
				System.out.println("ȸ��Ż�� ��ҵǾ����ϴ�.");
				return;
			}
			list.remove(getUser(loginUserID));
			loginUserID = null;
			isLogin = false;
			System.out.println("ȸ��Ż�� �Ϸ�Ǿ����ϴ�.");
		}catch(IOException e) {
			System.out.println(e.toString());
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Override
	public void printAll() {
		// TODO Auto-generated method stub
		if(!(isLogin && loginUserID.equals("admin"))) {
			System.out.println("�����ڷ� �α����ؾ߸� ��ü ����� �� �� �ֽ��ϴ�.");
			return;
		}
		if(list.size()==0) {
			System.out.println("����Ʈ�� ������ϴ�.");
			return;
		}
		for(UserVO temp : list) {
			System.out.print(temp);
		}
	}
	
	private UserVO getUser(String id) {
		UserVO temp = null;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getId().equals(id)) {
				return list.get(i);
			}
		}
		return temp;
	}

	@Override
	public void printMyInfo() {
		// TODO Auto-generated method stub
		if(!isLogin) {
			System.out.println("�α��� �ؾ߸� ȸ������ Ȯ���� �����մϴ�.");
			return;
		}
		System.out.println(getUser(loginUserID));
	}
	
	public String getUserID() {
		return this.loginUserID;
	}
	public boolean loginInfo() {
		return this.isLogin;
	}

}
