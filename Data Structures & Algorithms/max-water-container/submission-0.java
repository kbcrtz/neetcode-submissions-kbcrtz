class Solution {
    public int maxArea(int[] height) {
        //pointer left and pointer right
        //calculate water stored aka area of space between both lines
        //brute force would be for each i, check the right values, this would be o(n^2) or o(n log n)
        //we store the max value and update it if any other areas are greater
        int max = 0;
        int heightNeeded = 0;
        for(int i = 0; i < height.length; i ++){
            if(height[i] < heightNeeded || (i > 0 && height[i] < height[i-1])){
                continue;
            }
            int left = i;
            int right = height.length - 1;
            while(left < right){
                int distance = right - left;
                int tallness = Math.min(height[left], height[right]);
                int area = distance * tallness;
                if(area > max){
                    max = area;
                    heightNeeded = tallness;
                }
                right --;
                while(left < right && height[right] < heightNeeded){
                    right--;
                }
            }
        }
        return max;
    }
}