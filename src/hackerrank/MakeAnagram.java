package hackerrank;

import java.util.Arrays;

public class MakeAnagram {
	// giving two strings , return the number of digit needed to be removed for the two string to be anagrams.
	

	public static void main(String[] args) {
		String s1="abc";
		String s2="cde";
		System.out.println(makeAnagram(s1, s2));

	}
	
	public static int makeAnagram(String s1, String s2) {
		//abc
		//cdef
		if(s1 == null || s2 == null) throw new NullPointerException("String should not be null");
		if(s1.contains(" ") || s2.contains(" ")) throw new IllegalArgumentException("String should not be empty");
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		int index=0;
		int total=0;
		int size = Math.min(c1.length, c2.length);//3
		while(index<size) {
			if(c1[index]!=c2[index]) {
				total=total+2;
			}
			index++;
		}
		total = total + Math.subtractExact(c1.length, c1.length);
		return total;
	}

}
