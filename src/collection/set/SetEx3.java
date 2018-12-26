package collection.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//크기순으로 정렬. 중복을 허용하지 않음. //가나다순으로 정렬
		Set<String> set = new TreeSet<>();
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
