package work;

class Sang{
	String name;
	private Sang() {
		name = "sangkeun";
	}
	public static Sang createClass() {
		Sang s = new Sang();
		return s;
	}
}
public class Some {
	
	public static void main(String[] args) {
		Sang s = Sang.createClass();
	}
}
