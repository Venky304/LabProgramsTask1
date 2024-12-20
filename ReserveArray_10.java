package com.task.dec19;

import java.util.Scanner;

public class ReserveArray_10 {
	
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
	
	public static void reserveOrder(int[] arr) {
		System.out.print("Array in reverse order: ");
		for(int i = arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] result = arrayCreation(sc);
		reserveOrder(result);
		sc.close();
	}
}
