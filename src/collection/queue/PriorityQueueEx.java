package collection.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;

//이름 순서대로 큐에 넣겠다.
class User2 implements Comparable<User2>{
	private String name;
	private int age;
	
	public User2() {
	}
	
	public User2(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(User2 o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());
	}
	
}

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//우선순위 큐
		PriorityQueue<User2> qu = new PriorityQueue<>();
		qu.offer(new User2("자바",30));
		qu.offer(new User2("안드로이드",30));
		qu.offer(new User2("서블릿",30));
		qu.offer(new User2("웹",30));
		
		while(qu.peek() != null) {
			User2 user = qu.poll();
			System.out.println(user.getName()+":"+user.getAge());
		}
		
	}

}
