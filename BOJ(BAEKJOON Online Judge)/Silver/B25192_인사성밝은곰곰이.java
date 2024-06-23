// 1. set

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main_B25192 {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> s = new HashSet<>();
        int count = 0;
        for(int i =0 ; i <N; i++){
            String str = br.readLine();
            if(str.equals("ENTER")){
                s.clear();
            }
            else {
                if(s.add(str)){
                    count += 1;
                }                    
            }
        }
        System.out.println(count);
        br.close();
    }
}

/*
// 2. Map

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> m = new HashMap<>();
        int count = 0;
        for(int i =0 ; i <N; i++){
            String str = br.readLine();
            if(str.equals("ENTER")){
                m.clear();
            }
            else {
                if(!m.containsKey(str)){
                    count += 1;
                    m.put(str, 1);
                }
            }
        }
        System.out.println(count);
        br.close();
    }

}

*/
