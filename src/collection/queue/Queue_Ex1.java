package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> qu = new LinkedList<>();
		
		qu.offer("����"); //������ �߰�
		qu.offer("�λ�");
		qu.offer("��õ");
		qu.offer("�뱸");
		System.out.println(qu);
		
		while(qu.peek()!=null) { //peek() : head ��Ҹ� ��ȯ�ϰ� �������� ����
			String s = qu.poll();//poll() : head ��Ҹ� ��ȯ�ϰ� ����
			System.out.println(s);
		}
		System.out.println(qu);
	}

}
