package Easy;

import java.util.Stack;

public class validParentheses {
    public boolean Solution(String s) {
        // If the length of the string is odd, it is not valid
        if(s.length() % 2 != 0){
            return false;
        }    
        // Create a stack to store the characters
        Stack<Character> stack = new Stack<Character>();
        for(char c: s.toCharArray()){
            // If the character is an opening bracket, push it to the stack
            if(c == '(' || c == '[' || c == '{'){ 
                stack.push(c);
            }
            else if(c == ')' && !stack.isEmpty() && stack.peek() == '(' ){ 
                stack.pop();
            }
            else if(c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
            else if(c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }
            else{
                return false;
            }
        }
        return stack.isEmpty();
    }
    // Runtime - O(n)
}
