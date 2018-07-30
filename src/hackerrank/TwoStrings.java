package hackerrank;

import java.util.HashMap;
import java.util.Set;

import com.sun.java_cup.internal.runtime.Scanner;

public class TwoStrings {

	public static void main(String[] args) {
		isSharedSubString("", "");

	}

	private static boolean isSharedSubString(String s1, String s2) {
		// compare the length
		// use the longer one and store in the map
		// search s2 chars if in the map 
		boolean isShared=false;
		char[] c1 =s1.toCharArray();
		char[] c2=s2.toCharArray();
		int l1=c1.length;
		int l2= c2.length;
		int mapSize=0;
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < c1.length; i++) {
			if(map.containsKey(map.get(i))) isShared=true;
			map.put(c1[i], i);
		}
		return isShared;
	}
	
	
	static Set<Character> a;
	static Set<Character> b;
	
	private static boolean isSharedSubStringSolution(String s1, String s2) {
		for (int i = 0; i < array.length; i++) {
			
		}
		
		boolean isShared=false;
	
	}
	

}
