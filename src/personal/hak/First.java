package personal.hak;

public class First implements Runner{

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("working");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("walking");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eating");
	}

	@Override
	public void Run() {
		// TODO Auto-generated method stub
		System.out.println("running");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First f = new First();
		f.Run();
		Animal a = new Animal() {
			
			@Override
			public void walk() {
				// TODO Auto-generated method stub
				System.out.println("walking...");
			}
			
			@Override
			public void eat() {
				// TODO Auto-generated method stub
				System.out.println("eating...");
			}
		};
		a.eat();
		a.walk();
		
		Animal ani = new First();
		((Runner)((Person)ani)).Run();
	}

}
