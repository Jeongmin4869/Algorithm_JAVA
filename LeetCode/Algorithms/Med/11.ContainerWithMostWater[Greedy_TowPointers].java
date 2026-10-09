class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int N = height.length;
        int left = 0;
        int right = N-1;

        while(left < right){
            int minheight = Math.min(height[right],height[left]);
            max = Math.max(minheight * (right - left), max);
            if(height[left] < height[right]) left += 1;
            else right -= 1;
        }

        return max;

    }
}

/*
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int N = height.length;
        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                int minheight = Math.min(height[i], height[j]);
                max = Math.max(max, (j-i) * minheight);
            }
        }
        return max;
    }
}
*/
