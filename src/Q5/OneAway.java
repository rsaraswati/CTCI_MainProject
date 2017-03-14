/* Author :-
 * Rumela * 
 */
package Q5;

public class OneAway {
	
	public static boolean checkEdits(String s1, String s2){
		
		int len1 = s1.length();
		int len2 = s2.length();
		//Base cases
		if(len1 == 0 || len2 == 0)
			return false;
		if(len1 >= len2+2 || len2 >= len1+2){
			return false;
		}
		if(s1 == s2)
			return true;
		//Other bases cases can be added to check if dictionary word
		
		//Check for replace
		if(len1 == len2){
			return checkEditsReplace(s1,s2);
		}
		if(len1 + 1 == len2){
			return checkEditsInsert(s1,s2);
		}
		if(len1 - 1 == len2){
			return checkEditsInsert(s2,s1);
		}
		return false;
	}
	
	private static boolean checkEditsInsert(String s1, String s2) {
		int index1 = 0;
		int index2 = 0;
		while (index1 < s1.length() && index2 < s2.length()) {
			if (s1.charAt(index1) != s2.charAt(index2)) {
				if (index1 != index2) {
					return false;
				}		
				index2++;
			} else {
				index1++;
				index2++;
			}
		}
		return true;
	}

	private static boolean checkEditsReplace(String s1, String s2) {
		int count = 0;
		for(int i = 0; i<s1.length(); i++){
			if(s1.charAt(i)!=s2.charAt(i)){
				count++;
			}
		}
		if(count > 2){
			System.out.println("More than 1 character replaced !");
			return false;
		}else if(count == 0){
			System.out.println("No characer replaced");
		    return true;
		}else{
			System.out.println("1 character replaced");
			return true;
		}
	}
	public static void main(String[] args) {
		String s1 = "pale";
		String s2 = "bake";
		boolean res = checkEdits(s1,s2);
		System.out.println(res);

	}
}
