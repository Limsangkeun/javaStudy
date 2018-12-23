package method;

import java.util.Scanner;

public class Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num;
		String arr[] = new String[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = "-";
		}
		while(true) {
			System.out.println("1.push 2.pop 3.exit");
			num = sc.nextInt();
			if(num==3) break;
			
			if(num==1) {
				String value = sc.next();
				push(arr,value);
			}else if(num==2){
				pop(arr);
			}
			for(int i=arr.length-1; i>=0; i--) {
				System.out.println(arr[i]);
			}
		}
		System.exit(0);
	}
	public static void pop(String arr[]) {
		
		boolean isEmpty=true;
		for(int i=0; i<arr.length; i++) {
			if(!arr[i].equals("-")) {
				isEmpty = false;
			}
		}
		
		if(isEmpty)
		{
			System.out.println("스택이 비어있습니다.");
			return;
		}else {
			for(int i=0; i<arr.length; i++) {
				if(arr[i].equals("-")) {
					arr[i-1] = "-";
					return;
				}
				
			}
		}
	}
	public static void push(String arr[], String value) {
		boolean isFull = true;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("-")) {
				isFull = false;
			}
		}
		if(isFull){
			System.out.println("가득 차있습니다.");
			return;
		}else {
			for(int i=0; i<arr.length; i++) {
				if(arr[i].equals("-")) {
					arr[i] = value;
					return;
				}
			}
		}
		
	}

}
