package collection.set;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

class User2 implements Comparable<User2>{ //Comparable ��ü�� �� �̹Ƿ� ���׸��� ��ü�� �־�����Ѵ�.
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
	public int compareTo(User2 o) { //������ ���� ���� ������
		// TODO Auto-generated method stub
		//return getName().compareTo(o.getName()); //�̸� ��
		//return getAge() - o.getAge(); //���̼�
		//return o.getAge()-getAge(); //���̿��� 
		//return -(getAge() - o.getAge()); //���̿��� 2
		return -(getName().compareTo(o.getName())); //�̸� ����
	}

}
public class SetEx6 {
	public static void main(String[] args) {
		//Set<User> set = new HashSet<>();
		Set<User2> set = new TreeSet<>(); //��ü�� ��� ũ������� ������ �� ���⶧���� ��Ÿ�� ������ �߻��Ѵ�. //Comparable �������̽��� ������ Ŭ������ ���� �����ϴ�.
		//���� �����ϰ��� �ϸ� Comparable �������̽��� �������� 
		set.add(new User2("�ڹ�",10));
		set.add(new User2("������",17));
		set.add(new User2("��",8));
		
		for(User2 u : set) {
			System.out.println(u.getName()+":"+u.getAge());
		}
		
		
	}
}