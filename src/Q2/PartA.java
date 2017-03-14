/* Author:-
 * Rumela
 */
package Q2;

import java.util.Arrays;

public class PartA {
	public static boolean checkPermutaion(String s1, String t){
		if (s1.length() != t.length()) return false; 
		if((s1 == null || t == null)|| (s1 == null && t == null)) return false;
		if (s1.length() == 0 || t.length() == 0) return false;
		char[] c1 = s1.toCharArray();
		char[] c2 = t.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		return Arrays.equals(c1, c2);
	}
	public static void main(String[] args){
		String[][] s = {{"news", "zees"}, {"cars", "sar"}, {"", ""},{"ballon","llabon"}};
		for(String[] pair : s){
		String s1 = pair[0];
		String s2 = pair[1];
		boolean isPermutation = checkPermutaion(s1, s2);
		System.out.println(s1+" "+ s2+" is "+ isPermutation);
		}
	}
}

