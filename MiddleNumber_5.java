package com.task.dec19;

import java.util.Scanner;

public class MiddleNumber_5 {
	
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
	
	public static void middleNum(int[] arr) {
		int start = 0;
		int end = arr.length-1;
		int mid = start+(end-start)/2;
		if(arr.length%2!=0)
		System.out.println("The Middle elements is : "+arr[mid]);
		else
		System.out.println("The Middle elements are: "+arr[mid]+" and "+arr[mid+1]);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] result = arrayCreation(sc);
		middleNum(result);
		sc.close();
		
	}
}
