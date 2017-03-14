/* Author :-
 * Rumela * 
 */
package Q3;

public class Q3 {
	public static String urlify(String s, int trueLen){
		StringBuilder sb = new StringBuilder();
		char[] ch = s.toCharArray();
		//Edge cases
		String res = "False";
		if(s == null || s.length() == 0)
			return res;
		if(trueLen!=s.trim().length())
			return res;
		int spaces = 0, index = 0;
		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i) == ' ')
				spaces++;
			
		}
		if (spaces == 0)
			return res;
		index = trueLen + spaces*2;
		for(int i = trueLen-1; i>=0; i--){
			if(ch[i] == ' '){
				ch[index-1] = '0';
				ch[index-2] = '2';
				ch[index-3] = '%';
				index -= 3;
			}else{
				ch[index-1] = ch[i];
				index--;
			}
		}
		res = sb.append(ch).toString();
		System.out.println(res);
		return res;
	}
	public static void main(String[] args) {
		String test = "This is a good world";
		urlify(test,20);

	}

}
