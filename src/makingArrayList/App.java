package makingArrayList;

import java.util.Iterator;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyList<String> list = new MyArrayList<>();
		
		//마지막에 데이터 삽입하기
		list.add("서울");
		list.add("부산");
		list.add("인천");
		list.add("경기");
		list.add("울산");
		list.add("광주");
		list.add("부천");
		list.add("뉴욕");
		list.add("샌프란시스코");
		list.add("헬게이트");
		/*
		//특정 위치의 데이터 가져오기
		System.out.println(list.get(1));
		
		//특정 위치에 데이터 삽입하기
		list.add(2,"대구");
		System.out.println("전체 -1....");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		list.remove("샌프란시스코");
		String s = list.set(0, "seoul");
		System.out.println(s);
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		System.out.println(list);
		*/
		System.out.println(list.size());
		MyIterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
