import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        for(String c : completion) {
            map.put(c, map.get(c) - 1);
        }
        
        for (String key : map.keySet()) {
            // 만약 Value 값이 0이 아닌 key(참가자 이름)이 있는 경우
            if (map.get(key) != 0) {
                // answer에 Key 값 저장
                answer = key;
            }
        }
        return answer;
    }
}
