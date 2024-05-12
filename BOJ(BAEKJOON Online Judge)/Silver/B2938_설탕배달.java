import java.util.*;

public class Main_B2938 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;
        while(N>0){
            if(N%5==0){
                answer += N/5;
                break;
            }
            if(N<3){
                answer = -1;
                break;
            }
            N-=3;
            answer += 1;
        }
        System.out.println(answer);
        sc.close();
    }
}

/*

import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 50000;
        for(int i=0; i<=N/3;i++){
            if((N-i*3)%5==0){
                answer = Math.min(answer,i+(N-i*3)/5);
            }
        }
        if (answer==50000) System.out.println(-1);
        else System.out.println(answer);
        sc.close();
    }
}

*/
