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
				a[newLocation]=in.nextInt();
			}
	    	
	    }
	    
	    static int[] rotLeftSolutuionWithArrayCopy(int[] a, int shiftAmount) {
	    	
	    	
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String[] nd = scanner.nextLine().split(" ");

	        int n = Integer.parseInt(nd[0]);

	        int d = Integer.parseInt(nd[1]);

	        int[] a = new int[n];

	        String[] aItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int aItem = Integer.parseInt(aItems[i]);
	            a[i] = aItem;
	        }

	        int[] result = rotLeft(a, d);

	        for (int i = 0; i < result.length; i++) {
	            bufferedWriter.write(String.valueOf(result[i]));

	            if (i != result.length - 1) {
	                bufferedWriter.write(" ");
	            }
	        }

	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
	}

