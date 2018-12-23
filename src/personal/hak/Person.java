package personal.hak;

interface Animal{
	public void walk();
	public void eat();
}
interface Person extends Animal {
	public void work();
}
interface Runner extends Person{
	public void Run();
}


