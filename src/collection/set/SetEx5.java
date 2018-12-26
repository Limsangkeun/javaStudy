package collection.set;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

class User implements Comparable<User>{
	private String name;
	private int age;
	public User() {
		
	}
	public User(String name, int age) {
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
	public int compareTo(User o) {
		// TODO Auto-generated method stub
		
		return 0;
	}
}
public class SetEx5 {
	public static void main(String[] args) {
		//Set<User> set = new HashSet<>();
		Set<User> set = new TreeSet<>(); //��ü�� ��� ũ������� ������ �� ���⶧���� ��Ÿ�� ������ �߻��Ѵ�. //Comparable �������̽��� ������ Ŭ������ ���� ������.
		set.add(new User("�ڹ�",10));
		set.add(new User("������",7));
		set.add(new User("��",8));
		
		for(User u : set) {
			System.out.println(u.getName()+":"+u.getAge());
		}
		
		
	}
}