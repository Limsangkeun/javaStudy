package collection.set;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<>();
		set.add("자바");
		set.add("안드로이드");
		set.add("HTML");
		set.add("CSS");
		set.add("하둡");
		set.add("몽고DB");
		set.add("오라클");
		set.add("MS-SQL");
		set.add("MYSQL");
		set.add("자바스크립트");
		set.add("node.JS");
		set.add("서블릿");
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
