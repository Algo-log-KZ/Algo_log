import java.util.*;

class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        
        PriorityQueue<Integer> minQ = new PriorityQueue<>();
        PriorityQueue<Integer> maxQ = new PriorityQueue<>(Collections.reverseOrder());
        
        for(String operation : operations) {
            if(operation.startsWith("I")) {
                int num = Integer.parseInt(operation.split(" ")[1]);
                minQ.offer(num);
                maxQ.offer(num);
            } else {
                if(operation.equals("D -1") && !minQ.isEmpty()) {
                    int num = minQ.poll();
                    maxQ.remove(num);
                } else if(operation.equals("D 1") && !maxQ.isEmpty()) {
                    int num = maxQ.poll();
                    minQ.remove(num);
                }
            }
        }
        
        if(minQ.size() == 1) {
            int num = minQ.poll();
            answer[0] = num;
            answer[1] = num;
        } else if(minQ.size() >= 2) {
            int min = minQ.poll();
            int max = maxQ.poll();
            answer[0] = max;
            answer[1] = min;
        }
        return answer;
    }
}
