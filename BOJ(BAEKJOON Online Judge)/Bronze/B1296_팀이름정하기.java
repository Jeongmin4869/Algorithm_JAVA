import java.util.*;
import java.io.*;

class Main_B1286 {
    
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String love = "LOVE";
        String Ename = br.readLine();
        int N = Integer.parseInt(br.readLine());
        String bestTeam = "";
        long maxScore = -1; // 초기값 설정 중요
        
        for(int i=0; i<N; i++){
            String Tname = br.readLine();
            long[] arr = new long[4];
            
			for(int j = 0; j < 4; j++) {
				long sum = Ename.length() - Ename.replace(String.valueOf(love.charAt(j)), "").length();
				sum += Tname.length() - Tname.replace(String.valueOf(love.charAt(j)), "").length();
				arr[j] = sum;
			}
			
			long total = 1;
			
			//연산하는 반복문
			for(int j = 0; j < 3; j++) {
				for(int k = (j + 1); k < 4; k++) {
					total *= (arr[j] + arr[k])%100;
				}
			}

            total %= 100;
            
            if (maxScore < total || (maxScore == total && bestTeam.compareTo(Tname) >= 0)) {
                maxScore = total;
                bestTeam = Tname;
            }
        }
        System.out.println(bestTeam);
    }

}
