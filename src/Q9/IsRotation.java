/* Author:-
 * Rumela
 */

package Q9;

public class IsRotation {
	public static boolean isSubString(String s1, String s2){
		if(s1.indexOf(s2)>=0)
			return true;
		else
			return false;
	}
	public static boolean isRotation(String s1, String s2){
		if(s1.length()!=s2.length())
			return false;
		String temp = s1+s2;
		return isSubString(temp, s2);
	}
	public static void main(String[] args) {
		String s1 = "abbac";
		String s2 = "cabba";
		boolean res = isRotation(s1,s2);
		System.out.println(res);

	}

}
