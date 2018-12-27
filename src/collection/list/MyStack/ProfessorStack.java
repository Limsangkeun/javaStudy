package collection.list.MyStack;

public class ProfessorStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProfessorStackImpl<String> stack = new ProfessorStackImpl<>(10);
		stack.push("sangkeun1");
		stack.push("sangkeun2");
		stack.push("sangkeun3");
		stack.push("sangkeun4");
		stack.push("sangkeun5");
		stack.push("sangkeun6");
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}
