package hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import sun.security.util.Length;

/*Sample Input

5 4
1 2 3 4 5
Sample Output

5 1 2 3 4
Explanation

When we perform  left rotations, the array undergoes the following sequence of changes:*/


public class LeftRotation {

	    // Complete the rotLeft function below. {1,2, 3, 4}, 1 {4, 1, 2, 3}
	    static int[] rotLeft(int[] a, int d) {
	    	if(a.length <1) throw new IllegalArgumentException("Array length is too small");
	    	if(a.equals(null)) throw new NullPointerException("Array is null");
	    	// move the last difit to the first digit
	    	// move the ith digit to i+1
	    	// to avoid override the digit, we need a place holder int temp;
	    	// the time of moving digit will == d
	    	
	    	//data structure -- array
	    	int size = a.length-1;
	    	int first=a[0];
	    	int last =a[size];
	    	int temp = last;

	    	for (int i = 0; i <= d; i++) {
				// move the last digit to first + d
	    		// mode the first and middle ones d digit
	    		
	    		a[i+1]=a[i];		
				
			}    	
	    	return null;

	    }
	    
	    static int[] rotLeftSolutuion(int[] a, int shiftAmount) {
	    	int lengthOfArr=a.length;
	    	for (int i = 0; i < a.length; i++) {
				int newLocation = (i+(lengthOfArr - shiftAmount))%lengthOfArr;
				//a[newLocation]=in.nextInt();
			}
	    	return null;
	    }
	    
	    static int[] rotLeftSolutuionWithArrayCopy(int[] a, int shiftAmount) {
	    	int length=a.length;
	    	int[] result = new int[length];
	    	
	    	// copy the rest to the first
	    	// copy the {1,2,3,4,5} -- 1 -- {5,1,2,3,4}
	    	
	    	// copy the last one to the first
	    	// a, [4], result, 0, 1 --{5}
	    	System.arraycopy(a, length-shiftAmount, result, 0, shiftAmount);
	    	System.out.println("Result after 1st copy: "+Arrays.toString(result));
	    	// fill out the rest with the a[first-rest]
	    	// a, [0], result, 1, 4
	    	System.arraycopy(a, 0, result, shiftAmount, length-shiftAmount);
	    	System.out.println("Result after 1st copy: "+Arrays.toString(result));
	    	
	    	return result;
	    	
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	    	int[] list = {1,2,3,4,5};
	    	System.out.println(Arrays.toString(rotLeftSolutuionWithArrayCopy(list, 2)));
	    }
	}

