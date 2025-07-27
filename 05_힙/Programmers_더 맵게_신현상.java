import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> minHeap = new PriorityQueue();
        
        for(int scov : scoville) {
            minHeap.add(scov);
        }
        
        while(!minHeap.isEmpty()) {
            
            int firstMinScoville = minHeap.poll();
            
            if(firstMinScoville < K && !minHeap.isEmpty()) {
                int secondMinScoville = minHeap.poll();
                int calScoville = firstMinScoville + (secondMinScoville * 2);
                minHeap.add(calScoville);
                answer ++;
                continue;
            }
            
            if(firstMinScoville < K && minHeap.isEmpty())
                return -1;
        }
        
        return answer;
    }
}
