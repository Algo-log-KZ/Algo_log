import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        
        //정렬
        Arrays.sort(citations);
        //[0,1,3,5,6]
        int answer = 0;
        
        for(int i=0; i< citations.length; i++){
            int h = citations.length - i;
            
            if(citations[i]>=h){
                answer = h;
                break;
            }
        }
    
        
        return answer;
        
    }
}


//h-index.. n편중 h번이상 인용된 논문이 h편이상 나머지가 h번이하 인용
//citations는 인용횟수
//citations.length - 논문개수
