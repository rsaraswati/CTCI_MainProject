package Q4;

import java.util.ArrayList;
import java.util.Stack;

public class PermOfPalin {
	public static ArrayList<String> permOfPalin(String input){
		Stack<Character> st = new Stack<Character>();
		
		//Base case:
		if (input == null || input.length() == 0)
			return null;
		String s = input;
		int flag = 0;
		//Creating a stack of the input
		for(int i = 0; i<s.length();i ++){
			st.push(s.charAt(i));
		}
		//Checking if string is palindrome
		//For every element in input pop the stack and check if the element is equal to the input element
		for(int i = 0; i<input.length(); i++){
			if(input.charAt(i) == st.pop()){
				flag = 1;
				System.out.print("Match!"+" ");
			}else{
				flag = 0;
			}
		}
		return permutation("",input);
	}		
	private static ArrayList<String> permutation(String prefix, String input) {
		int len = input.length();
		ArrayList<String> a = new ArrayList<String>();
		if(len == 0)
			System.out.println(prefix);
		else{
			for(int i = 0; i<len; i++){
				a=permutation(prefix + input.charAt(i), input.substring(0,i) + input.substring(i+1, len));
			}
		}
		System.out.println(a);
		return null;
	}
	public static void main(String[] args) {
		String s = "A man, a plan, a canal, Panama";
		permOfPalin(s);
		

	}

}
