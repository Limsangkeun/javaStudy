package collection.map;

import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Properties ����  �о����
		String path = "test.properties";
		Properties p = new Properties();
		try (FileInputStream input = new FileInputStream(path)){
			p.load(input);
			System.out.println(p);
			
			Iterator<Object> it = p.keySet().iterator(); //Object�� �Ѿ�´�. String���� �����ü��� ����
			while(it.hasNext()) {
				String key = (String)it.next();
				System.out.println(p.getProperty(key));
			}
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
