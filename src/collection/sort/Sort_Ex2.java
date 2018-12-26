package collection.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//���� �������� �����ϴ� ���
class Ex2{
	private String name;
	private int age;
	
	public Ex2() {
		
	}
	public Ex2(String name, int age) {
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
}

public class Sort_Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Ex2> list = new ArrayList<>();
		list.add(new Ex2("�ڹ�",50));
		list.add(new Ex2("�ȵ���̵�",8));
		list.add(new Ex2("��",40));
		list.add(new Ex2("������",50));
		list.add(new Ex2("��",50));
		
		//Comparator ���� ������ �����ؼ� �����Ҷ� ����ϴ� �������̽�
		Comparator<Ex2> comp = new Comparator<Ex2>() {
			@Override
			public int compare(Ex2 o1, Ex2 o2) {
				// TODO Auto-generated method stub
				return o1.getName().compareTo(o2.getName());
			}
			
		};
		Collections.sort(list, comp);
		for(Ex2 e : list) {
			System.out.print(e.getName()+":"+e.getAge()+" ");
		}
		System.out.println();
		Comparator<Ex2> comp2 = new Comparator<Ex2>() {
			@Override
			public int compare(Ex2 o1, Ex2 o2) {
				// TODO Auto-generated method stub
				return o1.getAge() - o2.getAge();
			}
			
		};
		Collections.sort(list, comp2);
		
	/*	Collections.sort(list, new Comparator<Ex2>() {
		
			@Override
			public int compare(Ex2 o1, Ex2 o2) {
				// TODO Auto-generated method stub
				return o1.getAge() - o2.getAge();
			}
			
		});*/  
		
		for(Ex2 e : list) {
			System.out.print(e.getName()+":"+e.getAge()+" ");
		}
		
	}

}
