import com.util.MyUtil;
import com.util.test.Test;

class Ex extends Test{
	public void set(String name, int Socre, int age) {
		this.name = name;
		this.score = score; //���� Ŭ������ 
		//this.age = age;//����
	}
}
public class MyApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyUtil util = new MyUtil();
		System.out.println(util.max(5, 10));
		
		Test t = new Test("�ڹ�",100,20);
		System.out.println(t.name);
		//System.out.println(t.score); //�����߻� 
	}

}
