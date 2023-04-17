package DS;

import java.util.Stack;

public class ValidParetheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String  s = "([)]";
		String s1="[]";
		System.out.println(isValid(s1));
	}

	//as using stack, so space and time complexity is o(n)
	public static  boolean isValid(String s) {
		if(s.length() %2 != 0) return false;
		
		Stack<Character> st = new Stack();
		for(char c: s.toCharArray()) {
			if(c=='(' || c=='{' || c=='[') {
				st.push(c);
			} else if(c ==')' && !st.isEmpty() && st.peek()=='(') {
				st.pop();
			}
			else if(c =='}' && !st.isEmpty() && st.peek()=='{') {
				st.pop();
			}
			else if(c ==']' && !st.isEmpty() && st.peek()=='[') {
				st.pop();
			}
		}
		return st.isEmpty();
	}
}
