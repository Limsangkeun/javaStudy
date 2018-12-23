package work;


public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] ={25,15,7,4,12,9,17,16,20,13};
		int a = 1, temp;
		
		for(int i = 0; i < arr.length -1; i++) {
			for(int j = i+1; j > 0; j--) {
				if(arr[j]<arr[j-1]) {
					temp=arr[j]; 
					arr[j]=arr[j-1]; 
					arr[j-1]=temp;
				}
			}
			System.out.print(a+"¹ø ½ÎÀÌÅ¬ : ");
			a++;
			for(int n : arr)
				System.out.print(n + "  ");
			
			System.out.println();

		}

	}
	}


