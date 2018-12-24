package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//List ����Ŭ���� : ArrayList, LinkedList, Vector
		List<String> list = new ArrayList<>(); //��ĳ����
		
		list.add("����");
		list.add("�λ�");
		list.add("�뱸");
		list.add("��õ");
		list.add("����");
		list.add("����");
		list.add("���");
		list.add("����"); //�ߺ� ���
		
		System.out.println(list);
		System.out.println("��ü ������ ���� : "+list.size());
		System.out.println("ó�� : "+list.get(0));
		System.out.println("������ : "+list.get(list.size()-1));
		
		//ó���� �ѱ� �߰���
		list.add(0, "�ѱ�");
		System.out.println(list);
		
		//ó�� �����͸� ���ѹα����� ����
		list.set(0, "���ѹα�");
		System.out.println(list);
		
		//����Ʈ �ȿ� ������ �ִ°� Ȯ��
		if(list.contains("����"))
			System.out.println("������ �����մϴ�."); //�̰� �ּҷ� ã�°ų� ��������
		
		//�λ��� ���° �ε����� �ִ��� Ȯ��
		System.out.println(list.size()+"���� ������ �� "+list.indexOf("�λ�")); //�������� ������ -1
		
		//���ѹα� ����
		//list.remove("���ѹα�"); 
		list.remove(0); //�� �� �ϳ� ���
		
		//����ϱ�
		System.out.println("��ü ���-1");
		for(String s : list) { //jdk 5.0 �̻� ��� ����
			System.out.print(s+" ");
		}
		System.out.println("��ü ���-2");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)+" ");
		}
		System.out.println("��ü ���-3 using iterator" ); //Map���� ���� ���
		Iterator<String> it = list.iterator(); //Iterator == �ݺ���. �����͸� ó������ ������ ��ȸ�ϸ鼭 �ϳ��� ������ ���°���.
		
		while(it.hasNext()) { //�����Ͱ� �����ϸ� True �����Ͱ� ������ False 
			System.out.print(it.next()+" ");//�����͸� �������� �������� �̵�
		}
		System.out.println();
		while(it.hasNext()) { //�����Ͱ� �����ϸ� True �����Ͱ� ������ False 
			System.out.print(it.next()+" ");//�����͸� �������� �������� �̵�
		}
		System.out.println("��ü ���-4");
		ListIterator<String> it2 = list.listIterator(); //Vector������ �������� ����. �������ε� ��°���(�׳� Iterator�� �Ұ�)
		while(it2.hasNext()) {
			String s = it2.next();
			System.out.print(s+" ");
		}
		System.out.println();
		//���� ��ü ������� ���� ListIterator��  ������ ���ֱ⶧���� ���� ����� �����Ѱ��̴�. �ƴϸ� �������� �����Ƿ� ��µ��� �ʴ´�.
		System.out.println("���� ���-1");
		while(it2.hasPrevious()) {
			System.out.print(it2.previous()+" ");
		}
		System.out.println();
		
		System.out.println("���� ���-2");
		for(int i=list.size()-1; i>=0; i--) {
			System.out.print(list.get(i)+" ");
		}
	}

}
