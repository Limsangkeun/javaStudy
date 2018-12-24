package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List 구현클래스 : ArrayList, LinkedList, Vector
		List<String> list = new ArrayList<>(); // 업캐스팅

		list.add("서울");
		list.add("부산");
		list.add("대구");
		list.add("인천");
		list.add("광주");
		list.add("대전");
		list.add("울산");
		list.add("세종");
		
		List<String> list2 = new ArrayList<>();
		list2.add("경기");
		list2.add("강원");
		list2.add("충청");
		list2.add("전라");
		list2.add("경상");
		list2.add("제주");
		
		list.addAll(list2); //list에 list2 데이터를 모두 추가
		System.out.println(list);
		
		//리스트 to 배열
		
		String array[] = list.toArray(new String[list.size()]); //String 배열의 선언(list의 크기로)
		
		for(String s : array) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		//배열 to List #1
		//List<String> list3 = new ArrayList<>(Arrays.asList(array));
		//배열 to List #2
		List<String> list3 = Arrays.asList(array);
		System.out.println(list3);
		
		//subList(fromIndex, toIndex) : fromIndex 부터 toIndex-1 까지 잘라서 리스트로 반환 //subString 개념과 유사
		List<String> list4 = list.subList(2, 5);
		System.out.println(list4);
		
		//clear.. index 2~4 까지 지우기
		list.subList(2, 5).clear(); //본 리스트에서 서브 리스트 만큼 삭제해라
		System.out.println(list);
		
		//list2 모두 지우기
		list2.clear();
		System.out.println("list2가 아무것도 없나 ? : " + list2.isEmpty());
		System.out.println("list2의 원소의 개수 : " + list2.size());
		
		//
	}

}
