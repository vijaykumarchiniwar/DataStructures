package com.learn.datastructues.sorting;

public class BubbleSort {

	public static void bubbleSort(int arr[]) {
		
		for(int i = 0 ; i < arr.length - 1;i++)
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j+1]) {
					swap(j, j+1, arr);
				}
			}
	}
	
	public static void swap(int j, int k, int arr[]){
		int temp = arr[j];
		arr[j] = arr[k];
		arr[k] = temp;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1, 0, 5, 9, 7};
		
		bubbleSort(arr);
		for(int i = 0 ; i < arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
