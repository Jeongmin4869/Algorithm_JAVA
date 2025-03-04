import java.util.*;

class Main_B2417 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        long s = 0, e = num;
        long mid, result = 0;

        while (s <= e) {  
            mid = (s + e) / 2;

            if ((double)mid >= (double)num/mid) { // 오버플로우
                result = mid;
                e = mid - 1;  
            } else {
                s = mid + 1;
            }
        }

        System.out.println(result);
    }
}
