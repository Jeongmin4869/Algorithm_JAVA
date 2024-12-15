import java.util.*;
import java.io.*;

class Main_B1108 {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String L = st.nextToken();
        String R = st.nextToken();

        if(L.length() != R.length()){ // 자릿수가 다를 경우 8의 갯수가 0인경우가 최소
            System.out.println(0);
            return;
        }

        int count = 0;
        for(int i=0; i<L.length(); i++){
            if(L.charAt(i) != R.charAt(i)) // 두 자리 수가 다르면 더이상 비교할 필요가 없음
                break;
            if(L.charAt(i) == '8')
                count += 1;
        }

        System.out.println(count);
        
    }

}


/*

// 시간초과 

import java.util.*;
import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long L = Long.parseLong(st.nextToken());
        long R = Long.parseLong(st.nextToken());

        long count = checkEight(L);
        for(Long i=L+1; i<=R; i++){
            count = Math.min(checkEight(i),  count);
        }

        System.out.println(count);
        
    }

    public static Long checkEight(long num){
        long count = 0;
        while(num > 0){
            if(num%10==8){
                count += 1;
            }
            num /= 10;
        }
        return count;
    }

}



*/
