package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
	//HashMap은 동기화 지원 x, HashTable은 동기화 지원. HashTable과 HashMap은 기능적으로 동일
	//Map은 Iterator를 구현하지 않으므로 향상된 for문 사용 불가.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<>(); //key는 set구조로 이루어져있다.
		
		map.put("seoul", 1000);
		map.put("incheon", 270);
		map.put("busan", 250);
		map.put("seoul", 990); //키가 중복되면 나중에 입력된 값으로 덮어진다.
		//Hash 방식으로 데이터를 저장하기 때문에 순서가 입력 순으로 나오지 않는다.
		System.out.println(map);
		
		//map은 키가 set이므로 키를 이용하여 반복자로 순회하면서 전체를 가져올 수 있다. 단, 한번 꼬아야 한다.
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			System.out.print(map.get(it.next())+" ");
		}
		System.out.println();
		
		//두번째 방법
		for(String s : map.keySet()) {
			System.out.print(map.get(s)+" ");
		}
		System.out.println();
		
		//세번째 방법
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it2 = set.iterator();
		while(it2.hasNext()) {
			Map.Entry<String, Integer> e = it2.next();
			System.out.println(e.getKey()+":"+e.getValue());
		}
		System.out.println();
		
		//네번째 방법
		for(Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey()+":"+m.getValue());
		}
		Set<String> temp = map.keySet();
		System.out.println(map.containsKey("sangkeun"));
		System.out.println(temp);
	}

}
