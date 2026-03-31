class Solution {
    public int[] productExceptSelf(int[] nums) {
        //product except self will be equal to suffix product + prefix product
        int[] ret = new int[nums.length];
        int multiplier = 1;
        for (int i = 0; i < ret.length; i ++){
            if(i == 0){ret[i] = 1;}else{
                ret[i] = nums[i-1] * multiplier;
                multiplier = nums[i-1] * multiplier;
            }
        }
        int suffix = 1;
        for (int i = ret.length-1; i >= 0; i--){
            ret[i] = ret[i] * suffix;
            suffix = nums[i] * suffix;
        }
        return ret;
    }
}  
