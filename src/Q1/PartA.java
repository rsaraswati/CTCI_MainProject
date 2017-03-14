/* Author : -
 * Rumela * 
 */
package Q1;

import java.util.HashMap;

public class PartA {
	public static boolean isUnique(String s){
		if(s.length() == 0 || s == null){
			return false;
		}
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for(int i = 0; i<s.length(); i++){
			if(!hm.containsKey(s.charAt(i))){
				hm.put(s.charAt(i), 1);
				System.out.print(hm.keySet());
			}else{
				System.out.println("Duplicates found!");
				return false;
			}
		}
		return true;	
		}
	public static void main(String[] args) {
		String st = new String("abce");
		isUnique(st);
	}
}
