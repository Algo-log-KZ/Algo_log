class Solution {
    public int solution(String name) {
        int len = name.length();
        int upDown = 0;
        int leftRight = len - 1;
        
        for(int i=0; i<len; i++) {
            upDown += Math.min(name.charAt(i) - 'A', 'Z' - name.charAt(i) + 1);
            
            int next = i + 1;
            while (next < len && name.charAt(next) == 'A') {
                next++;
            }
            
            leftRight = Math.min(leftRight, Math.min((i + len - next + i), (i +len-next + len - next)));
        }
        
        return upDown + leftRight;
    }
}
