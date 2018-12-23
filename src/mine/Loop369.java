package mine;

public class Loop369 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=100; i++) {
			if((i%10)!=0 && (i%10)%3==0) {
				System.out.print("*\t");
			}else if((i/10)!=0 && (i/10)%3==0){
				System.out.print("*\t");
			}else {
				System.out.printf(i+"\t");
			}
			if(i%10==0) {
				System.out.println();
			}
		}
	}

}
