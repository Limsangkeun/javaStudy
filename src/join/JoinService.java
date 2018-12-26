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
			System.out.println("로그인 상태입니다. 로그아웃 후 이용해주세요!");
			return;
		}
		UserVO temp = new UserVO();
		try {
			System.out.println("-----회원가입-----");
			System.out.print("아이디를 입력하세요 : ");
			
			temp.setId(br.readLine().toLowerCase());
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getId().equals(temp.getId())) {
					System.out.println("id가 중복됩니다.");
					return;
				}			
			}
			System.out.print("비밀번호를 입력하세요 : ");
			temp.setPassword(br.readLine());
			System.out.print("이름을 입력하세요 : ");
			temp.setName(br.readLine());
			System.out.print("생일을 입력하세요 : (yyyyMMDD)");
			String tempString = br.readLine();
			if(tempString.length() != 8) {	
				System.out.println("8자의 올바른 형식으로 생일을 입력하세요.");
				return;
			}
			temp.setBirth(tempString);
			list.add(temp);
			System.out.println("성공적으로 추가하였습니다.");
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
			System.out.println("로그인 상태입니다. 로그아웃 후 이용해주세요!");
			return;
		}
		String id,password;
		try {
			System.out.println("-----로그인-----");
			System.out.print("아이디를 입력하세요 : ");
			id = br.readLine();
			System.out.print("비밀번호를 입력하세요 : ");
			password = br.readLine();
			
			for(int i=0; i<list.size(); i++) {
				if(list.get(i).getId().equals(id)) {
					if(list.get(i).getPassword().equals(password)) {
						System.out.println("로그인에 성공하였습니다.");
						loginUserID = list.get(i).getId();
						isLogin = true;
						return;
					}
				}
			}
			System.out.println("id 또는 password가 다릅니다.");
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
			System.out.println("로그아웃하였습니다.");
			return;
		}
		System.out.println("로그인 상태가 아닙니다.");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		if(!isLogin) {
			System.out.println("로그인 해야만 회원정보 수정이 가능합니다.");
			return;
		}
		try {
			UserVO original = getUser(loginUserID);
			UserVO temp = new UserVO();
			temp.setId(loginUserID);
			System.out.print("새로운 비밀번호를 입력하세요 : ");
			temp.setPassword(br.readLine());
			System.out.print("이름을 입력하세요 : ");
			temp.setName(br.readLine());
			System.out.print("생일을 입력하세요 : (yyyyMMDD)");
			String tempString = br.readLine();
			if(tempString.length() != 8) {	
				System.out.println("8자의 올바른 형식으로 생일을 입력하세요.");
				return;
			}
			System.out.println("현재정보 : "+temp);
			System.out.println("정말 수정하시겠습니까?(Y/N)");
			char ch = br.readLine().charAt(0);
			if(ch!='Y' && ch != 'y') {
				System.out.println("회원수정 취소되었습니다.");
				return;
			}
			list.set(list.indexOf(original), temp);
			System.out.println("회원 정보 수정이 완료되었습니다.");
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
			System.out.println("로그인 해야만 회원탈퇴가 가능합니다.");
			return;
		}
		System.out.println("정말 탈퇴하시겠습니까?(Y/N)");
		try {
			char ch = br.readLine().charAt(0);
			if(ch!='Y' && ch != 'y') {
				System.out.println("회원탈퇴 취소되었습니다.");
				return;
			}
			list.remove(getUser(loginUserID));
			loginUserID = null;
			isLogin = false;
			System.out.println("회원탈퇴가 완료되었습니다.");
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
			System.out.println("관리자로 로그인해야만 전체 목록을 볼 수 있습니다.");
			return;
		}
		if(list.size()==0) {
			System.out.println("리스트가 비었습니다.");
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
			System.out.println("로그인 해야만 회원정보 확인이 가능합니다.");
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
