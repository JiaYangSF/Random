package practice;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] numbers1 = {8,4,6};//;3,7,90,45};
//		int[] numbers2 = {8,4,6,3,7,90,45};
//		int[] numbers3 = {-1,4,6,3,7,90,45};
//		int[] numbers4 = null;
		mergeSort(numbers1);
		System.out.println(Arrays.toString(numbers1));
	}

	private static void mergeSort(int[] numbers) {
		mergeSort(numbers, 0, numbers.length-1, new int[numbers.length]);
		
	}

	private static void mergeSort(int[] numbers, int leftStart, int rightEnd, int[] temp) {
		if(leftStart>=rightEnd) return;
		int middle = (leftStart+rightEnd)/2;
		mergeSort(numbers, leftStart, middle, temp);
		mergeSort(numbers, middle+1, rightEnd, temp);
		merge(numbers, leftStart, rightEnd, temp);
		
	}

	private static void merge(int[] numbers, int leftStart, int rightEnd, int[] temp) {
		int left = leftStart;
		int leftEnd = (leftStart+rightEnd)/2;
		int rightStart = leftEnd+1;
		int right = rightStart;
		
		int index = leftStart;
		int size = rightEnd-leftStart+1;
		
		while(left<=leftEnd && right<=rightEnd) {
			if(numbers[left]<=numbers[right]) {
				temp[index]=numbers[left];
				left++;
			}else {
				temp[index]=numbers[right];
				right++;
			}
			index++;
			
		}
			System.arraycopy(numbers, left, temp, index, leftEnd-left+1);
			System.arraycopy(numbers, right, temp, index, rightEnd-right+1);
			System.arraycopy(temp, leftStart, numbers, leftStart, size);
		
		
		
	}

}
