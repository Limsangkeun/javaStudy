package collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//삽입된 순서를 유지. 중복을 허용하지 않음.
		Set<String> set = new LinkedHashSet<>();
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
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.print(s+" ");
		}
		System.out.println();
	}

}
