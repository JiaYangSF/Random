package sort;

import java.util.Arrays;

public class bubble {
	
	public static void main(String[] args) {
		int[] numbers1 = {8,4,6};//;3,7,90,45};
		int[] numbers2 = {8,4,6,3,7,90,45};
		int[] numbers3 = {-1,4,6,3,7,90,45};
		int[] numbers4 = null;
		System.out.println(Arrays.toString(bubbleSort(numbers1)));
//		System.out.println(Arrays.toString(bubbleSort(numbers2)));
//		System.out.println(Arrays.toString(bubbleSort(numbers3)));
//		System.out.println(Arrays.toString(bubbleSort(numbers4)));
	}

	private static int[] bubbleSort(int[] numbers) {
		// TODO Auto-generated method stub
		if(numbers == null) throw new NullPointerException("Arr is null");
		boolean isSorted=false;
		while(!isSorted) {
			isSorted=true;
			for(int i=0; i<numbers.length-1; i++) {
				if(numbers[i]>numbers[i+1]) {
					swap(numbers, i, i+1);
					isSorted=false;
				}
		}
		
			}
			return numbers;
		}


	private static void swap(int[] list, int i, int j) {
		int temp;
		temp = list[i];
		list[i]=list[j];
		list[j]=temp;
		
	}
	

}
