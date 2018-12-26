package collection.map;

import java.io.FileOutputStream;
import java.util.Properties;

public class Properties_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pathname = "ex.properties";
		//설정파일로 많이 사용함
		try(FileOutputStream fos = new FileOutputStream(pathname)){
			Properties p = new Properties();
			
			p.setProperty("자바", "30"); //put이 아니라 setProperty로 저장
			p.setProperty("안드", "10"); //get이 아니라 getProperty로 읽어옴
			p.setProperty("웹", "30");
			p.setProperty("빅데이터", "5");

			p.store(fos, "test"); //테스트 부분은 주석
			System.out.println("저장 완료");
			
			
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
