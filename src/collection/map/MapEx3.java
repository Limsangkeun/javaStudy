package collection.map;

import java.util.Map;
import java.util.TreeMap;

public class MapEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map<String,String> map = new HashMap<>();
		//LinkedHashMap은 입력 순으로 저장됩니다.
		//Map<String,String> map = new LinkedHashMap<>();
		//TreeHashMap은 키로 정렬 //단 키는 comparable 인터페이스가 구현되어 있어야함 //아니면 못씀
		Map<String,String> map = new TreeMap<>(); 
	
		
		map.put("홍길동", "서울");
		map.put("김자바", "경기");
		map.put("이자바", "서울");
		map.put("허자바", "인천");
		map.put("노자바", "경기");
		System.out.println(map);
		
		//키가 존재하는지 ??
		if(map.containsKey("김자바")) {
			System.out.println("김자바는 키로 존재합니다.");
		}else {
			System.out.println("김자바는 키로 존재하지 않습니다.");
		}
		//값이 존재하는지 ???
		if(map.containsValue("서울")) {
			System.out.println("서울은 값으로 존재합니다.");
		}else {
			System.out.println("서울은 값으로 존재하지 않습니다.");
		}
		
		//키가 홍길동인 자료 삭제
		map.remove("홍길동");
		System.out.println(map);
	}

}
