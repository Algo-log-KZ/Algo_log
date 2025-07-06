import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
        HashMap<String, Integer> wholePlay = new HashMap<>();
        HashMap<String, ArrayList<int[]>> memo = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < plays.length; i++) {
            String name = genres[i];
            int play = plays[i];
            wholePlay.put(name, wholePlay.getOrDefault(name, 0) + play);
            
            if(memo.containsKey(name)) {
                memo.get(name).add(new int [] {i, play});
            } else {
                ArrayList<int []> tmp = new ArrayList<>();
                tmp.add(new int[] {i , play});
                memo.put(name, tmp);
            }
        }
        
         List<Map.Entry<String, Integer>> collect = wholePlay.entrySet().stream().sorted((o1, o2) -> {
            return -(o1.getValue().compareTo(o2.getValue()));
        }).collect(Collectors.toList());
        
        for(int i = 0; i < wholePlay.size(); i++){
            Map.Entry<String, Integer> entry = collect.get(i);
            ArrayList<int[]> temp = memo.get(entry.getKey());
            Collections.sort(temp, (o1, o2) -> {
                return -(o1[1] - o2[1]);
            });
            for(int j = 0; j < temp.size(); j++){
                if(j == 2) break;
                int [] check = temp.get(j);
                list.add(check[0]);
            }
        }
        
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
