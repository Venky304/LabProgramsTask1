package com.task.dec19;

import java.util.Scanner;

public class DynamicalArray_2 {
	
	public static int[] arrayCreation(Scanner sc) {
		
		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter "+size+" Elements: ");
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		return arr;
	}
	
	public static void printArray(int[] arr) {
		System.out.print("Array elements are: ");
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] result = arrayCreation(sc);
		printArray(result);
		int[] result2 = arrayCreation(sc);
		printArray(result2);
		sc.close();
		
	}
}
