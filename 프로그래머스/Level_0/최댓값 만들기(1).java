import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0, N = numbers.length;
        Arrays.sort(numbers);
        return Math.max(numbers[0]*numbers[1], numbers[N-1]*numbers[N-2]);
    }
}
