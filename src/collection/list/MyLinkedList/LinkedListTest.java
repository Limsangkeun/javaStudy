package collection.list.MyLinkedList;

import java.util.Iterator;
class sangkeun{
	String test;
	String name;
	public sangkeun(String test, String name) {
		this.test = test;
		this.name = name;
	}
}
public class LinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new sangkeun("123","456").equals(new sangkeun("123","456")));
		
		/*MyLinkedListImpl<String> list = new MyLinkedListImpl<>();
		list.add("sangkeun0");
		list.add("sangkeun1");
		list.add("sangkeun2");
		list.add("sangkeun3");
		list.add("sangkeun4");
		
		list.add(2, "sangkeun1-2");
		list.addFirst("sangkeunStart");
		list.set(6, "Changed");
		//list.remove(3);
		//list.removeFirst();
		//list.removeLast();
		list.clear();
		MyIterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}*/
	}
}
