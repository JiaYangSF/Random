package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/*bacdc and dcbac are anagrams, but bacdc and dcbad are not.
For example, if  and , we can delete  from string  and  from string  so that both 
remaining strings are and  which are anagrams.

Print a single integer denoting the number of characters you must delete to make the two strings anagrams of each other.

Sample Input

cde
abc
Sample Output

4
Explanation

We delete the following characters from our two strings to turn them into anagrams of each other:

Remove d and e from cde to get c.
Remove a and b from abc to get c.*/

public class Anagrams {


	    // Complete the makeAnagram function below.
	    static int makeAnagram(String a, String b) {

	    	return 0;
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        String a = scanner.nextLine();

	        String b = scanner.nextLine();

	        int res = makeAnagram(a, b);

	        bufferedWriter.write(String.valueOf(res));
	        bufferedWriter.newLine();

	        bufferedWriter.close();

	        scanner.close();
	    }
	}
