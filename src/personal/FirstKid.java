package personal;

import java.util.Random;

public class FirstKid extends Human{
	public FirstKid(String name, int age) {
		super.setName(name);
		super.setAge(age);
	}
	
	@Override
	public void work() {
		Random rand = new Random();
		int x = rand.nextInt(2000)-1000;
		super.setBalance(super.getBalance()+x);
	}
}
