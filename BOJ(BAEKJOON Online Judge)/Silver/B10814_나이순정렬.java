import java.util.*;
class Person{
    int age;
    String name;
    
    Person(int age, String name){
        this.age = age;
        this.name = name;
    }
}
public class Main_B10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
        StringBuilder sb = new StringBuilder();
        int N = sc.nextInt();
        
        Person[] arr = new Person[N];
        
        for(int i=0; i<N; i++){
            int age = sc.nextInt();
            String name = sc.next();
            arr[i] = new Person(age, name);
        }
        
        Arrays.sort(arr, (o1,o2)->{ return o1.age - o2.age; });
        
        for(Person a : arr){
            sb.append(a.age).append(" ").append(a.name).append("\n");
        }
           
        System.out.println(sb);
        
        sc.close();
    }
    
}
