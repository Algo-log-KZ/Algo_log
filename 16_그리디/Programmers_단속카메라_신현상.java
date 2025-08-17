import java.util.*;

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        int min = 30000;
        
        List<int[]> arr = new ArrayList<>();
        
        for(int[] r : routes) {
            arr.add(r);
        }
        
        Collections.sort(arr, (o1,o2) -> o1[1] - o2[1]);
        
        for(int[] r: arr) {
            if(min >= r[0] && min <= r[1])
                continue;
            min = r[1];
            answer++;
        }
        return answer;
    }
}
