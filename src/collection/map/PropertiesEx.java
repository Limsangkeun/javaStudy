package collection.map;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Properties 파일  읽어오기
		String path = "test.properties";
		Properties p = new Properties();
		try (FileInputStream input = new FileInputStream(path)){
			p.load(input);
			System.out.println(p);
			
			Iterator<Object> it = p.keySet().iterator(); //Object로 넘어온다. String으로 가져올수가 없음
			while(it.hasNext()) {
				String key = (String)it.next();
				System.out.println(p.getProperty(key));
			}
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
