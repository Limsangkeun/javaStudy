package api;

import java.util.Arrays;
import java.util.Collections;

public class Arrays_Ex {
	public static void print(String title,String ss[]) {
		System.out.println(title);
		
		for(String s : ss) {
			System.out.print(s+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		String ss[] = {"홍길동", "김자바", "이자바", "서대한", "이순신"};
		
		/*
		 * 문자열 비교 
		 * == : 주소값 비교
		 * String의 equals() : 값비교
		 * String의 compareTo() : 크기 비교(ASCII 코드 차이 값 리턴)
		 */
		
		print("원본....",ss);
		Arrays.sort(ss);
		print("오름차순...",ss);
		Arrays.sort(ss,Collections.reverseOrder());
		print("내림차순...",ss);

		
		//Object : 자바의 최상위 클래스 => 자바의 모든 객체를 가질 수 있다.
		//Object[] oo = {"서울", new Integer(30), "부산", "대구", new Integer(5)};
		//Arrays.sort(oo); //형태가 다르면 정렬할 수 없다. //런타임 에러
		
		char c1[] = {'a','p','r','i','n','g'};
		char c2[] = Arrays.copyOf(c1, c1.length); 
	
		System.out.println(c1==c2);
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		char c3[] = Arrays.copyOfRange(c1, 1, 4); //범위 설정한 복제 from 1부터 4전까지
		System.out.println(Arrays.toString(c3));
		
		char c4[] = new char[c1.length];
		System.arraycopy(c1, 0, c4, 0, c1.length);
		System.out.println(Arrays.toString(c4));
		//arraycopy는 메모리 할당을 하고 해야한다.
		
		int []a= {1,2,3};
		int []b= {1,2,3};
		int []c= {1,2,3,4,5};
		
		System.out.println(a==b); //주소/false
		System.out.println(a.equals(b)); //주소/false
		
		//요소의 값 비교
		System.out.println(Arrays.equals(a, b)); //true
		System.out.println(Arrays.equals(a, c)); //false
		
		int [][]aa = {{1,2,3},{4,5,6}};
		int [][]bb = {{1,2,3},{4,5,6}};
		
		System.out.println(Arrays.equals(aa,bb)); //false, 얕은 비교 //2차원 배열에서는 1차원에서 가지고 있는 주소 비교
		
		System.out.println(Arrays.deepEquals(aa, bb)); //깊은 비교 //내부에 들어있는 값 체킹
		
	}
}
