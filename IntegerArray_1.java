package com.task.dec19;

public class IntegerArray_1 {
	public static void printArray(int[] arr) {
		System.out.print("Array elements are: ");
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		printArray(arr);
	}
}
