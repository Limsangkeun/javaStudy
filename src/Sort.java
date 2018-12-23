


public class Sort {
	public static int partition(int arr[], int left, int right) {
		int pivot = arr[left];
		int low = left;
		int high = right+1;
		int temp;
		do {
			do {
				low++;
			}while(arr[low]<pivot && low<right);
			do {
				high--;
			}while(arr[high]>pivot && high>left);
			if(low<high) {
				System.out.println(arr[high]+","+arr[low]);
				temp = arr[high];
				arr[high] = arr[low];
				arr[low] = temp;
			}
		}while(low<high);
		System.out.println(arr[high]+","+arr[low]);
		temp = arr[high];
		arr[high] = arr[left];
		arr[left] = temp;
		return high;
	}
	public static void quickSort(int arr[], int left, int right) {
		if(left<right) {
			int q = partition(arr,left,right);
			quickSort(arr,left,q-1);
			quickSort(arr,q+1,right);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,3,8,4,9,1,6,2,7};
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		quickSort(arr,0,arr.length-1);
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}

}
