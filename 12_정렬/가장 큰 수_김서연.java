import java.util.Arrays;

class Solution {
    public String solution(int[] numbers) {

        StringBuilder sb = new StringBuilder(); // StringBuilder -> 결과저장

        // int[]을 String[]로 변환
        String[] stringNums = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        Arrays.sort(stringNums, (a, b) -> (b + a).compareTo(a + b)); 
        // 문자열을 더한 값이 큰 순서대로 정렬(내림차순)

        // 만약 가장 큰 값이 "0"이면, 모든 값이 0이므로 "0"을 반환
        if (stringNums[0].equals("0")) {
            return "0";
        }

        // 정렬된 문자열을 순서대로 이어붙이기
        /*
        for (String s : stringNums) {
            sb.append(s);
        }
        */
        Arrays.stream(stringNums)
                .forEach(sb::append);

        // 결과 반환
        return sb.toString();
    }
}
