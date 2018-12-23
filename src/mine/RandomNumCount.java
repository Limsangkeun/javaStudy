package mine;

public class RandomNumCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numCount[] = new int[10];
		int num;
		for(int i=1; i<=100; i++) {
			num = (int)(Math.random()*10)+1;
			numCount[num-1]++;
			System.out.printf("%3d",num);
			if((i%10)==0) {
				System.out.println();
			}
		}	
			for(int i=0; i<numCount.length; i++) {
				System.out.println((i+1)+" : "+numCount[i]);
			}
	}
}
