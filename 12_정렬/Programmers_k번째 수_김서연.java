import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; // 3
		int n = 0;
		
		for (int i = 0; i < commands.length; i++) {
			int k = 0;
                                    // new int[4] // new int[1] // new int[7]
			int[] list = new int[commands[i][1] - commands[i][0] + 1]; 
                                     // j = 2 ~ 5 / j = 4 ~ 4 / j= 1 ~ 7
			for (int j = commands[i][0]; j <= commands[i][1]; j++) { 
				list[k++] = array[j - 1]; //array배열은 idx 0부터니까 j-1
			}
			Arrays.sort(list); //오름차순 정렬
			answer[n++] = list[commands[i][2] - 1]; 
		}
		return answer;
    }
}
