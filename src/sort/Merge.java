package sort;

import java.util.Arrays;

public class Merge {
	public static void main(String[] args) {
		int[] list = {3,2,6,4,8,5};
		merge(list);
		System.out.println(Arrays.toString(list));
	}
	public static void merge(int[] arr) {
	 mergeSort(arr, new int[arr.length], 0, arr.length-1);
	}

	private static void mergeSort(int[] arr, int[] temp, int leftStart, int rightEnd) {
		if(leftStart>=rightEnd) {
			return;
		}
		int middle = (leftStart+rightEnd)/2;
		mergeSort(arr, temp, leftStart, middle);
		mergeSort(arr, temp, middle+1, rightEnd);
		mergeAll(arr, temp, leftStart, rightEnd);
		
		
	}

	private static void mergeAll(int[] arr, int[] temp, int leftStart, int rightEnd) {
		int leftEnd = (rightEnd+leftStart)/2;
		int rightStart = leftEnd+1;
		int size = rightEnd-leftStart+1;
		
		// create pointer;
		int left = leftStart;
		int right = rightStart;
		int index = leftStart;
		
		while(left<=leftEnd && right <=rightEnd) {
			if(arr[left]<arr[right]) {
				temp[index]=arr[left];
				index++;
			}else {
				temp[index]=arr[right];
				right++;
			}
			index++;
		}
		
		System.arraycopy(arr, leftStart, temp, index, leftEnd-left +1);
		System.arraycopy(arr, rightStart, temp, index, rightEnd-right +1);
		System.arraycopy(temp, leftStart, arr, leftStart, size);
		
	}

}
