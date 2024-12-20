package com.task.dec19;

import java.util.Scanner;

public class LastAndFirstAdd_6 {
	
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
	
	public static void addition(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		int add = arr[start]+arr[end];
		System.out.print("The Addition of first and last element: "+add);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] result = arrayCreation(sc);
		addition(result);
		sc.close();
	}
}
