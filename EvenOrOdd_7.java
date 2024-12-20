package com.task.dec19;

import java.util.Scanner;

public class EvenOrOdd_7 {
	
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

	public static void even(int[] arr) {
		System.out.print("Even elements are: ");
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	
	public static void odd(int[] arr) {
		System.out.print("Odd elements are: ");
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] result = arrayCreation(sc);
		even(result);
		odd(result);
		sc.close();
	}
}
