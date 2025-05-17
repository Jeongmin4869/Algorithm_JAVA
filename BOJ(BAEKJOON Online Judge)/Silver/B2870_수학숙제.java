/*정규식 사용*/
import java.util.*;
import java.io.*;
import java.math.*;

class Main_B2870 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        List<BigInteger> list = new ArrayList<>();
        for(int i=0; i<T; i++){
            String[] arr = br.readLine().split("\\D+");
            for(int j=0; j<arr.length; j++){
                if(arr[j].length() > 0) list.add(new BigInteger(arr[j]));
            }
        }
        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}

/*
import java.util.*;
import java.io.*;
import java.math.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        List<BigInteger> list = new ArrayList<>();
        for(int i=0; i<T; i++){
            char[] arr = br.readLine().toCharArray();
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<arr.length; j++){                
                char c = arr[j];                                
                if(Character.isDigit(c)){
                    sb.append(c);
                    if(j == arr.length-1){
                        list.add(new BigInteger(sb.toString()));
                        break;
                    }
                }
                else if (sb.length() > 0){
                    list.add(new BigInteger(sb.toString()));
                    sb = new StringBuilder();    
                }                
            }
        }
        Collections.sort(list);
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        
    }
}
*/
