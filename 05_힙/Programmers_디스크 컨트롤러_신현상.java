import java.util.*;

class Solution {
    public int solution(int[][] jobs) {
        int answer = 0;
        int endTime = 0;

        PriorityQueue<int[]> diskQ = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        PriorityQueue<int[]> jobQ = new PriorityQueue<>(Comparator.<int[]>comparingInt(a -> a[0]).thenComparingInt(a -> a[1]));
        
        Collections.addAll(jobQ, jobs);

        if (!jobQ.isEmpty()) {
            int[] first = jobQ.poll();
            diskQ.offer(first);
            endTime = first[0];
        }

        while (!diskQ.isEmpty()) {
            int[] job = diskQ.poll();
            
            endTime = Math.max(endTime, job[0]);
            endTime += job[1];
            answer += endTime - job[0];

            while (!jobQ.isEmpty() && jobQ.peek()[0] <= endTime) {
                diskQ.offer(jobQ.poll());
            }

            if (diskQ.isEmpty() && !jobQ.isEmpty()) {
                diskQ.offer(jobQ.poll());
            }
        }

        return answer / jobs.length;
    }
}
