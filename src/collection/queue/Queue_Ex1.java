package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> qu = new LinkedList<>();
		
		qu.offer("서울"); //데이터 추가
		qu.offer("부산");
		qu.offer("인천");
		qu.offer("대구");
		System.out.println(qu);
		
		while(qu.peek()!=null) { //peek() : head 요소를 반환하고 삭제하지 않음
			String s = qu.poll();//poll() : head 요소를 반환하고 삭제
			System.out.println(s);
		}
		System.out.println(qu);
	}

}
