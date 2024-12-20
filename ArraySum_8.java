package com.task.dec19;

import java.util.Scanner;

public class ArraySum_8 {
	
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
	
	public static void arraySum(int[] arr) {
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		System.out.print("Sum of array elements: "+sum);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] result = arrayCreation(sc);
		arraySum(result);
		sc.close();
	}
}
