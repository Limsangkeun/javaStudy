package collection.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���Ե� ������ ����. �ߺ��� ������� ����.
		Set<String> set = new LinkedHashSet<>();
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
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.print(s+" ");
		}
		System.out.println();
	}

}
