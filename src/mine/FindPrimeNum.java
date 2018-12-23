package mine;

public class FindPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int countA =0;
		int countB =0;
		for(int i=2; i<=100; i++) {
			for(int j=2; j<=i; j++) {
				if(i%j==0) {
					countA++;
				}
			}
			if(countA<2) {
				countB++;
				System.out.printf("%2d\t",i);

				if(countB%10==0) {
					System.out.println();
				}
			}
			countA=0;

		}
		System.out.println();
		System.out.println("소수의 개수  = "+countB);
		
	}

}
