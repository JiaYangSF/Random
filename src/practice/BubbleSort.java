package practice;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] numbers1 = {8,4,6};//;3,7,90,45};
		int[] numbers2 = {8,4,6,3,7,90,45};
		int[] numbers3 = {-1,4,6,3,7,90,45};
		int[] numbers4 = null;
		bubbleSort(numbers2);
		System.out.println(Arrays.toString(numbers2));
		

	}

	private static void bubbleSort(int[] numbers1) {
		boolean isSorted=false;
		while(!isSorted) {
			isSorted=true;
			for(int i=0; i<numbers1.length-1; i++) {
				if(numbers1[i]>numbers1[i+1]) {
					swap(numbers1, i, i+1);
					isSorted=false;				
				}				
			}
		}
	}

	private static void swap(int[] numbers1, int i, int j) {
		int temp = numbers1[i];
		numbers1[i]=numbers1[j];
		numbers1[j]=temp;
		
	}

}
