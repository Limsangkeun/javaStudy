package classStudy;

class Test7 {
	// 인스턴스 변수는 주로 메서드로 접근해라
	private String name;
	private int age;

	public void print() {
		System.out.println(getName() + ":" + getAge());
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
	
}

public class GetSet {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test7 ob = new Test7();
		ob.setName("123");
		ob.setAge(25);
		ob.print();
	}
}
