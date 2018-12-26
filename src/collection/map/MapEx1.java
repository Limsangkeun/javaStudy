package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
	//HashMap�� ����ȭ ���� x, HashTable�� ����ȭ ����. HashTable�� HashMap�� ��������� ����
	//Map�� Iterator�� �������� �����Ƿ� ���� for�� ��� �Ұ�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<>(); //key�� set������ �̷�����ִ�.
		
		map.put("seoul", 1000);
		map.put("incheon", 270);
		map.put("busan", 250);
		map.put("seoul", 990); //Ű�� �ߺ��Ǹ� ���߿� �Էµ� ������ ��������.
		//Hash ������� �����͸� �����ϱ� ������ ������ �Է� ������ ������ �ʴ´�.
		System.out.println(map);
		
		//map�� Ű�� set�̹Ƿ� Ű�� �̿��Ͽ� �ݺ��ڷ� ��ȸ�ϸ鼭 ��ü�� ������ �� �ִ�. ��, �ѹ� ���ƾ� �Ѵ�.
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			System.out.print(map.get(it.next())+" ");
		}
		System.out.println();
		
		//�ι�° ���
		for(String s : map.keySet()) {
			System.out.print(map.get(s)+" ");
		}
		System.out.println();
		
		//����° ���
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it2 = set.iterator();
		while(it2.hasNext()) {
			Map.Entry<String, Integer> e = it2.next();
			System.out.println(e.getKey()+":"+e.getValue());
		}
		System.out.println();
		
		//�׹�° ���
		for(Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		Set<String> temp = map.keySet();
		System.out.println(map.containsKey("sangkeun"));
		System.out.println(temp);
	}

}
