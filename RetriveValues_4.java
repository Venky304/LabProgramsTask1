package com.task.dec19;

import java.util.Scanner;

public class RetriveValues_4 {
	public static void indexValue(int[] arr,Scanner sc) {
		
		System.out.print("Enter the index number: ");
		int num = sc.nextInt();
		System.out.print("The Element at index "+num+" is "+arr[num]);
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {100,200,300,400,500};
		indexValue(arr,sc);
		sc.close();
	}
}
