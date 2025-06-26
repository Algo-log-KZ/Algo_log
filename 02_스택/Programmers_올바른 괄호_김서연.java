import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            //여는 괄호일 때
            if(c == '('){
                //스택에 push
                stack.push(c);
            }
            
            //닫는 괄호일 때
            if(c == ')'){
                if(stack.size() == 0){
                    //pop할 괄호가 없으면 짝안맞음
                    return false;
                }
                
                else stack.pop();
            }
        }
        //for 순회 후에 stack에 값이 남아있으면 짝 안맞음
        if(stack.size() != 0) answer = false;

        return answer;
    }
}
