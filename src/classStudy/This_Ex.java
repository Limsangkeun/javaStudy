package classStudy;
//this==호출한 객체 자기 자신을 나타내는 것 == this //필드와 메서드만 호출 가능
class Ex4{
	private String name;
	private int age;
	
	public Ex4() {}
	
	public Ex4(String name ,int age) {
		this.name =name;
		this.age = age;
	}
	
	public void write() {
		System.out.println(name+" : "+age);
	}
}
public class This_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex4 m = new Ex4("김자바",10);
		Ex4 m2 = new Ex4("이자바",15);
		
		m.write();
		m2.write();
	}

}
