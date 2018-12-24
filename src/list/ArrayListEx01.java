package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List 구현클래스 : ArrayList, LinkedList, Vector
		List<String> list = new ArrayList<>(); //업캐스팅
		
		list.add("서울");
		list.add("부산");
		list.add("대구");
		list.add("인천");
		list.add("광주");
		list.add("대전");
		list.add("울산");
		list.add("서울"); //중복 허용
		
		System.out.println(list);
		System.out.println("전체 데이터 개수 : "+list.size());
		System.out.println("처음 : "+list.get(0));
		System.out.println("마지막 : "+list.get(list.size()-1));
		
		//처음에 한국 추가ㅓ
		list.add(0, "한국");
		System.out.println(list);
		
		//처음 데이터를 대한민국으로 변경
		list.set(0, "대한민국");
		System.out.println(list);
		
		//리스트 안에 서울이 있는가 확인
		if(list.contains("서울"))
			System.out.println("서울이 존재합니다."); //이건 주소로 찾는거나 마찬가지
		
		//부산이 몇번째 인덱스에 있는지 확인
		System.out.println(list.size()+"개의 아이템 중 "+list.indexOf("부산")); //존재하지 않으면 -1
		
		//대한민국 삭제
		//list.remove("대한민국"); 
		list.remove(0); //둘 중 하나 사용
		
		//출력하기
		System.out.println("전체 출력-1");
		for(String s : list) { //jdk 5.0 이상만 사용 가능
			System.out.print(s+" ");
		}
		System.out.println("전체 출력-2");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)+" ");
		}
		System.out.println("전체 출력-3 using iterator" ); //Map에서 자주 사용
		Iterator<String> it = list.iterator(); //Iterator == 반복자. 데이터를 처음부터 끝까지 순회하면서 하나씩 추출해 오는개념.
		
		while(it.hasNext()) { //데이터가 존재하면 True 데이터가 없으면 False 
			System.out.print(it.next()+" ");//데이터를 가져오고 다음으로 이동
		}
		System.out.println();
		while(it.hasNext()) { //데이터가 존재하면 True 데이터가 없으면 False 
			System.out.print(it.next()+" ");//데이터를 가져오고 다음으로 이동
		}
		System.out.println("전체 출력-4");
		ListIterator<String> it2 = list.listIterator(); //Vector에서는 존재하지 않음. 역순으로도 출력가능(그냥 Iterator는 불가)
		while(it2.hasNext()) {
			String s = it2.next();
			System.out.print(s+" ");
		}
		System.out.println();
		//위에 전체 출력으로 인해 ListIterator가  끝으로 가있기때문에 역순 출력이 가능한것이다. 아니면 이전값이 없으므로 출력되지 않는다.
		System.out.println("역순 출력-1");
		while(it2.hasPrevious()) {
			System.out.print(it2.previous()+" ");
		}
		System.out.println();
		
		System.out.println("역순 출력-2");
		for(int i=list.size()-1; i>=0; i--) {
			System.out.print(list.get(i)+" ");
		}
	}

}
