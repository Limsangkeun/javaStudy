package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// List ����Ŭ���� : ArrayList, LinkedList, Vector
		List<String> list = new ArrayList<>(); // ��ĳ����

		list.add("����");
		list.add("�λ�");
		list.add("�뱸");
		list.add("��õ");
		list.add("����");
		list.add("����");
		list.add("���");
		list.add("����");
		
		List<String> list2 = new ArrayList<>();
		list2.add("���");
		list2.add("����");
		list2.add("��û");
		list2.add("����");
		list2.add("���");
		list2.add("����");
		
		list.addAll(list2); //list�� list2 �����͸� ��� �߰�
		System.out.println(list);
		
		//����Ʈ to �迭
		
		String array[] = list.toArray(new String[list.size()]); //String �迭�� ����(list�� ũ���)
		
		for(String s : array) {
			System.out.print(s+" ");
		}
		System.out.println();
		
		//�迭 to List #1
		//List<String> list3 = new ArrayList<>(Arrays.asList(array));
		//�迭 to List #2
		List<String> list3 = Arrays.asList(array);
		System.out.println(list3);
		
		//subList(fromIndex, toIndex) : fromIndex ���� toIndex-1 ���� �߶� ����Ʈ�� ��ȯ //subString ����� ����
		List<String> list4 = list.subList(2, 5);
		System.out.println(list4);
		
		//clear.. index 2~4 ���� �����
		list.subList(2, 5).clear(); //�� ����Ʈ���� ���� ����Ʈ ��ŭ �����ض�
		System.out.println(list);
		
		//list2 ��� �����
		list2.clear();
		System.out.println("list2�� �ƹ��͵� ���� ? : " + list2.isEmpty());
		System.out.println("list2�� ������ ���� : " + list2.size());
		
		//
	}

}
