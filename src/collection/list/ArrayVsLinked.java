package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayVsLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long s, e;
		s= System.nanoTime();
		for(int i=0; i<1000000; i++) {
			list.add("�׽�Ʈ : " + i);
		}
		e= System.nanoTime();
		System.out.println("�ɸ� �ð� : "+(e-s)/1000000);
		
		s= System.nanoTime();
		for(int i=0; i<1000000; i++) {
			list2.add("�׽�Ʈ : " + i);
		}
		e= System.nanoTime();
		System.out.println("�ɸ� �ð� : "+(e-s)/1000000);
	}

}
