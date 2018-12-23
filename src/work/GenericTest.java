package work;
class Element{
	public Element() {
		System.out.println("새로운 객체가 생성되었습니다.");
	}
}
class subElement extends Element{
	public subElement(int n) {
		System.out.println(getClass().getSuperclass().getName()+"으로 부터 파생된 "+n+"번째 "+this.getClass().getName()+"입니다.");
	}
}
public class GenericTest <E extends Element>{
	Element source;
	public GenericTest(E source) {
		this.source = source;
		System.out.println(source.getClass().getName()+"을 위한 "+this.getClass().getName()+"을 만듭니다.");
	}
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			GenericTest<Element> gt = new GenericTest<Element>(new subElement(i));
		}
	}
}
