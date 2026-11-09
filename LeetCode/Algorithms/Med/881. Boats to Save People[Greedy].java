class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int l = 0 ;
        int r = people.length-1;
        int result = 0;
        Arrays.sort(people);
        while(l<=r){
            if(people[l] + people[r] <= limit){
                l += 1; // 가벼운 사람은 조건이 충족할 때 태우기 
            }

            r -= 1; // 무거운 사람은 무조건 태우기
            result += 1;
        }

        return result;
    }
}

/*
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int l = 0 ;
        int r = people.length-1;
        int result = 0;
        Arrays.sort(people);
        while(l<=r){

            if(l == r){
                result += 1;
                break;
            }

            while(people[l]+people[r] > limit){
                result += 1;
                r -= 1;
                if(r <= l) break;
            }
            l += 1;
            r -= 1;
            result += 1;
        }

        return result;
    }
}
*/
