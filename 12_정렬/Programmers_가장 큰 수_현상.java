import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        String [] strNumbers = new String[numbers.length];
        
        for(int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(strNumbers, (a,b) -> (b+a).compareTo(a+b));
        
        if(strNumbers[0].equals("0"))
            return "0";
        
        StringBuilder sb = new StringBuilder();
        
        for(String num: strNumbers) {
            sb.append(num);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}
