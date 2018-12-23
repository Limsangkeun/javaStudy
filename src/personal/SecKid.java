package personal;

public class SecKid extends Human{
	public int salary;
	public SecKid(String name, int age) {
		super.setName(name);
		super.setAge(age);
		salary = 10;
	}
	
	@Override
	public void work() {
		super.setBalance(super.getBalance()+salary);
	}
}
