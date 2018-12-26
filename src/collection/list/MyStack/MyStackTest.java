package collection.list.MyStack;

public class MyStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyStack<String> test = new MyStack<>();
		test.push("sangkeun1");
		test.push("sangkeun2");
		test.push("sangkeun3");
		test.push("sangkeun4");
		test.push("sangkeun5");
		test.push("sangkeun6");
		while(!test.isEmpty()) {
			String s = test.pop();
			System.out.println(s);
		}
	}

}
