import java.util.*;
import java.lang.*;
import java.io.*;

class Main_B1296{
    
    public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String love = "LOVE";
        String Ename = br.readLine();
        int N = Integer.parseInt(br.readLine());
        String bestTeam = "";
        long maxScore = 0;
        
        for(int i=0; i<N; i++){
            String Tname = br.readLine();
            int[] arr = new int[4];
            
			for(int j = 0; j < 4; j++) {
				int sum = Ename.length() - Ename.replace(String.valueOf(love.charAt(j)), "").length();
				sum += Tname.length() - Tname.replace(String.valueOf(love.charAt(j)), "").length();
				arr[j] = sum;
			}
			
			long total = 1;
			
			//연산하는 반복문
			for(int j = 0; j < 4; j++) {
				for(int k = (j + 1); k < 4; k++) {
					total *= (arr[j] + arr[k]);
				}
			}

            total %= 100;
            
            if (maxScore < total || (maxScore == total && bestTeam.compareTo(Tname) > 0)) {
                maxScore = total;
                bestTeam = Tname;
            }
        }
        System.out.println(bestTeam);
    }

}
