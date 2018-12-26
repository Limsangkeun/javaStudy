package collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//�ϳ��� �������� �ۿ� ������ �� ����
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
		list.add(new Ex2("�ڹ�",50));
		list.add(new Ex2("�ȵ���̵�",8));
		list.add(new Ex2("��",40));
		list.add(new Ex2("������",50));
		list.add(new Ex2("��",50));
		//Collections.sort(list);
		for(Ex2 e : list) {
			System.out.println(e.getName()+":"+e.getAge());
		}
		
	}

}
