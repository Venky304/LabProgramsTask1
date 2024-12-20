package com.task.dec19;

import java.util.Scanner;

public class AverageArray_9 {
	
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
	public static void averageArray(int[] arr) {
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		int avg = sum/arr.length;
		System.out.println("Average of the array: "+avg);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] result = arrayCreation(sc);
		averageArray(result);
		sc.close();
	}
}
