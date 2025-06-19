import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        
        for(int i = 0; i < citations.length; i++) {
            int cnt_cite = citations[i];
            int rest_cite = citations.length - i;
            if(cnt_cite >= rest_cite) {
                answer = rest_cite;
                break;
            }
        }
        return answer;
    }
}
