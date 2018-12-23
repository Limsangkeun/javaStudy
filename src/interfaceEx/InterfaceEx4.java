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
		return "사과";
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
	//인터페이스,추상,상속을 이용하여 여러번 작성해야하는 메서드를 한번에 작성 가능하다.
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
