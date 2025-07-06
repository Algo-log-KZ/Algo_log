import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Map<Integer, Integer> pokets = new HashMap<>();
        for (int num: nums) {
            pokets.put(num, pokets.getOrDefault(num, 0) + 1);
        }
        
        answer = Math.min(pokets.size(), nums.length / 2);
        return answer;
    }
}
