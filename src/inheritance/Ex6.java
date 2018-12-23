package inheritance;

class Test9{
	String name;
	int score;
	
	public Test9() {
		
	}
	public Test9(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public void print() {
		System.out.println(name+":"+score);
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//System.out.println(obj.name);
		//String s = (Test9)obj.name; // 괄호보다 .이 우선순위가 높아 obj.name을 Test9을 캐스팅하는 형태가 되는데 이는 활용할 수 없는 형태가 되므로 컴파일 에러가 발생한다.
		//비록 obj는 Test9을 나타내고 있지만, 컴파일러는 컴파일 단계에서 Object 클래스의 필드를 본다. 그래서 바로 Test9의 필드를 쓸 수 없다.
		
		//obj.name을 활용하고 싶은경우
		//((Test9)obj).name; 형태로 사용해야한다.
		// name => this.name
		if(obj instanceof Test9) {
			Test9 temp = (Test9)obj;
			return ((this.name.equals(temp.name) && this.score==temp.score));
		}
		return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+":"+score;
	}
}


public class Ex6 {
	//Overriding & casting
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test9 t1 = new Test9("java",80);
		Test9 t2 = new Test9("java",80);
		System.out.println(t1==t2); //false.주소 비교
		System.out.println(t1.equals(t2)); //false.주소 비교
		//클래스명@해시코드
		System.out.println(t1); //t1 == t1.toString();
		System.out.println(t1.toString());
	}

}
