class Solution {
    public int[] solution(int[] numbers, String direction) {
        int n = numbers.length, size =  numbers.length;
        int num = direction.equals("right")?1:-1;
        
        int[] answer = new int[size];
        
        for(int i=0; i<size; i++){
            answer[(n+num)%size] = numbers[n%size];
            n += num;
        }
        
        return answer;
    }
}
