package method;

class Method{
	//1~n������ ��
	public int sum(int n) { //�Ű� �����̸鼭 ���ÿ� ���� ����
		int sum = 0; //���� ����
		for(int i=1; i<=n; i++) { 
			sum += i;
		}
		System.out.println(sum);
		return sum;  //��ȯ ��
	}
	
	public int max(int a,int b) {
		return a>b?a:b;
	}
	
	public boolean isEven(int a) {
		return a%2==0;
	}

	public void drawingTri(int n) { //�ﰢ�� �׸���
		for(int i=1; i<=n; i++) {			//������ ������ ȣ���� ������ ���ư���, ���� Ÿ���� void�� ��츸 ���� �����ϴ�.
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i*2-1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public char upper(char c) {
		return  c>='a'&&c<='z'?(char)(c-32):c;
		
	}
	
	//����
	public double grade(int s) {
		if(s>=95&&s<=100) {
			return 4.5;
		}else if(s>=90&&s<95) {
			return 4.0;
		}else if(s>=85&&s<90) {
			return 3.5;
		}else if(s>=80&&s<85) {
			return 3.0;
		}else if(s>=75&&s<80) {
			return 2.5;
		}else if(s>=70&&s<75) {
			return 2.0;
		}else if(s>=65&&s<70) {
			return 1.5;
		}else if(s>=60&&s<65) {
			return 1.0;
		}else {
			return 0;
		}
	}
	
	public String hakjeom(int s) {
		s /=10;
		String result;
		switch(s) {
		case 10:
			result = "��";
			break;
		case 9:
			result = "��";
			break;
		case 8:
			result = "��";
			break;
		case 7:
			result = "��";
			break;
		case 6:
			result = "��";
			break;
		default :
			result = "��";
			break;
		}
		return result;
	}
	
	public void printGugu(int num) {
		if(num<1||num>9) {
			System.exit(0);
		}
		for(int i=1; i<=9; i++) {
			System.out.println(num+"*"+i+"="+(num*i));
		}
	}
	
	
}

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method m = new Method();
		//System.out.println(m.sum(100));
		//System.out.println(m.isEven(100));
		//System.out.println(m.max(10, 5));
		//m.drawingTri(5); //void �޼��� ȣ�� //void�ƴϰ� �ٸ� ���� �̷� ���·� ȣ�� �����ϳ� ������� ���� �� ����.
		//System.out.println(m.upper('d'));
		//System.out.println(m.grade(65));
		//System.out.println(m.hakjeom(49));
		m.printGugu(0);
		m.printGugu(2);
	}
	

}
