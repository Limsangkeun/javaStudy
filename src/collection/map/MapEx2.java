package collection.map;

import java.util.Collection;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new Hashtable<>(); //����ȭ ����
		
		map.put("�ڹ�", 90);
		map.put("������", 100);
		map.put("������", 60);
		map.put("����Ŭ", 80);
		map.put("��", 80);
		
		//Map�� value�� List ��
		List<Integer> list = new LinkedList<>(map.values()); //value�� ����Ʈ�� ������ �� �ִ�.
		System.out.println(list);
		Collection<Integer> c = map.values(); //Collection�� Super class�̹Ƿ� ��밡���ϴ�. //Map�� value Collection����
		System.out.println(c);
		
		
	}

}
