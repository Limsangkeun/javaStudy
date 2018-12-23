package api;

public class Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "sangkeun";
		String b = "sangkeun";
		String c = new String("sangkeun");
		
		System.out.println(a==b);
		System.out.println(a.toString() == b.toString());
		System.out.println(a.hashCode()==b.hashCode());
		System.out.println(a==c);
		System.out.println(a.toString() == c.toString());
		System.out.println(a.hashCode()==c.hashCode());
		System.out.println(a==c);
		System.out.println(a.equals("sangkeun"));
		int d = 30;
		int e = 30;
		System.out.println(d==e);
		
		System.out.println();
		//System.out.println(d == e.toString());
		//System.out.println(d.hashCode()==e.hashCode());
	}

}
