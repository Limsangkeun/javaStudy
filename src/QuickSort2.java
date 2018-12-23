import java.util.Arrays;

public class QuickSort2 {
	public static void quick(int[] arr, int start, int end) {
		if(start<end) {
			int q = div(arr,start,end);
			quick(arr,start,q-1);
			quick(arr,q+1,end);
		}
	}
	
	public static int div(int[] arr, int start, int end) {
		int pivot = arr[start];
		int low = start;
		int high = end+1;
		int temp;
		do {
			do {
				low++;
			}while(low<=start && arr[low]<pivot);
			do {
				high--;
			}while(high>=end && arr[high]>pivot);
			temp = arr[high];
			arr[high] = arr[low];
			arr[low] = temp;
		}while(start<end);
		temp = arr[high];
		arr[high] = arr[start];
		arr[start] = temp;
		return high;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,9,3,8,1,6,7,4,5,3,2,1,6,8,4,5};
		quick(arr,0,arr.length);
		Arrays.toString(arr);
	}

}
