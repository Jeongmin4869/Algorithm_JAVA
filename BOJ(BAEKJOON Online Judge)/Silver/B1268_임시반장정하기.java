import java.util.*;
import java.io.*;

class Main_B1268 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] classes = new int[n+1][5+1];
        for(int i=1; i<=n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<=5; j++){
                classes[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        Map<Integer, Integer> student = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) continue;
                for (int year = 1; year <= 5; year++) {
                    if (classes[i][year] == classes[j][year]) {
                        student.put(i, student.getOrDefault(i, 0) + 1);
                        break; // 한 해에 같은 반이라면 더 비교하지 않아도 됨
                    }
                }
            }
        }

        if(student.size() == 0){
            System.out.println(1);
            return; 
        }
        
        List<Integer> keys = new ArrayList<>(student.keySet());
        Collections.sort(keys, (o1, o2) -> {
            if(student.get(o1).equals(student.get(o2)))
                return o1 - o2; 
            return student.get(o2) - student.get(o1);
        });
        
        System.out.println(keys.get(0));
    }
}


/*

2. Stack 활용 -> 메모리를 더 많이 사용함

import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] classes = new int[n+1][5+1];
        for(int i=1; i<=n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=1; j<=5; j++){
                classes[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int max = 0;
        int result = 1;
        for (int i = 1; i <= n; i++) {
            Set<Integer> student = new HashSet<>();
            for (int year = 1; year <= 5; year++) {
                for (int j = 1; j <= n; j++) {
                    if(i==j) continue;
                    if (classes[i][year] == classes[j][year]) {
                        student.add(j);
                    }
                }
            }
            if(student.size()>max){
                max = student.size();
                result = i;
            }
        }
        
        System.out.println(result);
    }
}

*/
