package inheritance;

import java.text.SimpleDateFormat;
import java.util.Date;

class Person{
	String name;
	int age;
	String job;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.job = "No";
	}
}
class Student extends Person{
	public Student(String name, int age) {
		super(name,age);
		super.job = "Student";
	}
}
class Worker extends Person{
	public Worker(String name, int age) {
		super(name,age);
		super.job = "Worker";
	}
}

class Run{
	public void getJob(Person p) {
		if(p instanceof Student) {
			System.out.println(((Student)p).job);
		}else if(p instanceof Worker){
			System.out.println(((Worker)p).job);
		}else {
			System.out.println(p.job);
		}
	}
}
public class MyReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Run().getJob(new Student("sangkeun",25));
		new Run().getJob(new Worker("sangkeun",25));
		new Run().getJob(new Person("sangkeun",25));
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		Date date = new Date();
		System.out.println(sdf.format(date));
	}

}
