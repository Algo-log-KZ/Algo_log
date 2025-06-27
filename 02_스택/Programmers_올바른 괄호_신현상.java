import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        if(s.charAt(0) == ')') return false;
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0 ; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(')
                stack.push('(');
            else if(stack.empty())
                return false;
            else
                stack.pop();

        }
        if(!stack.empty()) return false;

        return answer;
    }
}
