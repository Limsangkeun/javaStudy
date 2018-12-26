package collection.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorEx1 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		//list 인터페이스가 가지는 메서드의 개수 < Vector의 메서드 개수
		System.out.println("최초의 용량 : "+v.capacity()); //10
		
		v.add("자바");
		v.add("안드로이드");
		v.add("HTML");
		v.add("CSS");
		v.add("하둡");
		v.add("몽고DB");
		v.add("오라클");
		v.add("MS-SQL");
		v.add("MYSQL");
		v.add("자바스크립트");
		v.add("node.JS");
		v.add("서블릿");
		v.add("JSP");
		v.add("C");
		v.add("C++");
		v.add("OPEN-GL");
		System.out.println("최후의 용량 : "+v.capacity()); //16
		
		//!용량과 사이즈는 다르다!!! //용량은 담을수 잇는 그릇의 크기고 //사이즈는 현재 가지고 있는 개수
		System.out.println("처음 : " + v.get(0));//이건 모두의 것 //이게 있는데 굳이 Vector의 메서드를 외워서 사용할 필요가 없다.
		System.out.println("처음 : " + v.firstElement()); //이건 온리 Vector의 것
		System.out.println("마지막 : " + v.get(v.size()-1));//이건 모두의 것 //이게 있는데 굳이 Vector의 메서드를 외워서 사용할 필요가 없다.
		System.out.println("마지막 : " + v.lastElement()); //이건 온리 Vector의 것
		v.set(0, "JAVA");
		System.out.println(v);
		
		v.add(1, "FrameWork");
		System.out.println(v);
		
		//가나다 순
		Collections.sort(v);
		System.out.println(v);
		//순차검색//하나씩 비교해가면서 찾는 기법
		//바이너리 검색 //정렬된 상태에서 반씩 줄여나가면서 검색하는 기법
		//정렬해야 하므로 데이터가 많을 경우만 바이너리 검색이 빠름
		int n = Collections.binarySearch(v, "오라클");
		//반드시 오름차순 정렬되어있어야한다.
		if(n!=-1)
			System.out.println("오라클 : "+n+" 인덱스에 존재");
		
		//내림차순 정렬
		Collections.sort(v, Collections.reverseOrder());
		System.out.println(v);
	
		v.clear();//모두삭제
		System.out.println(v.size()+":"+v.capacity()); //사이즈 : 용량
		//용량과 크기를 맞춰보자 //데이터 절약을 위해
		v.add("java");
		v.trimToSize();
		System.out.println(v.size()+":"+v.capacity()); //사이즈 : 용량 1:1로 맞춰진다.
		
		
	}
}
