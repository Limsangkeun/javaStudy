package personal.hak;

class Apple implements Eatable, FoundObject{
	private String name;
	public Apple(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat some "+getName());
	}
	
}

class Grape implements Eatable, FoundObject{
	private String name;
	public Grape(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("eat some "+getName());
	}
	
}

class Stone implements FoundObject{
	private String name;
	public Stone(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}
public class UserApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FoundObject object[] = new FoundObject[3];
		object[0] = new Apple("apple");
		object[1] = new Grape("Grape");
		object[2] = new Stone("Stone");
		
		for(int i=0; i<object.length; i++) {
			if(object[i] instanceof Eatable) {
				((Eatable)object[i]).eat();
			}
		}
	}

}
