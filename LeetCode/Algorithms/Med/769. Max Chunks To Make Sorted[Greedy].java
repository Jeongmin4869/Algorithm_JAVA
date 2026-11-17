class Solution {
    public int maxChunksToSorted(int[] arr) {
        int ck = 0;
        int max = -1;

        for(int i = 0; i < arr.length; i++){
            int num = arr[i];

            // 현재까지 등장한 원소 중 최댓값 갱신
            max = Math.max(max, num);

            // 최댓값과 현재 인덱스가 같으면 Chunk 분리 가능
            if(max == i){
                ck += 1;
            }
        }

        return ck;
    }
}
