package method;
class Person{
	Account account;
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name; this.age = age;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
}
class Account{
	Person owner;
	int balance;
	public Account(int balance) {
		this.balance = balance;
	}
	public void setOwner(Person p) {
		this.owner = p;
	}
	public int sendMoney(int money) {
		balance -= money;
		return money;
	}
	public void receiveMoney(int money) {
		balance += money;
	}
}
public class MyEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("임상근",25);
		Person p2 = new Person("이동건",26);
		Account a1 = new Account(10000);
		Account a2 = new Account(10000);
		p1.setAccount(a1);
		p2.setAccount(a2);
		a1.setOwner(p1);
		a2.setOwner(p2);
		
		System.out.println(p1.name+","+p1.age+","+p1.account.balance);
		System.out.println(p2.name+","+p2.age+","+p2.account.balance);

		p2.account.receiveMoney(p1.account.sendMoney(1000));
		
		System.out.println(p1.name+","+p1.age+","+p1.account.balance);
		System.out.println(p2.name+","+p2.age+","+p2.account.balance);
		
	}

}
