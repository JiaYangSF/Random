package hackerrank;

public class MinimumAbsDifference {
	
	/*given two array, find out the minimum value of Abs diffs between element*/

	public static void main(String[] args) {
		int[] list = {-2,2,4, 3};
		System.out.println(findMinimumAbs(list));

	}
	
	public static int findMinimumAbs(int[] array) {//1,4,5
		//-2,2,4 -->2
		if(array == null) throw new NullPointerException();
		int result=Math.abs(array[0]-array[1]);
		for (int i = 1; i < array.length-1; i++) {
			int abs=Math.abs(array[i]-array[i+1]);
			if(abs<result) {
				result=abs;
			}
		}
		return result;
		
	}

}
