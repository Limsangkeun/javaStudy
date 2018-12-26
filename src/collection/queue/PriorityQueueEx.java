package collection.queue;

import java.util.LinkedList;
import java.util.PriorityQueue;

//�̸� ������� ť�� �ְڴ�.
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
		//�켱���� ť
		PriorityQueue<User2> qu = new PriorityQueue<>();
		qu.offer(new User2("�ڹ�",30));
		qu.offer(new User2("�ȵ���̵�",30));
		qu.offer(new User2("����",30));
		qu.offer(new User2("��",30));
		
		while(qu.peek() != null) {
			User2 user = qu.poll();
			System.out.println(user.getName()+":"+user.getAge());
		}
		
	}

}
