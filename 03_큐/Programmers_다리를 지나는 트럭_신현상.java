import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        // [트럭이 다리에서 빠지는 시간, 트럭 무게]
        Queue<int[]> bridge = new LinkedList<>();

        Queue<Integer> trucks = new LinkedList<>();
        
        for (int w : truck_weights) {
            trucks.add(w);
        }
        
        int cur_weight = 0;
        int time = 0;

        while (!trucks.isEmpty() || !bridge.isEmpty()) {

            // 1. 다리에서 나갈 시간이 된 트럭이 있는지 확인
            if (!bridge.isEmpty() && bridge.peek()[0] <= time) {
                int[] temp = bridge.poll();  // 다리에서 트럭 제거
                cur_weight -= temp[1];       // 다리 위 무게에서 해당 트럭 무게 제거
            }

            // 2. 다음 트럭이 다리에 올라갈 수 있는지 확인
            // 조건: 다리 길이 제한 안 넘고, 무게 제한도 넘지 않을 때
            if (!trucks.isEmpty() && bridge.size() + 1 <= bridge_length && cur_weight + trucks.peek() <= weight) {
                int temp = trucks.poll(); // 트럭 하나 꺼냄
                cur_weight += temp;       // 다리 위 총 무게에 추가
                // 트럭이 다리에서 빠지는 시간 = 현재 시간 + 다리 길이
                bridge.add(new int[]{time + bridge_length, temp});
            }

            time++;
        }

        return time;
    }
}
