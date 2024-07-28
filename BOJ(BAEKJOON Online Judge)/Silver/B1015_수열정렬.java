import java.util.*;

class Main_B1015 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        // value, index
        List<Pair> list = new ArrayList<>();
        for(int i=0; i<N; i++){
            list.add(new Pair(arr[i], i));
        }

        // value기준 오름차 정렬
        list.sort((o1, o2) -> {
            return o1.value - o2.value;
        });

        int[] result = new int[N];
        for(int i=0; i<N; i++){
            result[list.get(i).index] = i;
        }

        for(int i=0; i<N; i++){
            sb.append(result[i] + " ");
        }
        System.out.println(sb);
        
        sc.close();
    }

    static class Pair{
        int value;
        int index;
        Pair(int value, int index){
            this.value = value;
            this.index = index;
        }
    }
}
