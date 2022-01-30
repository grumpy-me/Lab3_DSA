package com.gl.logic;

import java.util.Stack;

public class BalancedBrackets {

	// static function
	// args - bracket expression
	// return - Boolean - true or false
	
	public static Boolean isBalanced(String exp) {
		
		Stack<Character> st = new Stack<Character>();
		
		char[] ch = exp.toCharArray();
		
		for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(' || ch[i] == '{' || ch[i] == '[') {
            	st.push(ch[i]);
            	continue;
            }

            switch (ch[i]) {
            case ')':
                 
                if (st.peek() == '(') {
                	st.pop();
                	break;
                }else {
                	return false;
                }
     
            case '}':
     
            	 if (st.peek() == '{') {
                 	st.pop();
                 	break;
                 }else {
                 	return false;
                 }
     
            case ']':
     
            	 if (st.peek() == '[') {
                 	st.pop();
                 	break;
                 }else {
                 	return false;
                 }
            }
            
        }
		
		return st.empty();
		
	}

}
