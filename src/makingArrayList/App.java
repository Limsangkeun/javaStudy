package makingArrayList;

import java.util.Iterator;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyList<String> list = new MyArrayList<>();
		
		//�������� ������ �����ϱ�
		list.add("����");
		list.add("�λ�");
		list.add("��õ");
		list.add("���");
		list.add("���");
		list.add("����");
		list.add("��õ");
		list.add("����");
		list.add("�������ý���");
		list.add("�����Ʈ");
		/*
		//Ư�� ��ġ�� ������ ��������
		System.out.println(list.get(1));
		
		//Ư�� ��ġ�� ������ �����ϱ�
		list.add(2,"�뱸");
		System.out.println("��ü -1....");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		list.remove("�������ý���");
		String s = list.set(0, "seoul");
		System.out.println(s);
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		
		System.out.println(list);
		*/
		System.out.println(list.size());
		MyIterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
