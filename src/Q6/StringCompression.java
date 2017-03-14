/* Author:-
 * Rumela
 */

package Q6;

public class StringCompression {
	public static String compressString(String c){
		StringBuilder sb = new StringBuilder();
		int count = 0;
		
		for(int i = 0; i<c.length(); i++){
			count++;
			if(i + 1 >= c.length() || c.charAt(i)!=c.charAt(i+1)){
				sb.append(c.charAt(i));
				sb.append(count);
				count = 0;
			}
		}
		String s1 = sb.toString();
		System.out.println(s1);
		return s1;
	}
	public static void main(String[] args) {
		String s = "aabbce";
		compressString(s);
	}
}
