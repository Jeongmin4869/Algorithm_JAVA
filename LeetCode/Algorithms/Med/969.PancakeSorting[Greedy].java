class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> list = new ArrayList<>();
        int N = arr.length;        
        for(int max = N; max>1; max--){
            for(int i=0; i<max; i++){
                if(max == arr[i] && i != max-1){
                    change(arr, i);
                    list.add(i+1);
                    change(arr, max-1);
                    list.add(max);
                    break;                    
                }        
            }
        }
        return list;
    }

    public static void change(int[] arr, int idx){
        int[] copy = arr.clone();
        for(int i=0; i<=idx; i++){
            arr[i] = copy[idx-i];
        }
    }
}
