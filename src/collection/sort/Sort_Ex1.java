package collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//하나의 기준으로 밖에 정렬할 수 없음
class Ex7 implements Comparable<Ex2>{
	private String name;
	private int age;
	
	public Ex7() {
		
	}
	public Ex7(String name, int age) {
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
	public int compareTo(Ex2 o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.getName());
	}
}

public class Sort_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Ex2> list = new ArrayList<>();
		list.add(new Ex2("자바",50));
		list.add(new Ex2("안드로이드",8));
		list.add(new Ex2("웹",40));
		list.add(new Ex2("스프링",50));
		list.add(new Ex2("빅",50));
		//Collections.sort(list);
		for(Ex2 e : list) {
			System.out.println(e.getName()+":"+e.getAge());
		}
		
	}

}
