class Solution {
    public int minSetSize(int[] arr) {
        int N = arr.length;
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for(int num : arr){
            tm.put(num, tm.getOrDefault(num, 0) + 1);
        }

        int[] count = new int[tm.size()];
        List<Integer> list = new ArrayList<>(tm.values());
        Collections.sort(list, Collections.reverseOrder());

        int result = 0;
        int now = 0;
        for(int i=0; i<list.size(); i++){
            now += list.get(i);
            result += 1;
            if(now >= N/2) break;            
        }

        return result;
    }
}
