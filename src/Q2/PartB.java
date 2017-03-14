/* Author :-
 * Rumela
 */
package Q2;

public class PartB {
		
		public static boolean permutation(String s, String t) {
			if (s.length() != t.length()) return false; 
			if((s == null || t == null)|| (s == null && t == null)) return false;
			if (s.length() == 0 || t.length() == 0) return false; 
			
			int[] c = new int[128]; 
			for (int i = 0; i < s.length(); i++) {
				c[s.charAt(i)]++;
				System.out.print(c[s.charAt(i)]+"\n");
			}
			for (int i = 0; i < t.length(); i++) {
				c[t.charAt(i)]--;
			    if (c[t.charAt(i)] < 0) {
			    	return false;
			    }
			}
			  
			return true;
		}
		
		public static void main(String[] args) {
			String[][] pairs = {{"news", "zees"}, {"cars", "sar"}, {"", ""},{"ballon","llabon"}};
			for (String[] pair : pairs) {
				String word1 = pair[0];
				String word2 = pair[1];
				boolean check = permutation(word1, word2);
				System.out.println(word1 + ", " + word2 + ": " + check);
			}
		}
	}

