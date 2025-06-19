import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int commandLen = commands.length;
        
        int[] answer = new int[commandLen];
        
        for(int i = 0; i < commandLen; i++) {
            int startIdx = commands[i][0];
            int endIdx = commands[i][1] ;
            int searchIdx = commands[i][2];
            
            int arrLen = endIdx - startIdx + 1;
            
            int[] sliceArr = new int[arrLen];
            int idx = 0;
            
            for(int j = startIdx - 1; j < endIdx; j++) {
                sliceArr[idx] = array[j];
                idx++;
            }
            
            bubleSort(sliceArr);
            
            answer[i] = sliceArr[searchIdx - 1];
        }
        return answer;
    }
    
    private void bubleSort(int[] arr) {
		for(int i = 0; i <arr.length; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					swap(arr, j, j+1);
				}
			}
		}
	}
    
    private static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}
