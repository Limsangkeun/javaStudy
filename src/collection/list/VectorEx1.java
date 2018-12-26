package collection.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorEx1 {
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		//list �������̽��� ������ �޼����� ���� < Vector�� �޼��� ����
		System.out.println("������ �뷮 : "+v.capacity()); //10
		
		v.add("�ڹ�");
		v.add("�ȵ���̵�");
		v.add("HTML");
		v.add("CSS");
		v.add("�ϵ�");
		v.add("����DB");
		v.add("����Ŭ");
		v.add("MS-SQL");
		v.add("MYSQL");
		v.add("�ڹٽ�ũ��Ʈ");
		v.add("node.JS");
		v.add("����");
		v.add("JSP");
		v.add("C");
		v.add("C++");
		v.add("OPEN-GL");
		System.out.println("������ �뷮 : "+v.capacity()); //16
		
		//!�뷮�� ������� �ٸ���!!! //�뷮�� ������ �մ� �׸��� ũ��� //������� ���� ������ �ִ� ����
		System.out.println("ó�� : " + v.get(0));//�̰� ����� �� //�̰� �ִµ� ���� Vector�� �޼��带 �ܿ��� ����� �ʿ䰡 ����.
		System.out.println("ó�� : " + v.firstElement()); //�̰� �¸� Vector�� ��
		System.out.println("������ : " + v.get(v.size()-1));//�̰� ����� �� //�̰� �ִµ� ���� Vector�� �޼��带 �ܿ��� ����� �ʿ䰡 ����.
		System.out.println("������ : " + v.lastElement()); //�̰� �¸� Vector�� ��
		v.set(0, "JAVA");
		System.out.println(v);
		
		v.add(1, "FrameWork");
		System.out.println(v);
		
		//������ ��
		Collections.sort(v);
		System.out.println(v);
		//�����˻�//�ϳ��� ���ذ��鼭 ã�� ���
		//���̳ʸ� �˻� //���ĵ� ���¿��� �ݾ� �ٿ������鼭 �˻��ϴ� ���
		//�����ؾ� �ϹǷ� �����Ͱ� ���� ��츸 ���̳ʸ� �˻��� ����
		int n = Collections.binarySearch(v, "����Ŭ");
		//�ݵ�� �������� ���ĵǾ��־���Ѵ�.
		if(n!=-1)
			System.out.println("����Ŭ : "+n+" �ε����� ����");
		
		//�������� ����
		Collections.sort(v, Collections.reverseOrder());
		System.out.println(v);
	
		v.clear();//��λ���
		System.out.println(v.size()+":"+v.capacity()); //������ : �뷮
		//�뷮�� ũ�⸦ ���纸�� //������ ������ ����
		v.add("java");
		v.trimToSize();
		System.out.println(v.size()+":"+v.capacity()); //������ : �뷮 1:1�� ��������.
		
		
	}
}
