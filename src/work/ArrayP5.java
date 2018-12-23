package work;

public class ArrayP5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[5][5];
		int a=1;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				//arr
			}
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				if(arr[i][j]==0)
					System.out.print("     ");
				else {
					System.out.printf("%5d",arr[i][j]);
				}
			}
			System.out.println();
		}
	}

}
