import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        // 우선순위가 높은 순서대로 꺼내기 위해 우선순위 큐 생성
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int num : priorities) {
            queue.add(num);
        }
        
        while(!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                // 현재 우선순위가 가장 높은 우선순위와 같다면
                if (priorities[i] == queue.peek()) {
                    // 해당 우선순위를 Queue에서 제거
                    queue.poll();
                    // answer +1
                    answer++;
                    // 만약 i가 location이 같다면 answer 반환
                    if (i == location) {
                        return answer;
                    }
                }
            }
        }

        return answer;
    }
}
