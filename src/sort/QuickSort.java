package sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] numbers1 = {8,4,6, 9};//;3,7,90,45};
//		int[] numbers2 = {8,4,6,3,7,90,45};
		int[] numbers3 = {4,6,3,7, 90};//45};
//		int[] numbers4 = null;
		quickSrot(numbers1);
		System.out.println(Arrays.toString(numbers1));
		

	}
	
	public static void quickSrot(int[] arr) {
		quickSort(arr, 0, arr.length-1);
	}
	
	public static void quickSort(int[] arr, int left, int right) {
		if(left >= right) return;
		int pivot = arr[(left+right)/2];// pick the VALUE to compare with
		int index = partition(arr, left, right, pivot);
		quickSort(arr, left, index-1);
		quickSort(arr, index, right);
	}

	private static int partition(int[] arr, int left, int right, int pivot) {
		while(left<=right) {
			while(arr[left] < pivot) {
				left++;
			}
			
			while(arr[right]>pivot) {
				right--;
			}
			
			if(left<right) {
				swap(arr, left, right);
				left++;
				right--;
			}
			
		}		
		
		return left;
	}

	private static void swap(int[] arr, int left, int right) {
		int temp = arr[left];
		arr[left]=arr[right];
		arr[right] = temp;
		
	}

}
