package collection.set;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

class User2 implements Comparable<User2>{ //Comparable 객체간 비교 이므로 제네릭에 객체를 넣어줘야한다.
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
	public int compareTo(User2 o) { //음수면 앞의 것이 작은것
		// TODO Auto-generated method stub
		//return getName().compareTo(o.getName()); //이름 순
		//return getAge() - o.getAge(); //나이순
		//return o.getAge()-getAge(); //나이역순 
		//return -(getAge() - o.getAge()); //나이역순 2
		return -(getName().compareTo(o.getName())); //이름 역순
	}

}
public class SetEx6 {
	public static void main(String[] args) {
		//Set<User> set = new HashSet<>();
		Set<User2> set = new TreeSet<>(); //객체의 경우 크기순으로 정렬할 수 없기때문에 런타임 오류가 발생한다. //Comparable 인터페이스를 구현한 클래스만 정렬 가능하다.
		//따라서 정렬하고자 하면 Comparable 인터페이스를 구현하자 
		set.add(new User2("자바",10));
		set.add(new User2("스프링",17));
		set.add(new User2("웹",8));
		
		for(User2 u : set) {
			System.out.println(u.getName()+":"+u.getAge());
		}
		
		
	}
}