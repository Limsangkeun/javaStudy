package collection.map;

import java.io.FileOutputStream;
import java.util.Properties;

public class Properties_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pathname = "ex.properties";
		//�������Ϸ� ���� �����
		try(FileOutputStream fos = new FileOutputStream(pathname)){
			Properties p = new Properties();
			
			p.setProperty("�ڹ�", "30"); //put�� �ƴ϶� setProperty�� ����
			p.setProperty("�ȵ�", "10"); //get�� �ƴ϶� getProperty�� �о��
			p.setProperty("��", "30");
			p.setProperty("������", "5");

			p.store(fos, "test"); //�׽�Ʈ �κ��� �ּ�
			System.out.println("���� �Ϸ�");
			
			
			
		}catch(Exception e) {
			System.out.println(e.toString());
		}
	}

}
