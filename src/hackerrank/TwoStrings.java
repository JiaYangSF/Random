package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class TwoStrings {

	public static void main(String[] args) {
		System.out.println(isSharedSubString("b", "huc"));//true

	}

	private static boolean isSharedSubString(String s1, String s2) {
		char[] allChar="abcdefghijklmnopqrstuvwxyz".toCharArray();
		Map stringMap = new HashMap<>();
		char[] c1= s1.toCharArray();
		char[] c2= s2.toCharArray();
		int index=0;
		for(char c:allChar) {
			stringMap.put(c, -1);
		}
		
		for(char c:c1) {
			stringMap.put(c, index);
		}
		int i=0;
		for(char c:c2) {
			while(i<allChar.length-1) {
				if(stringMap.containsValue(-1)) {
					return false;
				}
				i++;
			}
		}
		return true;
		
	}
}
