import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        //오름차순 정렬
        int count = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        //음식의 스코빌 지수 큐에 넣기
        for (int spicyLevel : scoville) {
            queue.offer(spicyLevel);
        }

        //K보다 낮은 수 있는지 
        while (queue.peek() < K && queue.size() > 1){
            int first = queue.poll();
            int second = queue.poll();

            int mixed = first + (second*2);
            queue.offer(mixed);
            count ++;
        }

        //제일 낮은 지수가 K값 이상이라면 count 리턴 아니라면 -1
        return queue.peek() >= K ? count : -1;
    }
    
}
