package api;

import java.util.Arrays;
import java.util.Collections;

public class Arrays_Ex {
	public static void print(String title,String ss[]) {
		System.out.println(title);
		
		for(String s : ss) {
			System.out.print(s+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		String ss[] = {"ȫ�浿", "���ڹ�", "���ڹ�", "������", "�̼���"};
		
		/*
		 * ���ڿ� �� 
		 * == : �ּҰ� ��
		 * String�� equals() : ����
		 * String�� compareTo() : ũ�� ��(ASCII �ڵ� ���� �� ����)
		 */
		
		print("����....",ss);
		Arrays.sort(ss);
		print("��������...",ss);
		Arrays.sort(ss,Collections.reverseOrder());
		print("��������...",ss);

		
		//Object : �ڹ��� �ֻ��� Ŭ���� => �ڹ��� ��� ��ü�� ���� �� �ִ�.
		//Object[] oo = {"����", new Integer(30), "�λ�", "�뱸", new Integer(5)};
		//Arrays.sort(oo); //���°� �ٸ��� ������ �� ����. //��Ÿ�� ����
		
		char c1[] = {'a','p','r','i','n','g'};
		char c2[] = Arrays.copyOf(c1, c1.length); 
	
		System.out.println(c1==c2);
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		
		char c3[] = Arrays.copyOfRange(c1, 1, 4); //���� ������ ���� from 1���� 4������
		System.out.println(Arrays.toString(c3));
		
		char c4[] = new char[c1.length];
		System.arraycopy(c1, 0, c4, 0, c1.length);
		System.out.println(Arrays.toString(c4));
		//arraycopy�� �޸� �Ҵ��� �ϰ� �ؾ��Ѵ�.
		
		int []a= {1,2,3};
		int []b= {1,2,3};
		int []c= {1,2,3,4,5};
		
		System.out.println(a==b); //�ּ�/false
		System.out.println(a.equals(b)); //�ּ�/false
		
		//����� �� ��
		System.out.println(Arrays.equals(a, b)); //true
		System.out.println(Arrays.equals(a, c)); //false
		
		int [][]aa = {{1,2,3},{4,5,6}};
		int [][]bb = {{1,2,3},{4,5,6}};
		
		System.out.println(Arrays.equals(aa,bb)); //false, ���� �� //2���� �迭������ 1�������� ������ �ִ� �ּ� ��
		
		System.out.println(Arrays.deepEquals(aa, bb)); //���� �� //���ο� ����ִ� �� üŷ
		
	}
}
