import java.util.*;

class Main_B1919 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int[] al = new int[26];
        for(int i=0; i<str1.length(); i++){
            int index = (int)(str1.charAt(i) - 'a');
            al[index] += 1;
        }

        for(int i=0; i<str2.length(); i++){
            int index = (int)(str2.charAt(i) - 'a');
            al[index] -= 1;
        }

        int sum = 0;
        for(int num : al){
            sum += Math.abs(num);
        }

        System.out.println(sum);
    }
}
