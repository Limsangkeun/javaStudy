package collection.map;

import java.util.Collection;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MapEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new Hashtable<>(); //동기화 지원
		
		map.put("자바", 90);
		map.put("스프링", 100);
		map.put("빅데이터", 60);
		map.put("오라클", 80);
		map.put("웹", 80);
		
		//Map의 value를 List 로
		List<Integer> list = new LinkedList<>(map.values()); //value만 리스트로 가져올 수 있다.
		System.out.println(list);
		Collection<Integer> c = map.values(); //Collection가 Super class이므로 사용가능하다. //Map의 value Collection으로
		System.out.println(c);
		
		
	}

}
