package inheritance;

class ObjectTest{
	private Object list[];
	
	public ObjectTest() {
		list = new Object[3];
	}
	
	public void print() {
		for(int i=0; i<list.length; i++) {
			if(list[i] instanceof Integer) {
				System.out.println(list[i]);
			}else if(list[i] instanceof String) {
				System.out.println(list[i]);
			}else if(list[i] instanceof Double) {
				System.out.println(list[i]);
			}
			
		}
	}
	public Object[] getList() {
		return list;
	}
}
class ForTest extends ObjectTest{
	public ForTest() {
		input();
	}
	public void input() {
		super.getList()[0] = 3;
		super.getList()[1] = "sangkeun";
		super.getList()[2] = 3.14;
		super.print();
	}
}
public class ArrayOfObject{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ForTest();
	}

}
