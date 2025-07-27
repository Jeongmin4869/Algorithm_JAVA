import java.util.*;
import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[][] arr = new char[5][4*str.length()+1];

        // 배열 초기화 
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = '.';
                if(i == 2 && j%4==2){
                    arr[i][j] = str.charAt(j/4);
                }
            }
        }
    
        for(int num = 0; num < str.length(); num ++){
            char c = (num+1)%3 == 0 ? '*' : '#'; // 프레임 선택
            for(int i=0; i<5; i++){
                int y1 = Math.abs(2-i); // 왼쪽대각선
                int y2 = 5 - 1 - y1; // 오른쪽대각선
                if(arr[i][num*4+y1] != '*') arr[i][num*4+y1] = c; // 우선순위 
                arr[i][num*4+y2] = c;
            }
        }

        // 출력
        for(int i=0; i<arr.length; i++){
            for(int j=0 ;j<arr[0].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    
        
    }

}
