package api;

import java.text.NumberFormat;

public class NumberFormat_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = 3.141592;
		String a,b;
		
		NumberFormat nf = NumberFormat.getInstance();
		a = nf.format(d); //���� �˾Ƽ� �Ҽ��� �ڸ� ����
		System.out.println(a);
		nf.setMaximumFractionDigits(4); //�Ҽ��� ���� �ڸ����� �ִ� 4�ڸ�
		nf.setMinimumFractionDigits(2); //�Ҽ��� ���� �ڸ����� �ּ� 2�ڸ�
		a=nf.format(d);
		b=nf.format(123);
		System.out.println(a);
		System.out.println(b);
		
		NumberFormat nf2 = NumberFormat.getInstance();
		a = nf2.format(1234567.8956); //�˾Ƽ� ���ڸ����� �޸� �����
		System.out.println(a);
	}

}
