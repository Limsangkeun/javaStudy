package personal;

public class Human {
	private String name;
	private int age;
	private int balance;
	
	public Human() {
		balance=10000;
	}
	public void work() {
		
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getBalance() {
		return balance;
	}


}
