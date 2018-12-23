package mine;

public class ForEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =0;
		for(int i=1; i<=100; i++) {
			sum+=i;
			if(i%10==0) {
				System.out.printf("%3d ~ %3d 까지의 합 = %3d\n",(i-9),i,sum);
				sum =0;
			}
		}
	}

}
