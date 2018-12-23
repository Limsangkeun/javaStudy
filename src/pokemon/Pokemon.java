package pokemon;

import java.util.Random;

public abstract class Pokemon implements Animal{
	private String name;
	private int power;
	private int hp;
	private int speed;
	private int x,y;
	private Person owner;
	
	public Pokemon(String name, int power, int hp, int speed, Person owner) {
		this.name = name;
		this.power = power;
		this.hp = hp;
		this.speed = speed;
		this.owner = owner;
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		Random rand = new Random();
		x = x + rand.nextInt(2*speed)-speed;
		y = y + rand.nextInt(2*speed)-speed;
	}
	@Override
	public void fight() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hurt(int power) {
		hp -= power;
	}
	public String getPosition() {
		return "["+x+","+y+"]";
	}
	
}
