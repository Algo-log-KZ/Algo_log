import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        Stack<Integer> stack = new Stack<>();

        for (int num : arr) {
            if (stack.isEmpty() || num != stack.peek()) {
                stack.push(num);
            }
        }

        answer = stack.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }
}
