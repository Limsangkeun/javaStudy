package work;
class Element{
	public Element() {
		System.out.println("���ο� ��ü�� �����Ǿ����ϴ�.");
	}
}
class subElement extends Element{
	public subElement(int n) {
		System.out.println(getClass().getSuperclass().getName()+"���� ���� �Ļ��� "+n+"��° "+this.getClass().getName()+"�Դϴ�.");
	}
}
public class GenericTest <E extends Element>{
	Element source;
	public GenericTest(E source) {
		this.source = source;
		System.out.println(source.getClass().getName()+"�� ���� "+this.getClass().getName()+"�� ����ϴ�.");
	}
	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			GenericTest<Element> gt = new GenericTest<Element>(new subElement(i));
		}
	}
}
