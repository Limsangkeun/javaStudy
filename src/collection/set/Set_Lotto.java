package collection.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set_Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���Լ����� �������� ����, �ߺ��� ������� ����
		Set<Integer> set = new TreeSet<>();
		//�����ؼ� ����ϰ� ������ TreeSet
		//�׳� ����ϰ� ������ HashSet
		
		while(set.size()!=6) {
			set.add((int)(Math.random()*45)+1);
		}
		System.out.println(set);
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			int s = it.next();
			System.out.print(s+" ");
		}
		
		
	}

}
