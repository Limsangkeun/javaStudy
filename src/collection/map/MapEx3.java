package collection.map;

import java.util.Map;
import java.util.TreeMap;

public class MapEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<String,String> map = new HashMap<>();
		//LinkedHashMap�� �Է� ������ ����˴ϴ�.
		//Map<String,String> map = new LinkedHashMap<>();
		//TreeHashMap�� Ű�� ���� //�� Ű�� comparable �������̽��� �����Ǿ� �־���� //�ƴϸ� ����
		Map<String,String> map = new TreeMap<>(); 
	
		
		map.put("ȫ�浿", "����");
		map.put("���ڹ�", "���");
		map.put("���ڹ�", "����");
		map.put("���ڹ�", "��õ");
		map.put("���ڹ�", "���");
		System.out.println(map);
		
		//Ű�� �����ϴ��� ??
		if(map.containsKey("���ڹ�")) {
			System.out.println("���ڹٴ� Ű�� �����մϴ�.");
		}else {
			System.out.println("���ڹٴ� Ű�� �������� �ʽ��ϴ�.");
		}
		//���� �����ϴ��� ???
		if(map.containsValue("����")) {
			System.out.println("������ ������ �����մϴ�.");
		}else {
			System.out.println("������ ������ �������� �ʽ��ϴ�.");
		}
		
		//Ű�� ȫ�浿�� �ڷ� ����
		map.remove("ȫ�浿");
		System.out.println(map);
	}

}
