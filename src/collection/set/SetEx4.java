package collection.set;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<>();
		set.add("�ڹ�");
		set.add("�ȵ���̵�");
		set.add("HTML");
		set.add("CSS");
		set.add("�ϵ�");
		set.add("����DB");
		set.add("����Ŭ");
		set.add("MS-SQL");
		set.add("MYSQL");
		set.add("�ڹٽ�ũ��Ʈ");
		set.add("node.JS");
		set.add("����");
		set.add("JSP");
		set.add("C");
		set.add("C++");
		set.add("OPEN-GL");

		System.out.println(set);
		
		//How to Set->List
		List<String> list = new LinkedList<>(set);
		System.out.println(list);
		list.addAll(set);
		System.out.println(list);
	}

}
