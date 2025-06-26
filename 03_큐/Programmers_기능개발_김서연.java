import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        ArrayList<Integer> list = new ArrayList<>();
        Queue<Integer> dayQue = new LinkedList<>();
        
        for(int i=0 ; i<progresses.length ; i++){
            if ((100 - progresses[i]) % speeds[i] == 0) {
                dayQue.add((100 - progresses[i]) / speeds[i]);
            } else {
                dayQue.add((100 - progresses[i]) / speeds[i] + 1);
            }
            
        }
        
        int x = dayQue.poll();
        int cnt = 1;
        while(!dayQue.isEmpty()){
            if (x >= dayQue.peek()) {
                cnt++;
                dayQue.poll();
            } else {
                list.add(cnt);
                cnt = 1;
                x = dayQue.poll();
            }
        }
        list.add(cnt);  
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
