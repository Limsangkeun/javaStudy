package commandArgument;

//java ArgTest p1 p2 p3 ....
public class ArgTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("명령행 인수 개수 : "+args.length);
		//args[0] == p1 args[1] ==p2 ....
		for(String s : args) {
			System.out.println(s);
		}
	}

}
