package work;

public class ArrayP6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[][] = new char[4][4];
		
		//continue gogo:
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[i][j] = (char)((Math.random()*26)+'A');
			/*	for(char k : arr) {
					if(n==k) {
						i--;
						continue gogo;
					}
				}*/
			}
		}
		
	}

}
