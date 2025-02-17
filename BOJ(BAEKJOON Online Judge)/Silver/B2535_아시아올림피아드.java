/*
import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<Integer, int[]> m = new HashMap<>();
        StringTokenizer st;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int city = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            int score = Integer.parseInt(st.nextToken());
            m.put(score, new int[]{city, num});
        }

        List<Integer> key = new ArrayList<>(m.keySet());
        Collections.sort(key, Collections.reverseOrder());
        int count = 0;
        int[] wincount = new int[101];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            int city = m.get(key.get(i))[0];
            int num = m.get(key.get(i))[1];

            if(wincount[city] == 2) continue;
            wincount[city] += 1;
            
            sb.append(city + " " + num ).append("\n");
            count += 1;
            if(count == 3) break;
        }
        System.out.println(sb);
    }
}

*/

import java.util.*;
import java.io.*;

class Main_B2535 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<int[]> list = new ArrayList<>();
        StringTokenizer st;
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int city = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            int score = Integer.parseInt(st.nextToken());
            list.add(new int[] {score, city, num});
        }

        list.sort((o1, o2) -> Integer.compare(o2[0], o1[0]));
        int count = 0;
        int[] wincount = new int[101];
        StringBuilder sb = new StringBuilder();
        for(int[] arr : list){
            int city = arr[1];
            int num = arr[2];

            if(wincount[city] == 2) continue;
            wincount[city] += 1;
            
            sb.append(city + " " + num ).append("\n");
            count += 1;
            if(count == 3) break;
        }
        System.out.println(sb);
    }
}
