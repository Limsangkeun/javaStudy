package collection.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set_Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//삽입순서를 유지하지 않음, 중복을 허용하지 않음
		Set<Integer> set = new TreeSet<>();
		//정렬해서 출력하고 싶으면 TreeSet
		//그냥 출력하고 싶으면 HashSet
		
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
