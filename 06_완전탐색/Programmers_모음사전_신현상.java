import java.util.*;

public class Solution {
    static List<String> list = new ArrayList<>();
    static final String[] ALPHABAT = {"A", "E", "I", "O", "U"};

    public int solution(String word) {
        generateWords("", 0);
        Collections.sort(list);

        // 단어 위치는 0부터 시작하므로 +1
        return list.indexOf(word) + 1;
    }

    private void generateWords(String current, int depth) {
        if (depth > 5) return;
        
        if (!current.isEmpty()) 
            list.add(current);
        
        for (String alp : ALPHABAT) {
            generateWords(current + alp, depth + 1);
        }
    }
}
