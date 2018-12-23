package interfaceEx;

import java.text.NumberFormat;

interface Fruit {
	String getName();
	int getPrice();
	
}

class Apple implements Fruit{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "���";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 1000;
	}
	
}

class Orange implements Fruit{

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Orange";
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 2000;
	}
	
}

public class InterfaceEx4 {
	//�������̽�,�߻�,����� �̿��Ͽ� ������ �ۼ��ؾ��ϴ� �޼��带 �ѹ��� �ۼ� �����ϴ�.
	public static void packing(Fruit f) {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(f.getName()+":"+nf.format(f.getPrice()));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		packing(new Apple());
		packing(new Orange());
	}

}
