import java.util.*;

public class Main_B2750 {

    int arr[];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }

        selection(arr, N);
        bubble(arr, N);
        insertion(arr, N);

        for(int num : arr){
            System.out.println(num);
        }
        
        sc.close();
    }

    /* 1. 선택정렬 : 배열에서 해당 자리를 이미 선택하고 그 자리에 오는 값을 찾는 것 */ 
    private static void selection(int[] arr, int N){
        int temp;
        for(int i=0; i<N-1; i++){
            int indexMin = i;
            for(int j=i+1; j<N; j++){
                if(arr[indexMin]>arr[j]) indexMin = j;
            }
            temp = arr[i];
            arr[i] = arr[indexMin];
            arr[indexMin] = temp;
        }
    }
    
    /* 2. 버블정렬 : 배열 내의 인접한 두개의 Index를 비교하여 더 큰 숫자를 뒤로 보내는 정렬 */ 
    private static void bubble(int[] arr, int N){
        int temp;
        for(int i=0; i<N; i++){
            for(int j=0; j<N-i-1; j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    /* 3. 삽입정렬 : 기준이 되는 숫자와 그 왼쪽에 있는 배열들을 비교하여 조건에 맞게 정렬하는 방법 */ 
    public static void insertion(int[] arr, int N){
        for(int i=1; i<N; i++){
            int num = arr[i]; // 기준
            int j;
            for(j=i-1; j>=0; j--){
                if(arr[j] > num){
                    arr[j+1] = arr[j]; // 이전 원소를 한칸씩 미룬다 
                }
                else break;
            }
            arr[j+1] = num;
        }
    }
    
}
